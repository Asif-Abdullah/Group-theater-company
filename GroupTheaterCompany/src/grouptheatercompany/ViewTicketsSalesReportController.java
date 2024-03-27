/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grouptheatercompany;

import java.io.IOException;
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
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author JOY SAHA
 */
public class ViewTicketsSalesReportController implements Initializable {

    @FXML
    private BorderPane BorderPane;
    @FXML
    private TextArea notesTextArea;
    @FXML
    private TextArea ticketSalesReportTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        notesTextArea.setText("");
        Director d = new Director(); 
          notesTextArea.appendText(d.viewNote());
         
    }    
   
      private void loadAddNote(String ui) {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource(ui+".fxml"));
            BorderPane.setLeft(root);
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
    private void addNoteButtonOnClick(MouseEvent event) throws IOException {
        loadAddNote("addNote");
       
    }


    @FXML
    private void viewReportButtonOnClick(MouseEvent event) {
         
        Director d = new Director();
          ticketSalesReportTextArea.setText("");
         
          ticketSalesReportTextArea.appendText(d.viewTicketSalesreport());
    }
    
}
