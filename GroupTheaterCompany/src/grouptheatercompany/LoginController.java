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
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class LoginController implements Initializable {

    @FXML
    private TextField loginid;
    @FXML
    private PasswordField loginPassword;
    @FXML
    private ComboBox<String> loginUserComboBox;
    @FXML
    private Label loginTextArea;
    private ArrayList<Integer> Id;
    private ArrayList<String> Pass;
    private ArrayList<String> UserType;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        loginUserComboBox.getItems().addAll("Producer","Accounts Officer","Event Coordinator","Viewer","Director", "production Manager","Tickets Salesperson","Performer");
        
        Id = new ArrayList<>();
        Pass = new ArrayList<>();
        UserType = new ArrayList<>();
        File userFile = new File("Password.txt");
        String data = null;
       try {
            Scanner myReader = new Scanner(userFile);
            while (myReader.hasNextLine()) {
                data = myReader.nextLine();
                String[] arrOfStr = data.split(",",3);
                Id.add(Integer.parseInt(arrOfStr[0]));
                Pass.add(arrOfStr[1]);
                UserType.add(arrOfStr[2]);
            }
        myReader.close();
        } 
        catch (FileNotFoundException e) {
            loginTextArea.setText("An error occurred.");
        } 
        
    }    

    @FXML
    private void LoginButtonOnClick(ActionEvent event) throws IOException {
        if("".equals(loginid.getText())||"".equals(loginPassword.getText())){
                loginTextArea.setText("Input Data");
            }
            else{
                for(int i=0; i<Id.size();i++){
                    if( Id.get(i).equals(Integer.parseInt(loginid.getText()))){
                        if(Pass.get(i).equals(loginPassword.getText())){
                            if(UserType.get(i).equals(loginUserComboBox.getValue())){
                                loginTextArea.setText("Login Successfull");
                                //Producer
                                if("Producer".equals(UserType.get(i))){
                                    Parent scene2;
                                    scene2 = FXMLLoader.load(getClass().getResource("Producer.fxml"));
                                    Scene scene3 = new Scene(scene2);
                                    //Stage window = new Stage();
                                    //s2.setScene(scene2);  s2.show();
               
                                    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
                                    window.setScene(scene3);
                                    window.show();
                                    
                                }
                                
                                //Accounts Officer
                                if("Accounts Officer".equals(UserType.get(i))){
                                    Parent scene2;
                                    scene2 = FXMLLoader.load(getClass().getResource("AccountsOfficer.fxml"));
                                    Scene scene3 = new Scene(scene2);
                                    //Stage window = new Stage();
                                    //s2.setScene(scene2);  s2.show();
               
                                    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
                                    window.setScene(scene3);
                                    window.show();

                                }
                                
                                //Director
                                if("Director".equals(UserType.get(i))){
                                    Parent scene2;
                                    scene2 = FXMLLoader.load(getClass().getResource("Director Dashboard.fxml"));
                                    Scene scene3 = new Scene(scene2);
                                    //Stage window = new Stage();
                                    //s2.setScene(scene2);  s2.show();
               
                                    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
                                    window.setScene(scene3);
                                    window.show();
                                    
                                }
                                
                                //"production Manager"
                                if("production Manager".equals(UserType.get(i))){
                                    Parent scene2;
                                    scene2 = FXMLLoader.load(getClass().getResource("Production Manager Dashboard.fxml"));
                                    Scene scene3 = new Scene(scene2);
                                    //Stage window = new Stage();
                                    //s2.setScene(scene2);  s2.show();
               
                                    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
                                    window.setScene(scene3);
                                    window.show();
                                    
                                }
                                
                                //Performer,
                                if("Performer".equals(UserType.get(i))){
                                    Parent scene2;
                                    scene2 = FXMLLoader.load(getClass().getResource("PerformerDashBoard.fxml"));
                                    Scene scene3 = new Scene(scene2);
                                    //Stage window = new Stage();
                                    //s2.setScene(scene2);  s2.show();
               
                                    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
                                    window.setScene(scene3);
                                    window.show();
                                   
                                }
                                
                                //Tickets Salesperson
                                if("Tickets Salesperson".equals(UserType.get(i))){
                                    Parent scene2;
                                    scene2 = FXMLLoader.load(getClass().getResource("TicketSalesPersonDashBoard.fxml"));
                                    Scene scene3 = new Scene(scene2);
                                    //Stage window = new Stage();
                                    //s2.setScene(scene2);  s2.show();
               
                                    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
                                    window.setScene(scene3);
                                    window.show();
                                    
                                }
                                
                                //
                                if("Viewer".equals(UserType.get(i))){
                                    Parent scene2;
                                    scene2 = FXMLLoader.load(getClass().getResource("xxx.fxml"));
                                    Scene scene3 = new Scene(scene2);
                                    //Stage window = new Stage();
                                    //s2.setScene(scene2);  s2.show();
               
                                    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
                                    window.setScene(scene3);
                                    window.show();
                                    
                                }
                                break;
                            }
                            else{
                                loginTextArea.setText("User Type didn't match");
                                break;
                            }    
                        }
                        else {
                            loginTextArea.setText("Password didn't match");
                            break;
                            }
                    }
                    else{
                        loginTextArea.setText("Try again!! User not found");
                    }
            }

       
        loginid.setText(null);
        loginPassword.setText(null);
        loginUserComboBox.setValue(null);
        }
    }
    
}
