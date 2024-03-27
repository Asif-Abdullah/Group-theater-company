/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grouptheatercompany;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author 88017
 */
public class LeaveApplicationSceneController implements Initializable {

    @FXML
    private DatePicker startdaypick;
    @FXML
    private DatePicker enddaypick;
    @FXML
    private ComboBox<String> desgiComboBox;
    @FXML
    private TextField employeeNameTextField;
    @FXML
    private TextField employeeIdNameTextField;
    @FXML
    private TextField shortdescripTextField;

    private ArrayList<EmployeeLeaveApplication> EmployeeLeave;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        EmployeeLeave = new ArrayList<EmployeeLeaveApplication>();

        desgiComboBox.getItems().addAll("Senior Account Officer", "Jnuior Account Officer", "Senior Dircetor", "Senior Dircetor",
                "Senior Performer", "Senior Performer", "Senior Event Cordinator", "Senior Event Cordinator");
    }

    @FXML
    private void sendButtonOnClick(ActionEvent event) {
        /* 
        File f = null;
        FileWriter fw = null;
        FileChooser fc = null;
        
        try{
         f =   new File ("Accountofficerleave.txt");
           if(f.exists()) fw = new FileWriter(f,true);
           else fw = new FileWriter(f);
           
           fw.write(
                   employeeNameTextField.getText()+","
                   +employeeIdNameTextField.getText()+","
                   +desgiComboBox.getValue()+","
                   +startdaypick.getValue()+","
                   +enddaypick.getValue()+","
                   +shortdescripTextField.getText()+"\n"
          
           );
           
           
        }
        catch (IOException ex) {
            Logger.getLogger(EmployeeSalarySceneController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(fw != null) fw.close();
            } catch (IOException ex) {
                Logger.getLogger(EmployeeSalarySceneController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setTitle("Information Alert");
        a.setHeaderText("Successful!!");
        a.setContentText("leave application has been sent successfully ");
        a.showAndWait();
         */
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) throws IOException {
         Parent scene2;
        scene2 = FXMLLoader.load(getClass().getResource("AccountsOfficer.fxml"));
        Scene scene3 = new Scene(scene2);      
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene3);
        window.show();
    }

    @FXML
    private void sendButtonOnClickBinary(ActionEvent event) {

        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            f = new File("LeaveApplicationObjects.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            EmployeeLeaveApplication e = new EmployeeLeaveApplication(
                    employeeNameTextField.getText(),
                    Integer.parseInt(employeeIdNameTextField.getText()),
                    desgiComboBox.getValue(),
                    startdaypick.getValue(),
                    enddaypick.getValue(),
                    shortdescripTextField.getText()
            );
            oos.writeObject(e);
            

        } catch (IOException ex) {
            Logger.getLogger(LeaveApplicationSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(LeaveApplicationSceneController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setTitle("Information Alert");
        a.setHeaderText("Successful!!");
        a.setContentText("leave application has been sent successfully ");
        a.showAndWait();
    }

}
