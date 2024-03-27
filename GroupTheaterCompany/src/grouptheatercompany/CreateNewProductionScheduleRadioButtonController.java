/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grouptheatercompany;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author JOY SAHA
 */
public class CreateNewProductionScheduleRadioButtonController implements Initializable {

    @FXML
    private TextField productNameTextField;
    @FXML
    private TextField quantityTextField;
    @FXML
    private TextField notesTextField;
    @FXML
    private DatePicker endDatePicker;
    @FXML
    private TextField supervisorNameTextField;
    @FXML
    private DatePicker startDatePicker;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
 public boolean valid(){
       if(productNameTextField.getText().isEmpty()){
          Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("No Product Name Assigned");
        a.setContentText("Please assign an Product Name!");
        a.setHeaderText(null);
        a.showAndWait(); 
        return false;
       }
       if(quantityTextField.getText().isEmpty()){
          Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("No Quantity Assigned");
        a.setContentText("Please assign a Quantity!");
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
       if(supervisorNameTextField.getText().isEmpty()){
          Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("No supervisor Name Assigned");
        a.setContentText("Please assign a Supervisor Name!");
        a.setHeaderText(null);
        a.showAndWait(); 
        return false;
       }
       if(notesTextField.getText().isEmpty()){
          Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("No Note Assigned");
        a.setContentText("Please assign a Note!");
        a.setHeaderText(null);
        a.showAndWait(); 
        return false;
       }
       return true;
   }
   public void validQuantity()
   {
      String q=quantityTextField.getText();
      try 
		{ 
			Integer.parseInt(q); 
		}  
     catch (NumberFormatException e)  
		{ 
        
		Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("Warning Alert");
        a.setContentText("Quantity must be Integer!");
        a.setHeaderText(null);
        a.showAndWait();	
		} 
      
      
   }
   
    
    @FXML
    private void submitButtonOnClick(MouseEvent event) {
       boolean b=valid();
        if(b==true){
            validQuantity();
        ProductionManager pm = new ProductionManager(); 
        pm.createProductionSchedule(
                productNameTextField.getText(),
                Integer.parseInt(quantityTextField.getText()),
                startDatePicker.getValue(),
                endDatePicker.getValue(),
                supervisorNameTextField.getText(),
                notesTextField.getText()    
            );
         if(startDatePicker.getValue().isBefore(endDatePicker.getValue())){
        productNameTextField.setText(null);
        quantityTextField.setText(null);
        notesTextField.setText(null);
        endDatePicker.setValue(null);
        supervisorNameTextField.setText(null);
        startDatePicker.setValue(null);}
    }
    }
}
