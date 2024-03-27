/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grouptheatercompany;

import java.io.File;
import java.io.FileOutputStream;
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
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ArrangeMeetingSceneController implements Initializable {

    @FXML
    private TextField employeeNameTextField;
    @FXML
    private ComboBox<String> meetingTypeComboBox;
    @FXML
    private TextField meetingTitleTextField;
    @FXML
    private TextField MeetingDayAndTimeTextField;
    @FXML
    private TextField meetingVenueTextField;
    @FXML
    private DatePicker meetingDatePicker;

    ArrayList<ArrangeMeeting> MeetingList;
    @FXML
    private Label feedbackLabel;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        MeetingList = new ArrayList<ArrangeMeeting>();
        meetingTypeComboBox.getItems().addAll("Offline", "Online");

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
    private void AddEmployeeMeetingButtonOnClick(ActionEvent event) {
        File a = new File("ArrageMeetingFile.bin");
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            if (a.exists()) {
                fos = new FileOutputStream(a, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(a);
                oos = new ObjectOutputStream(fos);
            }
            ArrangeMeeting p = new ArrangeMeeting(
                    meetingTitleTextField.getText(),
                    meetingDatePicker.getValue(),
                    MeetingDayAndTimeTextField.getText(),
                    meetingTypeComboBox.getValue(),
                    meetingVenueTextField.getText(),
                    employeeNameTextField.getText()
            );
            oos.writeObject(p);
            Alert b = new Alert(Alert.AlertType.INFORMATION);
            b.setTitle("Information Alert");
            b.setHeaderText("Successful!!");
            b.setContentText("New Performer has been added successfully ");
            b.showAndWait();

        } catch (IOException ex) {
            Logger.getLogger(ArrangeMeetingSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(ArrangeMeetingSceneController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
