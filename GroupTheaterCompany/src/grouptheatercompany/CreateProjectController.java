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
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author JOY SAHA
 */
public class CreateProjectController implements Initializable {

    @FXML
    private TextField eventNameTextField;
    @FXML
    private TextField eventPurposeTextField;
    @FXML
    private TextField startTimeTextField;
    @FXML
    private TextField endTimeTextField;
    @FXML
    private TextField venueTextField;
    @FXML
    private TextField budgetTextField;
    @FXML
    private DatePicker selectDatePicker;
    @FXML
    private TableView<Project> tableView;
    
    @FXML
    private TableColumn<Project, String> dateColumn;
    @FXML
    private TableColumn<Project, String> startTimeColumn;
    @FXML
    private TableColumn<Project, String> endTimeColumn;
    @FXML
    private TableColumn<Project, String> venueColumn;
    @FXML
    private TableColumn<Project, String> budgetColumn;
    @FXML
    private TableColumn<Project, String> eventPurposeColumn;
    
    @FXML
    private TableColumn<Project, String> eventNameColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         eventNameColumn.setCellValueFactory(new PropertyValueFactory<Project,String>("EventName"));
         dateColumn.setCellValueFactory(new PropertyValueFactory<Project,String>("Date"));
         startTimeColumn.setCellValueFactory(new PropertyValueFactory<Project,String>("StartTime"));
         endTimeColumn.setCellValueFactory(new PropertyValueFactory<Project,String>("EndTime"));
         venueColumn.setCellValueFactory(new PropertyValueFactory<Project,String>("Venue"));
         budgetColumn.setCellValueFactory(new PropertyValueFactory<Project,String>("Budget"));
         eventPurposeColumn.setCellValueFactory(new PropertyValueFactory<Project,String>("EventPurpose"));
         Director d = new Director();
         List<Project> projects = d.viewProject();
    
        tableView.getItems().addAll(projects); 
    }    

    public static LocalTime convertToLocalTime(String timeString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH-mm-ss-SSS");
        LocalTime time = LocalTime.parse(timeString, formatter);
        return time;
    }
    
    public boolean valid(){
       if(eventNameTextField.getText().isEmpty()){
          Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("No Event Name Assigned");
        a.setContentText("Please assign an Event Name!");
        a.setHeaderText(null);
        a.showAndWait(); 
        return false;
       }
       if(eventPurposeTextField.getText().isEmpty()){
          Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("No event Purpose Assigned");
        a.setContentText("Please assign a event purpose!");
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
    
       if(venueTextField.getText().isEmpty()){
          Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("No Venue Assigned");
        a.setContentText("Please assign a Venue!");
        a.setHeaderText(null);
        a.showAndWait(); 
        return false;
       }
       if(budgetTextField.getText().isEmpty()){
          Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("No Budget Assigned");
        a.setContentText("Please assign a Budget!");
        a.setHeaderText(null);
        a.showAndWait(); 
        return false;
       }
       return true;
   }
    public void validBudget()
   {
      String b=budgetTextField.getText();
      try 
		{ 
			Float.parseFloat(b); 
		}  
     catch (NumberFormatException e)  
		{ 
        
		Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("Warning Alert");
        a.setContentText("Budget must be Float or Integer!");
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
                
                Alert alert = new Alert(Alert.AlertType.WARNING);
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
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("Invalid time format for End Time: " + e.getMessage());
            alert.showAndWait();
        }
    }
   
    
    @FXML
    private void homeSceneOnClicked(MouseEvent event) throws IOException {
           FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Director Dashboard.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();
    }

    @FXML
    private void createButtonOnClick(MouseEvent event) {
        boolean b=valid();
        if(b==true){
        String stimeString = startTimeTextField.getText();
        String etimeString = endTimeTextField.getText();
        validStartTime(stimeString);
        validEndTime(etimeString);
        validBudget();
       
         
        LocalTime stime = convertToLocalTime(stimeString);
        LocalTime etime = convertToLocalTime(etimeString);
            Director d = new Director();
            d.createProject(
                eventNameTextField.getText(),
                eventPurposeTextField.getText(),
                selectDatePicker.getValue(),
                stime,
                etime,
                venueTextField.getText(),
                Float.parseFloat(budgetTextField.getText())
                );
            if(stime.isBefore(etime)){
            eventNameTextField.setText(null);
            eventPurposeTextField.setText(null);
            startTimeTextField.setText(null);
            endTimeTextField.setText(null);
            venueTextField.setText(null);
            budgetTextField.setText(null);
            selectDatePicker.setValue(null);}
    }
    }
    @FXML
    private void ViewButtonOnClick(MouseEvent event) {
      Director d = new Director();  
      List<Project> projects = d.viewProject();
        tableView.getItems().clear();
        tableView.getItems().addAll(projects);      
    }
}
    

