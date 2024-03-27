/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grouptheatercompany;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class ManagingCustomerDataController implements Initializable {

    @FXML
    private TextField customerNameTxtFld;
    @FXML
    private TextField contactTxtFld;
    @FXML
    private Button addButton;
    @FXML
    private Button viewButton;
    @FXML
    private TableView<Customer> detailTable;
    @FXML
    private TableColumn<Customer, String> nameColum;
    @FXML
    private TableColumn<Customer, Integer> contactColum;
    @FXML
    private TableColumn<Customer, String> feedBackColum;
    @FXML
    private Button homeButton;
    @FXML
    private TextField feedBackTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        nameColum.setCellValueFactory(new PropertyValueFactory<Customer,String>("CustomerName"));
        contactColum.setCellValueFactory(new PropertyValueFactory<Customer,Integer>("ContactNumber"));
        feedBackColum.setCellValueFactory(new PropertyValueFactory<Customer,String>("CustomerFeedback"));
       
    }    

    @FXML
    private void AddButton(MouseEvent event) {
         File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try {
            f = new File("Customer.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
             Customer newActor = new Customer(  
                    customerNameTxtFld.getText(),
                    Integer.parseInt(contactTxtFld.getText()), 
                    feedBackTextField.getText());
             
             
             Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("Warning Alert");
        a.setContentText(newActor.toString());
        a.setHeaderText(null);
        a.showAndWait(); 
         
        try{
            oos.writeObject(newActor);
        }
        catch(IOException e){
            Alert b = new Alert(Alert.AlertType.WARNING);
          b.setTitle("IO Alert");
        b.setContentText(e.toString());
        b.setHeaderText(null);
        b.showAndWait(); 
        }

        } catch (IOException ex) {
            Logger.getLogger(ManagingCustomerDataController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                Logger.getLogger(ManagingCustomerDataController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
        
        
   
    }
        
    
 
    @FXML
    private void ViewButton(MouseEvent event) {
             ObjectInputStream ois=null;
         try {
            Customer p;
            ois = new ObjectInputStream(new FileInputStream("Customer.bin"));
            p = (Customer) ois.readObject();
            //s.display();
            //detailTable.getItems().clear();
            detailTable.getItems().add(p);
            p = (Customer) ois.readObject();
            detailTable.getItems().add(p);            
            
        } catch (Exception ex) {
            try {
                if(ois!=null)
                    ois.close();
            } 
            catch (IOException e) {
                e.printStackTrace();
            }
            ex.printStackTrace();
        }        
    }    
    
    @FXML
    private void HomeButton(MouseEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("TicketSalesPersonDashBoard.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();
    }
        
    

    }
    

