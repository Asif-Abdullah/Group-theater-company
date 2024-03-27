
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
import javafx.scene.control.ComboBox;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;


public class ProducerController implements Initializable {

    @FXML
    private MenuButton ArrangeMeetingMenuButton;
    @FXML
    private MenuItem AddForMeetingButton;
    @FXML
    private MenuItem ViewButton;
    @FXML
    private MenuButton ComplaintMenuButton;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    

    private void AddPerformerListButtonOnClick(ActionEvent event) throws IOException {
        
        Parent scene2;
        scene2 = FXMLLoader.load(getClass().getResource("AddAndViewPerformer.fxml"));
        Scene scene3 = new Scene(scene2);   
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene3);
        window.show();
    }

    @FXML
    private void CreateTheProjectBudgetButtonOnClick(ActionEvent event) throws IOException {
        
        Parent scene2;
        scene2 = FXMLLoader.load(getClass().getResource("CreateProjectBudgetScene.fxml"));
        Scene scene3 = new Scene(scene2);
            
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene3);
        window.show();
    }

    private void ArrangeMeetingButtonOnClick(ActionEvent event) throws IOException {
        
       
        Parent scene2;
        scene2 = FXMLLoader.load(getClass().getResource("ArrangeMeetingScene.fxml"));
        Scene scene3 = new Scene(scene2);
           
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene3);
        window.show();
    }

   

    @FXML
    private void ApproveLeaveApplicationsButtonOnClick(ActionEvent event) throws IOException {
       
        Parent scene2;
        scene2 = FXMLLoader.load(getClass().getResource("ViewLeaveApplication.fxml"));
        Scene scene3 = new Scene(scene2);
       
               
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene3);
        window.show();
    }

    private void ComplaintAndFeedbackButtonOnClick(ActionEvent event) throws IOException {

        Parent scene2;
        scene2 = FXMLLoader.load(getClass().getResource("FeedbackScene.fxml"));
        Scene scene3 = new Scene(scene2);
          
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene3);
        window.show();
    }

    @FXML
    private void MakingPlansForProjectButtonOnClick(ActionEvent event) throws IOException {
       
        Parent scene2;
        scene2 = FXMLLoader.load(getClass().getResource("ProjectPlanScene.fxml"));
        Scene scene3 = new Scene(scene2);
         
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene3);
        window.show();
    }

    @FXML
    private void ApproveProjectDeadlineButtonOnClick(ActionEvent event) throws IOException {
       
        Parent scene2;
        scene2 = FXMLLoader.load(getClass().getResource("ApprovedProject.fxml"));
        Scene scene3 = new Scene(scene2);
       
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene3);
        window.show();
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) throws IOException {
        Parent scene2;
        scene2 = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
        Scene scene3 = new Scene(scene2);
       
               
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene3);
        window.show();
    }

    @FXML
    private void VIewMonthlyReportButtonOnClick(ActionEvent event) throws IOException {
        Parent scene2;
        scene2 = FXMLLoader.load(getClass().getResource("ViewMonthlyReportScene.fxml"));
        Scene scene3 = new Scene(scene2);
       
               
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene3);
        window.show();
    }

    @FXML
    private void AddForMeetingButtonOnClick(ActionEvent event) throws IOException {

        Parent fileChooserViewParent = FXMLLoader.load(getClass().getResource("ArrangeMeetingScene.fxml"));
        Scene fileChooserViewScene = new Scene(fileChooserViewParent);
        Stage newWindow  = new Stage();
        newWindow.setTitle("Meeting ");
        newWindow.setScene(fileChooserViewScene);
        newWindow.show();
        
        

    }

 
    @FXML
    private void ViewComplaintButtonOnClick(ActionEvent event) throws IOException {
        Parent fileChooserViewParent = FXMLLoader.load(getClass().getResource("CreateComplaintScene.fxml"));
        Scene fileChooserViewScene = new Scene(fileChooserViewParent);
        Stage newWindow  = new Stage();
        newWindow.setTitle("Complaint");
        newWindow.setScene(fileChooserViewScene);
        newWindow.show();

    }

    @FXML
    private void GiveFeedBackButtonOnClick(ActionEvent event) throws IOException {
         
        Parent fileChooserViewParent = FXMLLoader.load(getClass().getResource("FeedbackScene.fxml"));
        Scene fileChooserViewScene = new Scene(fileChooserViewParent);
        Stage newWindow  = new Stage();
        newWindow.setTitle("FeedBack");
        newWindow.setScene(fileChooserViewScene);
        newWindow.show();
    }

    @FXML
    private void AddPerformerButtonOnClick(ActionEvent event) throws IOException {
        
        Parent fileChooserViewParent = FXMLLoader.load(getClass().getResource("AddPerformerInDataBaseScene.fxml"));
        Scene fileChooserViewScene = new Scene(fileChooserViewParent);
        Stage newWindow  = new Stage();
        newWindow.setTitle("Add Performer");
        newWindow.setScene(fileChooserViewScene);
        newWindow.show();
    }

    @FXML
    private void ViewPerformerButtonOnClick(ActionEvent event) throws IOException {
       
                Parent fileChooserViewParent = FXMLLoader.load(getClass().getResource("AddAndViewPerformer.fxml"));
        Scene fileChooserViewScene = new Scene(fileChooserViewParent);
        Stage newWindow  = new Stage();
        newWindow.setTitle("View Performer ");
        newWindow.setScene(fileChooserViewScene);
        newWindow.show();
    }

    @FXML
    private void ViewMeetingListButtonOnClick(ActionEvent event) throws IOException {
              Parent fileChooserViewParent = FXMLLoader.load(getClass().getResource("ViewMeetingList.fxml"));
        Scene fileChooserViewScene = new Scene(fileChooserViewParent);
        Stage newWindow  = new Stage();
        newWindow.setTitle("View Meeting List");
        newWindow.setScene(fileChooserViewScene);
        newWindow.show();
       
    }
    
}
