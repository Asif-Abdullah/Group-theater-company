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
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author JOY SAHA
 */
public class SelectVenueController implements Initializable {

    @FXML
    private TextField timeTextField;
    @FXML
    private TextField numberOfAttendanceTextField;
    @FXML
    private TextField budgetTextField;
    @FXML
    private DatePicker selectDatePicker;
    @FXML
    private TextField locationTextField;
    @FXML
    private TextField venueManagerNameTextField;
    @FXML
    private TextField budget2TextField;
    @FXML
    private TextField capacityTextField;
    @FXML
    private TableView<Venue> tableView;
    @FXML
    private TableColumn<Venue, String> locationColumn;
    @FXML
    private TableColumn<Venue, String> capacityColumn;
    @FXML
    private TableColumn<Venue, String> parkingAccessibilityColumn;
    @FXML
    private TableColumn<Venue, String> managerNameColumn;
    @FXML
    private TableColumn<Venue, String> budgetColumn;
    @FXML
    private RadioButton yesRadioButton;
    @FXML
    private RadioButton noRadioButton;
    @FXML
    private ComboBox<String> typeOfEventComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        typeOfEventComboBox.getItems().addAll("Musical Show","Dance Show","Drama Show","Stand-up comedy","Rehearsal","Casting call","Audition");
        ToggleGroup tg = new ToggleGroup();
        yesRadioButton.setToggleGroup(tg);
        noRadioButton.setToggleGroup(tg);
        
        locationColumn.setCellValueFactory(new PropertyValueFactory<Venue,String>("Location"));
        capacityColumn.setCellValueFactory(new PropertyValueFactory<Venue,String>("Capacity"));
        parkingAccessibilityColumn.setCellValueFactory(new PropertyValueFactory<Venue,String>("ParkingAccessibility"));
        managerNameColumn.setCellValueFactory(new PropertyValueFactory<Venue,String>("VenueManagerName"));
        budgetColumn.setCellValueFactory(new PropertyValueFactory<Venue,String>("Budget"));
        
        ProductionManager pm = new ProductionManager();      
  List<Venue> venues = pm.viewShortListVenue();
         
        tableView.getItems().addAll(venues); 
        
        // tableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }    

    @FXML
    private void homeSceneOnClicked(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Production Manager Dashboard.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();
    }
public static LocalTime convertToLocalTime(String timeString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH-mm-ss-SSS");
        LocalTime time = LocalTime.parse(timeString, formatter);
        return time;
    }

