/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grouptheatercompany;

import java.io.IOException;
import java.net.URL;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author JOY SAHA
 */
public class SetRehearsalTimeController implements Initializable {

    @FXML
    private TextField rehearsalIdTextField;
    @FXML
    private TextField rehearsalPurposeTextField;
    @FXML
    private TextField startTimeTextField;
    @FXML
    private TextField endTimeTextField;
    @FXML
    private DatePicker selectDatePicker;
    @FXML
    private TextField locationTextField;
    @FXML
    private TextArea showRehearsalTimeTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
   public static LocalTime convertToLocalTime(String timeString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH-mm-ss-SSS");
        LocalTime time = LocalTime.parse(timeString, formatter);
        return time;
    }
   public boolean valid(){
       if(rehearsalIdTextField.getText().isEmpty()){
          Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("No ID Assigned");
        a.setContentText("Please assign an Id!");
        a.setHeaderText(null);
        a.showAndWait(); 
        return false;
       }
       if(rehearsalPurposeTextField.getText().isEmpty()){
          Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("No rehearsal Purpose Assigned");
        a.setContentText("Please assign a rehearsal purpose!");
        a.setHeaderText(null);
        a.showAndWait(); 
        return false;
       }
       if(startTimeTextField.getText().isEmpty()){
          Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("No start time Assigned");
        a.setContentText("Please assign a Start Time!");
        a.setHeaderText(null);
        a.showAndWait(); 
        return false;
       }
       if(endTimeTextField.getText().isEmpty()){
          Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("No end time Assigned");
        a.setContentText("Please assign an End Time!");
        a.setHeaderText(null);
        a.showAndWait();
        return false;
       }
       if(selectDatePicker.getValue()==null){
          Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("No Date Assigned");
        a.setContentText("Please assign a Date!");
        a.setHeaderText(null);
        a.showAndWait(); 
        return false;
       }
       if(locationTextField.getText().isEmpty()){
          Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("No Location Assigned");
        a.setContentText("Please assign a Location!");
        a.setHeaderText(null);
        a.showAndWait(); 
        return false;
       }
       return true;
   }
   public void validId()
   {
      String id=rehearsalIdTextField.getText();
      try 
		{ 
			Integer.parseInt(id); 
		}  
     catch (NumberFormatException e)  
		{ 
        
		Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("Warning Alert");
        a.setContentText("ID must be Integer!");
        a.setHeaderText(null);
        a.showAndWait();	
		} 
      
      
   }
   
    
   public void validStartTime(String sTime){
      
        try 
		{ 
                       // Parse the time string into hours, minutes, seconds, and milliseconds
                String[] parts = sTime.split("-");
                if (parts.length != 4) {
                    throw new Exception("Time format must be HH-mm-ss-SSS");
                }
                int hours = Integer.parseInt(parts[0]);
                int minutes = Integer.parseInt(parts[1]);
                int seconds = Integer.parseInt(parts[2]);
                int milliseconds = Integer.parseInt(parts[3]);
                
               
                if (hours < 0 || hours > 23 ) {
                    throw new Exception("Invalid hours");
                }
                if (minutes < 0 || minutes > 59) {
                    throw new Exception("Invalid Minutes");
                }
                if (seconds < 0 || seconds > 59) {
                    throw new Exception("Invalid Seconds");
                }
                // Check that the milliseconds are within the valid range
                if (milliseconds < 0 || milliseconds > 999) {
                    throw new Exception("Invalid Milliseconds");
                }
                
               
            } catch (Exception e) {
                
                Alert alert = new Alert(AlertType.WARNING);
                alert.setContentText("Invalid time format fot Start Time: " + e.getMessage());
                alert.showAndWait();
            }
        }
       
   
   public void validEndTime(String eTime) {
        try {
            // Parse the time string into hours, minutes, seconds, and milliseconds
            String[] parts = eTime.split("-");
            if (parts.length != 4) {
                throw new Exception("Time format must be HH-mm-ss-SSS");
            }
            int hours = Integer.parseInt(parts[0]);
            int minutes = Integer.parseInt(parts[1]);
            int seconds = Integer.parseInt(parts[2]);
            int milliseconds = Integer.parseInt(parts[3]);

            if (hours < 0 || hours > 23) {
                throw new Exception("Invalid hours");
            }
            if (minutes < 0 || minutes > 59) {
                throw new Exception("Invalid Minutes");
            }
            if (seconds < 0 || seconds > 59) {
                throw new Exception("Invalid Seconds");
            }
            // Check that the milliseconds are within the valid range
            if (milliseconds < 0 || milliseconds > 999) {
                throw new Exception("Invalid Milliseconds");
            }

            
        } catch (Exception e) {
            Alert alert = new Alert(AlertType.WARNING);
            alert.setContentText("Invalid time format for End Time: " + e.getMessage());
            alert.showAndWait();
        }
    }
   
     @FXML
    private void createButtonOnClick(ActionEvent event) throws Exception {
        boolean b=valid();
        if(b==true){
        String stimeString = startTimeTextField.getText();
        String etimeString = endTimeTextField.getText();
        validId();
        validStartTime(stimeString);
        validEndTime(etimeString);
       
        LocalTime stime = convertToLocalTime(stimeString);
        LocalTime etime = convertToLocalTime(etimeString);
        
        Director d = new Director();
        d.createRehearsalSchedule(Integer.parseInt(rehearsalIdTextField.getText()),
                    rehearsalPurposeTextField.getText(),
                    stime,
                    etime,
                    selectDatePicker.getValue(),
                    locationTextField.getText()
                    );   
        if(stime.isBefore(etime)){
        rehearsalIdTextField.setText(null);
        rehearsalPurposeTextField.setText(null);
        startTimeTextField.setText(null);
        endTimeTextField.setText(null);
        selectDatePicker.setValue(null);
        locationTextField.setText(null);}
    }
    }

   
        
    @FXML
    private void homeSceneOnClicked(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Director Dashboard.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();
    }

   @FXML
    private void viewButtonOnClick(ActionEvent event) {
         showRehearsalTimeTextArea.setText("");
         Director d = new Director();
          showRehearsalTimeTextArea.appendText(d.viewRehearsalSchedule());
    }
    

    

    

    
    
}
