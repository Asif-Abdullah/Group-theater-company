/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grouptheatercompany;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
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
public class CreateCrewListController implements Initializable {

    @FXML
    private TextField eventNameTextField;
    @FXML
    private TextField totalNumberCrewMemberTextField;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField contractNumberTextField;
    @FXML
    private TextField salaryTextField;
    @FXML
    private TextArea crewListTextArea;
    @FXML
    private TextField assignDutiesTextField1;
    @FXML
    private DatePicker selectDatePicker;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
  public boolean valid(){
     if(eventNameTextField.getText().isEmpty()){
          Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("No Event Name Assigned");
        a.setContentText("Please assign a Event Name!");
        a.setHeaderText(null);
        a.showAndWait(); 
        return false;
       }
       if(totalNumberCrewMemberTextField.getText().isEmpty()){
          Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("No totalNumberCrewMember Assigned");
        a.setContentText("Please assign a totalNumber!");
        a.setHeaderText(null);
        a.showAndWait(); 
        return false;
       }
       if(nameTextField.getText().isEmpty()){
          Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("No Naame Assigned");
        a.setContentText("Please assign a Name!");
        a.setHeaderText(null);
        a.showAndWait(); 
        return false;
       }
       if(assignDutiesTextField1.getText().isEmpty()){
          Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("No assignDuties Assigned");
        a.setContentText("Please assign a assignDuties!");
        a.setHeaderText(null);
        a.showAndWait(); 
        return false;
       }
       if(selectDatePicker.getValue()==null){
          Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("No dater Assigned");
        a.setContentText("Please assign a Date!");
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
       if(salaryTextField.getText().isEmpty()){
          Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("No Salary Assigned");
        a.setContentText("Please assign a Salary!");
        a.setHeaderText(null);
        a.showAndWait();
        return false;
       }
       
      
       return true;
   }
public void validSalary()
   {
      String salary=salaryTextField.getText();
      try 
		{ 
			Float.parseFloat(salary); 
		}  
     catch (NumberFormatException e)  
		{ 
        
		Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("Warning Alert");
        a.setContentText("ID must be Integer or Float!");
        a.setHeaderText(null);
        a.showAndWait();	
		} 
      
      
   }
 public void validCM()
   {
      String n=totalNumberCrewMemberTextField.getText();
      try 
		{ 
			Integer.parseInt(n); 
		}  
     catch (NumberFormatException e)  
		{ 
        
		Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("Warning Alert");
        a.setContentText("TotalNumber must be Integer or Float!");
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
    private void submitButtonOnClick(MouseEvent event) {
        ProductionManager pm = new ProductionManager(); 
        pm.createCrewList(
        eventNameTextField.getText(),
                Integer.parseInt(totalNumberCrewMemberTextField.getText())
        );
         Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setTitle("Information Alert");
        a.setHeaderText(null);
        a.setContentText("Submit Successfully");
        a.showAndWait(); 
        crewListTextArea.clear();
        //crewListTextArea.appendText(ProductionManager.viewCrewList());
        File binaryFile = new File("AddCrewList.bin");

         binaryFile.delete();
          eventNameTextField.setText(null);
          totalNumberCrewMemberTextField.setText(null);
       
    }

    @FXML
    private void addButtonOnClick(MouseEvent event) {
        boolean b=valid();
        if(b==true){
            validCM();
            validSalary();
            if(validContractNumber()){
        ProductionManager pm = new ProductionManager(); 
        pm.addCrewList(
        nameTextField.getText(),
         assignDutiesTextField1.getText(),
         selectDatePicker.getValue(),
         contractNumberTextField.getText(),
         Float.parseFloat(salaryTextField.getText())
         
         );
        
        nameTextField.setText(null);
        contractNumberTextField.setText(null);
        salaryTextField.setText(null);
        assignDutiesTextField1.setText(null);
        selectDatePicker.setValue(null);

        
       crewListTextArea.setText("");
         crewListTextArea.appendText(pm.viewAddCrewList());
    }
    }
}}
