package grouptheatercompany;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class ViewLeaveApplicationController implements Initializable {

    private TextField viewTextField;
    @FXML
    private TableView<EmployeeLeaveApplication> tableView;
    @FXML
    private TableColumn<EmployeeLeaveApplication, String> nameColumn;
    @FXML
    private TableColumn<EmployeeLeaveApplication, String> degiColumn;
    @FXML
    private TableColumn<EmployeeLeaveApplication, LocalDate> startingColumn;
    @FXML
    private TableColumn<EmployeeLeaveApplication, LocalDate> endColumn;
    @FXML
    private TableColumn<EmployeeLeaveApplication, String> shortdisColumn;
     ArrayList<EmployeeLeaveApplication> leave;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
         leave = new ArrayList<EmployeeLeaveApplication>();
        nameColumn.setCellValueFactory(new PropertyValueFactory<EmployeeLeaveApplication, String>("name"));
        degiColumn.setCellValueFactory(new PropertyValueFactory<EmployeeLeaveApplication, String>("Desig"));
        startingColumn.setCellValueFactory(new PropertyValueFactory<EmployeeLeaveApplication, LocalDate>("stday"));
        endColumn.setCellValueFactory(new PropertyValueFactory<EmployeeLeaveApplication, LocalDate>("endday"));
        shortdisColumn.setCellValueFactory(new PropertyValueFactory<EmployeeLeaveApplication, String>("levdiss"));
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
    private void ViewLeaveApplicationButtonOnClick(ActionEvent event) {
       

        ObjectInputStream ois = null;
        try {
            EmployeeLeaveApplication lev;
            ois = new ObjectInputStream(new FileInputStream("LeaveApplicationObjects.bin"));
            
            while (true) {
                lev = (EmployeeLeaveApplication) ois.readObject();
                tableView.getItems().add(lev);
            }
        } catch (Exception ex) {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            ex.printStackTrace();
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
    private void ConfirmationButtonOnClick(ActionEvent event) {
        
        //todo code
    }
}
