/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grouptheatercompany;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


public class MainSceneController implements Initializable {

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void AccountsOfficerButtonOnClick(ActionEvent event) throws IOException {
       
        Parent root = FXMLLoader.load(getClass().getResource("AccountsOfficer.fxml"));
        Scene scene2 = new Scene(root);
        //Stage window = new Stage();
        //s2.setScene(scene2);  s2.show();
               
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
        
    }

    @FXML
    private void ProducerButtonOnClick(ActionEvent event) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("Producer.fxml"));
        Scene scene2 = new Scene(root);
        //Stage window = new Stage();
        //s2.setScene(scene2);  s2.show();
               
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
    }

   

  

    @FXML
    private void DirectorButtonOnclick(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Director Dashboard.fxml"));
        Scene scene2 = new Scene(root);
        //Stage window = new Stage();
        //s2.setScene(scene2);  s2.show();
               
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
    }

    @FXML
    private void ProductionManagerButtonOnClick(MouseEvent event) throws IOException {
         Parent root = FXMLLoader.load(getClass().getResource("Production Manager Dashboard.fxml"));
        Scene scene2 = new Scene(root);
        //Stage window = new Stage();
        //s2.setScene(scene2);  s2.show();
               
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
    }

    @FXML
    private void TicketButton(ActionEvent event) throws IOException {
         Parent root = FXMLLoader.load(getClass().getResource("TicketSalesPersonDashBoard.fxml"));
        Scene scene2 = new Scene(root);
        //Stage window = new Stage();
        //s2.setScene(scene2);  s2.show();
               
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
    }

    @FXML
    private void PerformerButton(ActionEvent event) throws IOException {
         Parent root = FXMLLoader.load(getClass().getResource("PerformerDashBoard.fxml"));
        Scene scene2 = new Scene(root);
        //Stage window = new Stage();
        //s2.setScene(scene2);  s2.show();
               
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
    }
    
}
