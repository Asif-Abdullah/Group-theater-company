package grouptheatercompany;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class CreateProjectBudgetSceneController implements Initializable {

    @FXML
    private TextField PerformerCostTextField;
    @FXML
    private TextField ConstructionLaborCostTextField;
    @FXML
    private TextField EquipmentRentalCostTextField;
    @FXML
    private TextField SoundSystemCostTextField;
    @FXML
    private TextField LocationRentTextField;
    @FXML
    private TextField OtherexpensesTextField;
    @FXML
    private TextField ViewBudgetTextField;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void BackButtonOnClick(ActionEvent event) throws IOException {
        Parent scene2;
        scene2 = FXMLLoader.load(getClass().getResource("Producer.fxml"));
        Scene scene3 = new Scene(scene2);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene3);
        window.show();
    }

    @FXML
    private void SendButtonOnClick(ActionEvent event) {
      
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            f = new File("CreateProjectBudget.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            ProjectBudget e = new ProjectBudget(
                    Integer.parseInt(PerformerCostTextField.getText()),
                    Integer.parseInt(ConstructionLaborCostTextField.getText()),
                    Integer.parseInt(EquipmentRentalCostTextField.getText()),
                    Integer.parseInt(SoundSystemCostTextField.getText()),
                    Integer.parseInt(LocationRentTextField.getText()),
                    Integer.parseInt(OtherexpensesTextField.getText())
            );
            oos.writeObject(e);

        } catch (IOException ex) {
            Logger.getLogger(CreateProjectBudgetSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(CreateProjectBudgetSceneController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setTitle("Information Alert");
        a.setHeaderText("Successful!!");
        a.setContentText("successfully Create project");
        a.showAndWait();
    }

    @FXML
    private void PreviewbudgetButtonOnClick(ActionEvent event) {

     
        ViewBudgetTextField.setText("");
        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            f = new File("CreateProjectBudget.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            ProjectBudget emp;
            try {
                ViewBudgetTextField.setText("");
                while (true) {

                    emp = (ProjectBudget) ois.readObject();

                    ViewBudgetTextField.appendText(emp.toString());
                }
            } catch (Exception e) {
                //
            }
            //  viewTextField.appendText(" \n");            
        } catch (IOException ex) {
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException ex) {
            }
        }

    }

}
