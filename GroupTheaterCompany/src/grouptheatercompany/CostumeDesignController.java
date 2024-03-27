/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grouptheatercompany;

import java.io.IOException;
import java.net.URL;
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
public class CostumeDesignController implements Initializable {

    @FXML
    private TextField numberOfCostumeRequiredTextField;
    @FXML
    private TextField designerNameTextField;
    @FXML
    private TextField specificRequirementTextField;
    @FXML
    private DatePicker startDatePicker;
    @FXML
    private TextField eventNameTextField;
    @FXML
    private TextField contractNumberTextField;
    @FXML
    private TextField costumeIdTextField;
    @FXML
    private TableView<CostumeDistribute> tableView;
    @FXML
    private TableColumn<CostumeDistribute, String> eventNameColumn;
    @FXML
    private TableColumn<CostumeDistribute, String> costumeIdColumn;
    @FXML
    private TableColumn<CostumeDistribute, String> performerNameColumn;
    @FXML
    private TableColumn<CostumeDistribute, String> startingDateColumn;
    @FXML
    private TableColumn<CostumeDistribute, String> endingDateColumn;
    @FXML
    private TableColumn<CostumeDistribute, String> contractNumberColumn;
    @FXML
    private DatePicker endDatePicker;
    @FXML
    private TextField performerNameTextField;
    @FXML
    private DatePicker startDatePicker2;
    @FXML
    private DatePicker endDatePicker2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         eventNameColumn.setCellValueFactory(new PropertyValueFactory<CostumeDistribute, String>("EventName"));
         costumeIdColumn.setCellValueFactory(new PropertyValueFactory<CostumeDistribute, String>("CostumeId"));
         performerNameColumn.setCellValueFactory(new PropertyValueFactory<CostumeDistribute, String>("PerformerName"));
         startingDateColumn.setCellValueFactory(new PropertyValueFactory<CostumeDistribute, String>("StartDate"));
         endingDateColumn.setCellValueFactory(new PropertyValueFactory<CostumeDistribute, String>("EndDate"));
         contractNumberColumn.setCellValueFactory(new PropertyValueFactory<CostumeDistribute, String>("ContractNumber"));
         ProductionManager pm = new ProductionManager(); 
         List<CostumeDistribute> cdList = pm.viewCostumeDistributeList();
        tableView.getItems().addAll(cdList); 
    }    
   public boolean validCR(){
     if(numberOfCostumeRequiredTextField.getText().isEmpty()){
          Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("No numberOfCostumeRequired Assigned");
        a.setContentText("Please assign a numberOfCostumeRequired!");
        a.setHeaderText(null);
        a.showAndWait(); 
        return false;
       }
      if(startDatePicker.getValue()==null){
          Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("No Start Date Assigned");
        a.setContentText("Please assign a Start Date!");
        a.setHeaderText(null);
        a.showAndWait();
        return false;
       }
       if(endDatePicker.getValue()==null){
          Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("No End Date Assigned");
        a.setContentText("Please assign a End Date!");
        a.setHeaderText(null);
        a.showAndWait();
        return false;
       }
       if(designerNameTextField.getText().isEmpty()){
          Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("No Designer Name Assigned");
        a.setContentText("Please assign a Designer Name!");
        a.setHeaderText(null);
        a.showAndWait(); 
        return false;
       }
       if(specificRequirementTextField.getText().isEmpty()){
          Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("No specific Requirement Assigned");
        a.setContentText("Please assign a Specific Requirement!");
        a.setHeaderText(null);
        a.showAndWait(); 
        return false;
       }
     
       
      
       return true;
   }
   public boolean validCD(){
     if(eventNameTextField.getText().isEmpty()){
          Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("No Event Name Assigned");
        a.setContentText("Please assign a Event Name!");
        a.setHeaderText(null);
        a.showAndWait(); 
        return false;
       }
     if(costumeIdTextField.getText().isEmpty()){
          Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("No Costume ID Assigned");
        a.setContentText("Please assign a Costume ID!");
        a.setHeaderText(null);
        a.showAndWait(); 
        return false;
       }
     if(performerNameTextField.getText().isEmpty()){
          Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("No Peerformer name Assigned");
        a.setContentText("Please assign a Performer Name!");
        a.setHeaderText(null);
        a.showAndWait(); 
        return false;
       }
      if(startDatePicker2.getValue()==null){
          Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("No Start Date Assigned");
        a.setContentText("Please assign a Start Date!");
        a.setHeaderText(null);
        a.showAndWait();
        return false;
       }
       if(endDatePicker2.getValue()==null){
          Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("No End Date Assigned");
        a.setContentText("Please assign a End Date!");
        a.setHeaderText(null);
        a.showAndWait();
        return false;
       }
       if(contractNumberTextField.getText().isEmpty()){
          Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("No Contract Number Assigned");
        a.setContentText("Please assign a Contract Number!");
        a.setHeaderText(null);
        a.showAndWait(); 
        return false;
       }
       
      
       return true;
   }
