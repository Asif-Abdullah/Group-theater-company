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
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class PerformerDashBoardController implements Initializable {

    @FXML
    private Button AcceptButton11;
    @FXML
    private Button AcceptButton111;
    @FXML
    private Button AcceptButton1111;
    @FXML
    private Button AcceptButton11111;
    @FXML
    private Button AcceptButton12;
    @FXML
    private Button AcceptButton121;
    @FXML
    private Button HomeButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void SeeTimeButton(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ShowTimeScene.fxml"));
        Parent SeeTimeParent = loader.load();
        
        Scene SeeTimeScene = new Scene(SeeTimeParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(SeeTimeScene);
        
        sameStage.show();
    }

    @FXML
    private void DownloadButton(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("DownloadScriptsScene.fxml"));
        Parent downloadScriptsParent = loader.load();
        
        Scene downloadScriptsScene = new Scene(downloadScriptsParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(downloadScriptsScene);
        
        sameStage.show();
    }

    @FXML
    private void ViewSalaryButton(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ViewSalaryScene.fxml"));
        Parent viewSalaryParent = loader.load();
        
        Scene viewSalaryScene = new Scene(viewSalaryParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(viewSalaryScene);
        
        sameStage.show();
    }

    @FXML
    private void CostumeDetailButton(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("CostumeDetailScene.fxml"));
        Parent costumeDetailParent = loader.load();
        
        Scene costumeDetailScene = new Scene(costumeDetailParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(costumeDetailScene);
        
        sameStage.show();
    }


    @FXML
    private void PresenceButton(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("AttendanceScene.fxml"));
        Parent attendanceSceneParent = loader.load();
        
        Scene attendanceSceneScene = new Scene(attendanceSceneParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(attendanceSceneScene);
        
        sameStage.show();
    }

    @FXML
    private void EventCalenderButton(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ViewCalenderScene.fxml"));
        Parent viewCalenderParent = loader.load();
        
        Scene viewCalenderScene = new Scene(viewCalenderParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(viewCalenderScene);
        
        sameStage.show();

    }

    @FXML
    private void leaveApplicationButton(MouseEvent event) throws IOException {
        
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("LeaveApplication.fxml"));
        Parent leaveApplicationParent = loader.load();
        
        Scene leaveApplicationScene = new Scene(leaveApplicationParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(leaveApplicationScene);
        
        sameStage.show();
    }

    @FXML
    private void HomeButton(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Director Dashboard.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();
    }

    @FXML
    private void FeedBackButton(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ViewerFeedbackScene.fxml"));
        Parent viewerFeedbackParent = loader.load();
        
        Scene viewerFeedbackScene = new Scene(viewerFeedbackParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(viewerFeedbackScene);
        
        sameStage.show();

    }
    
}
