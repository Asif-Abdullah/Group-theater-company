/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grouptheatercompany;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author JOY SAHA
 */
public class SelectActorController implements Initializable {

    @FXML
    private TextArea actorDetailsTextArea;
    @FXML
    private TextField projectNameTextField;
    @FXML
    private TextField actorNameTextField;
    @FXML
    private TextField actorRoleTextField;
    @FXML
    private TextField salaryTextField;
    @FXML
    private TextField contractNumberTextField;
    @FXML
    private Label showProjectNameLabel;
    @FXML
    private TableView<Actor> tableView;
    @FXML
    private TableColumn<Actor, String> nameColumn;
    @FXML
    private TableColumn<Actor, String> roleColumn;
    @FXML
    private TableColumn<Actor, Float> salaryColumn;
    @FXML
    private TableColumn<Actor, Integer> numberColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        nameColumn.setCellValueFactory(new PropertyValueFactory<Actor,String>("ActorName"));
        roleColumn.setCellValueFactory(new PropertyValueFactory<Actor,String>("ActorRole"));
        salaryColumn.setCellValueFactory(new PropertyValueFactory<Actor,Float>("Salary"));
        numberColumn.setCellValueFactory(new PropertyValueFactory<Actor,Integer>("ContractNumber"));
        
       actorDetailsTextArea.setText("");
       Director d = new Director();
          actorDetailsTextArea.appendText(d.viewActorDetails());
    }    
public boolean valid(){
     if(projectNameTextField.getText().isEmpty()){
          Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("No Project Name Assigned");
        a.setContentText("Please assign a Project Name!");
        a.setHeaderText(null);
        a.showAndWait(); 
        return false;
       }
       if(actorNameTextField.getText().isEmpty()){
          Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("No Name Assigned");
        a.setContentText("Please assign an Actor Name!");
        a.setHeaderText(null);
        a.showAndWait(); 
        return false;
       }
       if(actorRoleTextField.getText().isEmpty()){
          Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("No role Assigned");
        a.setContentText("Please assign an Actor Role!");
        a.setHeaderText(null);
        a.showAndWait(); 
        return false;
       }
       if(salaryTextField.getText().isEmpty()){
          Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("No salary Assigned");
        a.setContentText("Please assign a Salary!");
        a.setHeaderText(null);
        a.showAndWait(); 
        return false;
       }
       if(contractNumberTextField.getText().isEmpty()){
          Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("No Contract Number Assigned");
        a.setContentText("Please assign an Contract Number!");
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
    private void addButtonOnClick(MouseEvent event) throws FileNotFoundException, IOException {
       
         boolean b=valid();
        if(b==true){
            validSalary();
            if(validContractNumber()){
        showProjectNameLabel.setText(projectNameTextField.getText());
        
        
             Director d = new Director();
             d.createAddActor(
                    actorNameTextField.getText(),
                    actorRoleTextField.getText(),
                    Float.parseFloat(salaryTextField.getText()),
                    contractNumberTextField.getText() 
                );
                    actorNameTextField.setText(null);
                    actorRoleTextField.setText(null);
                    salaryTextField.setText(null);
                    contractNumberTextField.setText(null); 
             
             List<Actor> actors = d.viewAddActorList();
         tableView.getItems().clear();
        tableView.getItems().addAll(actors);   
           
        }
    }
    }
       
        
       
    @FXML
    private void createNewButtonOnClick(MouseEvent event) {
         projectNameTextField.setText(null);
            tableView.getItems().clear();
            showProjectNameLabel.setText(null);
            Director d = new Director();
            d.createFinalActorList(projectNameTextField.getText());

    // Delete binary file
    File binaryFile = new File("AddActor.bin");
try {
    Files.deleteIfExists(binaryFile.toPath());
    // show success message
} catch (IOException e) {
    // handle exception
} Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setTitle("Information Alert");
        a.setHeaderText(null);
        a.setContentText("Create Successfully");
        a.showAndWait(); 
    
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

   
}
