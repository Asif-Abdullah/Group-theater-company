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
import java.util.ArrayList;
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
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class LeaveApplicationController implements Initializable {

    @FXML
    private Button HomeButton;
    @FXML
    private TextField EmpIdTxtField;
    @FXML
    private ComboBox<String> DptComboBox;
    @FXML
    private DatePicker SrtLeaveDatePicker;
    @FXML
    private DatePicker EndLeaveDatePicker;
    @FXML
    private Button ApplyButton;
    @FXML
    private TextArea leaveTextArea;
     ArrayList<String> leaveList; 

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        DptComboBox.getItems().addAll("Performer","TicketSalesPerson","Manager","Director");
        leaveList = new ArrayList<String>();
    }    

    @FXML
    private void HomeButton(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("PerformerDashBoard.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();
    }
    
    
     public String viewLeaveApplication(){
        File p = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        String r = null;
        try {
            p = new File("LApplication.bin");
            fis = new FileInputStream(p);
            ois = new ObjectInputStream(fis);
           LeaveApplication rs;
            try{
                while(true){
                    rs = ( LeaveApplication)ois.readObject();
                   if(r==null){
                      r=rs.toString(); 
                   }else{ 
                   r=r+ rs.toString();
                   }
                }
            }
            catch(Exception e){
                
            }           
        } catch (IOException ex) { } 
        finally {
           try {
                if(ois != null) ois.close();
            } catch (IOException ex) { }
        }
        
      return r;
    }
    
    
    
    
    
    
    
    

    @FXML
    private void ApplyButton(MouseEvent event) {
      
        LeaveApplication rs = new LeaveApplication(
                Integer.parseInt(EmpIdTxtField.getText()),
                DptComboBox.getValue(),
                SrtLeaveDatePicker.getValue(),
                EndLeaveDatePicker.getValue()
                   
            );
         rs.toString()
            ;
             Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("Warning Alert");
        a.setContentText(rs.toString());
        a.setHeaderText(null);
        a.showAndWait(); 
        
        
          File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try {
            f = new File("LApplication.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
            
            
            oos.writeObject(rs);

        } catch (IOException ex) {
           // Logger.getLogger(SetRehearsalTimeController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
               // Logger.getLogger(SetRehearsalTimeController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
        
        
         leaveTextArea.setText("");
        
          leaveTextArea.appendText(viewLeaveApplication());
    }
}
    