public void validNCR()
   {
      String n=numberOfCostumeRequiredTextField.getText();
      try 
		{ 
			Integer.parseInt(n); 
		}  
     catch (NumberFormatException e)  
		{ 
        
		Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("Warning Alert");
        a.setContentText("NumberOfCostumeRequired must be Integer!");
        a.setHeaderText(null);
        a.showAndWait();	
		} 
      
      
   }
public void validCID()
   {
      String n=costumeIdTextField.getText();
      try 
		{ 
			Integer.parseInt(n); 
		}  
     catch (NumberFormatException e)  
		{ 
        
		Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("Warning Alert");
        a.setContentText("NumberOfCostumeID must be Integer!");
        a.setHeaderText(null);
        a.showAndWait();	
		} 
      
      
   }
 public boolean validContractNumber() { 
    String phoneNumberPattern = "^01[947386]\\d{8}$";
    String num = contractNumberTextField.getText();
    if (!num.matches(phoneNumberPattern)) {
        Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("Warning Alert");
        a.setContentText("Contract Number is not Valid!");
        a.setHeaderText(null);
        a.showAndWait();
        return false;
    }return true;
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

    @FXML
    private void createButtonOnClick(MouseEvent event) {
        boolean b=validCR();
        if(b==true){
            validNCR();
            
        ProductionManager pm = new ProductionManager(); 
        pm.createCostumeRequiremenList(
                Integer.parseInt(numberOfCostumeRequiredTextField.getText()),
                startDatePicker.getValue(),
                endDatePicker.getValue(),
                designerNameTextField.getText(),
                specificRequirementTextField.getText()
                
               );
          if(startDatePicker.getValue().isBefore(endDatePicker.getValue())){
                numberOfCostumeRequiredTextField.setText(null);
                startDatePicker.setValue(null);
                endDatePicker.setValue(null);
                designerNameTextField.setText(null);
                specificRequirementTextField.setText(null);}
    }
    }
    @FXML
    private void addToDistributeListButtonOnClick(MouseEvent event) {
       boolean b=validCD();
        if(b==true){
            validCID();
            if(validContractNumber()){
        ProductionManager pm = new ProductionManager(); 
        pm.createCostumeDistributeList(
                eventNameTextField.getText(),
                Integer.parseInt(costumeIdTextField.getText()),
                performerNameTextField.getText(),
                startDatePicker2.getValue(),
                endDatePicker2.getValue(),
                contractNumberTextField.getText()
                
               );
        if(startDatePicker2.getValue().isBefore(endDatePicker2.getValue())){
                eventNameTextField.setText(null);
                costumeIdTextField.setText(null);
                performerNameTextField.setText(null);
                startDatePicker2.setValue(null);
                endDatePicker2.setValue(null);
                contractNumberTextField.setText(null);}
     
        
  List<CostumeDistribute> cdList = pm.viewCostumeDistributeList();
         tableView.getItems().clear();
        tableView.getItems().addAll(cdList); 
    }
    }
}}
