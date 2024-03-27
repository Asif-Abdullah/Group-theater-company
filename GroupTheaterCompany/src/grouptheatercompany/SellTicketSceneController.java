/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grouptheatercompany;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class SellTicketSceneController implements Initializable {

    @FXML
    private Button HomeButton;
    @FXML
    private ComboBox<String> ShowsNameComboBox;
    @FXML
    private DatePicker ShowsDatePicker;
    @FXML
    private TextField PriceTextField;
    @FXML
    private ComboBox<String> TicketComboBox;
    @FXML
    private Button submitButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       ShowsNameComboBox.getItems().addAll("Friends","Lyric","Lost","Arrow");
       TicketComboBox.getItems().addAll("Available","Soldout");
       
        
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

    @FXML
    private void submitButton(MouseEvent event) {
         File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try {
            f = new File("Sell.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
            Sell L = new  Sell(  
                    
              ShowsNameComboBox.getValue(),
              ShowsDatePicker.getValue(),
               Integer.parseInt(PriceTextField.getText()),
               TicketComboBox.getValue());
                
                
                  
           // leaveTextArea.appendText(L.toString()); 
          Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("Warning Alert");
        a.setContentText(L.toString());
        a.setHeaderText(null);
        a.showAndWait(); 
 
            oos.writeObject(L);
             

        } catch (IOException ex) {
          //  Logger.getLogger(MainFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(oos != null) oos.close();
} catch (IOException ex) {
             //   Logger.getLogger(MainFXMLController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
    
    

