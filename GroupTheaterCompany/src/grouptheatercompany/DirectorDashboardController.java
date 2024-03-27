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
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author JOY SAHA
 */
public class DirectorDashboardController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void logoutButtonOnClicked(MouseEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("login.fxml"));
        Parent viewRehearsalTimeParent = loader.load();
        
        Scene viewRehearsalTimeScene = new Scene(viewRehearsalTimeParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(viewRehearsalTimeScene);
        
        sameStage.show();
    }

    @FXML
    private void selectActorsButtonOnClick(MouseEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("selectActor.fxml"));
        Parent selectActorParent = loader.load();
        
        Scene selectActorScene = new Scene(selectActorParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(selectActorScene);
        
        sameStage.show();
    }
    

    @FXML
    private void viewTicketSalesReportButtonOnClick(MouseEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("viewTicketsSalesReport.fxml"));
        Parent viewTicketSalesReportParent = loader.load();
        
        Scene viewTicketSalesReportScene = new Scene(viewTicketSalesReportParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(viewTicketSalesReportScene);
        
        sameStage.show();
    }

    @FXML
    private void chooseScriptButtonOnClick(MouseEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("chooseScript.fxml"));
        Parent chooseScriptParent = loader.load();
        
        Scene chooseScriptScene = new Scene(chooseScriptParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(chooseScriptScene);
        
        sameStage.show();
    }

    @FXML
    private void viewProductionScheduleButtonOnClick(MouseEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("viewProductionSchedule.fxml"));
        Parent viewProductionScheduleParent = loader.load();
        
        Scene viewProductionScheduleScene = new Scene(viewProductionScheduleParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(viewProductionScheduleScene);
        
        sameStage.show();
    }

    @FXML
    private void eventPlanReportsButtonOnClick(MouseEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("eventPlanReport.fxml"));
        Parent eventPlanReportsParent = loader.load();
        
        Scene eventPlanReportsScene = new Scene(eventPlanReportsParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(eventPlanReportsScene);
        
        sameStage.show();
    }

    @FXML
    private void setRehearsalTimeButtonOnClick(MouseEvent event) throws IOException {
           FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("setRehearsalTime.fxml"));
        Parent setRehearsalTimeParent = loader.load();
        
        Scene setRehearsalTimeScene = new Scene(setRehearsalTimeParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(setRehearsalTimeScene);
        
        sameStage.show();
    }

    @FXML
    private void performerListButtonOnClick(MouseEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("performerList.fxml"));
        Parent performerListParent = loader.load();
        
        Scene performerListScene = new Scene(performerListParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(performerListScene);
        
        sameStage.show();
    }

    @FXML
    private void createProjectButtonOnClick(MouseEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("CreateProject.fxml"));
        Parent createProjectParent = loader.load();
        
        Scene createProjectScene = new Scene(createProjectParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(createProjectScene);
        
        sameStage.show();
    }
    
}
