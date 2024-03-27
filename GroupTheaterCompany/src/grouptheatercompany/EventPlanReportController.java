/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grouptheatercompany;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author JOY SAHA
 */
public class EventPlanReportController implements Initializable {

    @FXML
    private RadioButton addNodeRadioButton;
    @FXML
    private RadioButton previousNoteRadioButton;
    @FXML
    private BorderPane borderPane;
    @FXML
    private BorderPane borderPane2;
    private ToggleGroup tg;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
 
    private void loadCreateNew(String ui) {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource(ui+".fxml"));
            borderPane.setTop(root);
        } catch (IOException ex) {
            //Logger.getLogger(viewTicketsSalesReportController.class.getName()).log(Level.SEVERE, null, ex);
        }
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

    @FXML
    private void LoadButtonOnClick(MouseEvent event) {
           if(addNodeRadioButton.isSelected()){
            
          loadCreateNew("");
      }
        else if (previousNoteRadioButton.isSelected()){
            
          loadCreateNew(" ");
      }
    }
    
}