 public boolean validER(){
       if(typeOfEventComboBox.getSelectionModel().isEmpty()){
          Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("No typeOfEvent Assigned");
        a.setContentText("Please assign a typeOfEvent!");
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
      
       if(timeTextField.getText().isEmpty()){
          Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("No Time Assigned");
        a.setContentText("Please assign a Time!");
        a.setHeaderText(null);
        a.showAndWait(); 
        return false;
       }
       
       
       if(numberOfAttendanceTextField.getText().isEmpty()){
          Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("No numberOfAttendanc Assigned");
        a.setContentText("Please assign a numberOfAttendance!");
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
  
   public boolean validSVenue(){
       
       
      
       if(locationTextField.getText().isEmpty()){
          Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("No Location Assigned");
        a.setContentText("Please assign a Location!");
        a.setHeaderText(null);
        a.showAndWait(); 
        return false;
       }
       
       
       if(capacityTextField.getText().isEmpty()){
          Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("No Capacity Assigned");
        a.setContentText("Please assign a Capacity!");
        a.setHeaderText(null);
        a.showAndWait(); 
        return false;
       }
       if(!yesRadioButton.isSelected() && !noRadioButton.isSelected()){
          Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("No Parking Accessibility Assigned");
        a.setContentText("Please select radio button for Parking Accessibility!");
        a.setHeaderText(null);
        a.showAndWait(); 
        return false;
       }
        if(venueManagerNameTextField.getText().isEmpty()){
          Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("No venueManagerName Assigned");
        a.setContentText("Please assign a venue Manager Name!");
        a.setHeaderText(null);
        a.showAndWait(); 
        return false;
       }
         if(budget2TextField.getText().isEmpty()){
          Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("No Budget Assigned");
        a.setContentText("Please assign a Budget!");
        a.setHeaderText(null);
        a.showAndWait(); 
        return false;
       }
       return true;
   }
  
    
   public void validTime(String sTime){
      
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
   public void validNOA()
   {
      String n=numberOfAttendanceTextField.getText();
      try 
		{ 
			Integer.parseInt(n); 
		}  
     catch (NumberFormatException e)  
		{ 
        
		Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("Warning Alert");
        a.setContentText("numberOfAttendance must be Integer!");
        a.setHeaderText(null);
        a.showAndWait();	
		} 
      
      
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
    public void validBudget2()
   {
      String b=budget2TextField.getText();
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
     public void validCapacity()
   {
      String c=capacityTextField.getText();
      try 
		{ 
			Integer.parseInt(c); 
		}  
     catch (NumberFormatException e)  
		{ 
        
		Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("Warning Alert");
        a.setContentText("Capacity must beInteger!");
        a.setHeaderText(null);
        a.showAndWait();	
		} 
      
      
   }
   
    @FXML
    private void createButtonOnClick(MouseEvent event) {
         boolean b=validER();
        if(b==true){
         String timeString = timeTextField.getText();
        
        validTime(timeString);
        validNOA();
        validBudget();
        
        LocalTime time = convertToLocalTime(timeString);
        
        ProductionManager pm = new ProductionManager();
            pm.createEventRequirement(
                typeOfEventComboBox.getValue(),
                selectDatePicker.getValue(),
                time,
                Integer.parseInt(numberOfAttendanceTextField.getText()),
                Float.parseFloat(budgetTextField.getText())
                );
            
            typeOfEventComboBox.setValue(null);
            selectDatePicker.setValue(null);
            timeTextField.setText(null);
            numberOfAttendanceTextField.setText(null);
            budgetTextField.setText(null);
    }
    }
    @FXML
    private void addToShortlistButtonOnClick(MouseEvent event) {
        boolean v=validSVenue();
        if(v==true){
        
       
        validCapacity();
        validBudget2();
        boolean b = false;
        String s = null;
        if(yesRadioButton.isSelected()){
           b=true; 
        }else if(noRadioButton.isSelected()){
        b=false;
        }
        if(b==true){
            s="Yes";
        }
        else if(b==false){
            s="No";
        }
        
        
        
        ProductionManager pm = new ProductionManager();
            pm.createShortListVenue(
                locationTextField.getText(),
                Integer.parseInt(capacityTextField.getText()),
                s,
                venueManagerNameTextField.getText(),
                Float.parseFloat(budget2TextField.getText())
                );
            locationTextField.setText(null);
            capacityTextField.setText(null);
            yesRadioButton.setSelected(false);
            noRadioButton.setSelected(false);
            venueManagerNameTextField.setText(null);
            budget2TextField.setText(null);
            
            
  List<Venue> venues = pm.viewShortListVenue();
         tableView.getItems().clear();
        tableView.getItems().addAll(venues); 
    }
    }
    @FXML
    private void addToFinalVenueButtonOnClick(MouseEvent event) {
        Venue selectedRow = tableView.getSelectionModel().getSelectedItem();
        ProductionManager pm = new ProductionManager();
        
         pm.createFinalVenue(
        selectedRow.getLocation(),
        selectedRow.getCapacity(),
        selectedRow.isParkingAccessibility(),
        selectedRow.getVenueManagerName(),
        selectedRow.getBudget()
         );
         Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setTitle("Information Alert");
        a.setHeaderText(null);
        a.setContentText("Create Successfully");
        a.showAndWait(); 
        
        /*pm.createFinalVenue(
        locationColumn.getCellData(selectedRow),
        Integer.parseInt(capacityColumn.getCellData(selectedRow)),
        parkingAccessibilityColumn.getCellData(selectedRow),
        managerNameColumn.getCellData(selectedRow),
        Float.parseFloat(budgetColumn.getCellData(selectedRow))
         );*/
       
          
    
    
    }
    
}
