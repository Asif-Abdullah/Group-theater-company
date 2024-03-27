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
public class CreateCastActorListController implements Initializable {

    @FXML
    private TextField actorNameTextField;
    @FXML
    private TextField roleTextField;
    @FXML
    private TextField salaryTextField;
    @FXML
    private TextField contractNumberTextField;
    @FXML
    private TextField notesTextField;
    @FXML
    private TableView<Actor> tableView;
    @FXML
    private TableColumn<Actor, String> actorNameColumn;
    @FXML
    private TableColumn<Actor, String> roleColumn;
    @FXML
    private TableColumn<Actor, String> salaryColumn;
    @FXML
    private TableColumn<Actor, String> contractNumberColumn;
    @FXML
    private TableColumn<Actor, String> notesColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
         actorNameColumn.setCellValueFactory(new PropertyValueFactory<Actor,String>("ActorName"));
         roleColumn.setCellValueFactory(new PropertyValueFactory<Actor,String>("ActorRole"));
         salaryColumn.setCellValueFactory(new PropertyValueFactory<Actor,String>("Salary"));
         contractNumberColumn.setCellValueFactory(new PropertyValueFactory<Actor,String>("ContractNumber"));
         notesColumn.setCellValueFactory(new PropertyValueFactory<Actor,String>("Note"));
         
        ProductionManager pm = new ProductionManager();  
        List<Actor> actors = pm.viewCastActorList();
        tableView.getItems().addAll(actors);
     
        // TODO
    }    
public boolean valid(){
       if( actorNameTextField.getText().isEmpty()){
          Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("No Actor Name Assigned");
        a.setContentText("Please assign an Actor Name!");
        a.setHeaderText(null);
        a.showAndWait(); 
        return false;
       }
       if(roleTextField.getText().isEmpty()){
          Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("No Role Assigned");
        a.setContentText("Please assign a Role!");
        a.setHeaderText(null);
        a.showAndWait(); 
        return false;
       }
      
       
      
       if(salaryTextField.getText().isEmpty()){
          Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("No salary Assigned");
        a.setContentText("Please assign a salary!");
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
       if(notesTextField.getText().isEmpty()){
          Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("No note Assigned");
        a.setContentText("Please assign a note!");
        a.setHeaderText(null);
        a.showAndWait(); 
        return false;
       }
       return true;
   }
   public void validSalary()
   {
      String s=salaryTextField.getText();
      try 
		{ 
			Float.parseFloat(s); 
		}  
     catch (NumberFormatException e)  
		{ 
        
		Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("Warning Alert");
        a.setContentText("Salary must be Float or Integer!");
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
    private void addToCastActorListButtonOnClick(MouseEvent event) {
        boolean b=valid();
        
        if(b==true){
            validSalary();
           if(validContractNumber()){
        ProductionManager pm = new ProductionManager(); 
        pm.createCastActorList(
                actorNameTextField.getText(),
                roleTextField.getText(),
                Float.parseFloat(salaryTextField.getText()),
                contractNumberTextField.getText(),
                notesTextField.getText()
                
        );
        
        actorNameTextField.setText(null);
        roleTextField.setText(null);
        salaryTextField.setText(null);
        contractNumberTextField.setText(null);
        notesTextField.setText(null);
        
         List<Actor> actors = pm.viewCastActorList();
        tableView.getItems().clear();
        tableView.getItems().addAll(actors);
    }
    }
}}
