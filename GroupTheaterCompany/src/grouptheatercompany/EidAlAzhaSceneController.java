/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grouptheatercompany;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
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
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author 88017
 */
public class EidAlAzhaSceneController implements Initializable {

    @FXML
    private TextField nameTextField;
    @FXML
    private TextField employeeIdTextField;
    @FXML
    private ComboBox<String> deptComboBox;
    @FXML
    private TextField bonusTextField;
    private TextField ViewTextField;
    @FXML
    private ComboBox<String> DesigComboBox;

    ArrayList<Employee> EmplyList;
    @FXML
    private TableView<Employee> TableView;
    @FXML
    private TableColumn<Employee, String> nameColumn;
    @FXML
    private TableColumn<Employee, Integer> EmployIdColumn;
    @FXML
    private TableColumn<Employee, String> DeeptColumn;
    @FXML
    private TableColumn<Employee, String> DesigColumn;
    @FXML
    private TableColumn<Employee, Integer> BonusColumn;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        EmplyList = new ArrayList<Employee>();
        deptComboBox.getItems().addAll("Accounts", "Dircetor", "Performer", "Event Cordinator");
        DesigComboBox.getItems().addAll("Senior Account Officer", "Jnuior Account Officer", "Senior Dircetor", "Senior Dircetor",
                "Senior Performer", "Senior Performer", "Senior Event Cordinator", "Senior Event Cordinator");
        nameColumn.setCellValueFactory(new PropertyValueFactory<Employee, String>("name"));
        EmployIdColumn.setCellValueFactory(new PropertyValueFactory<Employee, Integer>("id"));
        DeeptColumn.setCellValueFactory(new PropertyValueFactory<Employee, String>("dept"));
        DesigColumn.setCellValueFactory(new PropertyValueFactory<Employee, String>("Desig"));
        BonusColumn.setCellValueFactory(new PropertyValueFactory<Employee, Integer>("salary"));

    }

    @FXML
    private void addBonusButtonOnClick(ActionEvent event) {

        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            f = new File("EidAlAzha.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            Employee E = new Employee(
                    nameTextField.getText(),
                    Integer.parseInt(employeeIdTextField.getText()),
                    deptComboBox.getValue(),
                    DesigComboBox.getValue(),
                    Integer.parseInt(bonusTextField.getText())
            );
            oos.writeObject(E);

        } catch (IOException ex) {
            Logger.getLogger(EidAlAzhaSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(EidAlAzhaSceneController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setTitle("Information Alert");
        a.setHeaderText("Successful!!");
        a.setContentText("Bonus has been added successfully ");
        a.showAndWait();

    }

    @FXML
    private void PreviewAndSendBonusButtonOnClick(ActionEvent event) {
        ObjectInputStream ois = null;
        try {
            Employee emp;
            ois = new ObjectInputStream(new FileInputStream("EidAlAzha.bin"));

            while (true) {

                emp = (Employee) ois.readObject();
                TableView.getItems().add(emp);
            }
        } catch (Exception e1) {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            e1.printStackTrace();
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException ex) {
            }
        }
    }

    @FXML
    private void BackButtonOnClick(ActionEvent event) throws IOException {
         Parent scene2;
        scene2 = FXMLLoader.load(getClass().getResource("AccountsOfficer.fxml"));
        Scene scene3 = new Scene(scene2);      
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene3);
        window.show();
    }

}
