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
public class ProductionManagerDashboardController implements Initializable {

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
    private void viewRehearsalTimeButtonOnClick(MouseEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("viewReharsalSchedule.fxml"));
        Parent viewRehearsalTimeParent = loader.load();
        
        Scene viewRehearsalTimeScene = new Scene(viewRehearsalTimeParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(viewRehearsalTimeScene);
        
        sameStage.show();
    }

    @FXML
    private void projectBudgetButtonOnClick(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("viewProjectBudget.fxml"));
        Parent viewProjectBudgetParent = loader.load();
        
        Scene viewProjectBudgetScene = new Scene(viewProjectBudgetParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(viewProjectBudgetScene);
        
        sameStage.show(); 
    }

    @FXML
    private void createCastActorListButtonOnClick(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("createCastActorList.fxml"));
        Parent createCastActorListParent = loader.load();
        
        Scene createCastActorListScene = new Scene(createCastActorListParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(createCastActorListScene);
        
        sameStage.show(); 
    }

    @FXML
    private void venueButtonOnClick(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("selectVenue.fxml"));
        Parent selectVenueParent = loader.load();
        
        Scene selectVenueScene = new Scene(selectVenueParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(selectVenueScene);
        
        sameStage.show(); 
    }

    @FXML
    private void eventCalenderButtonOnClick(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("eventCalender.fxml"));
        Parent eventCalenderParent = loader.load();
        
        Scene eventCalenderScene = new Scene(eventCalenderParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(eventCalenderScene);
        
        sameStage.show(); 
    }

    @FXML
    private void productionScheduleButtonOnClick(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("productionSchedule.fxml"));
        Parent productionScheduleParent = loader.load();
        
        Scene productionScheduleScene = new Scene(productionScheduleParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(productionScheduleScene);
        
        sameStage.show(); 
    }

    @FXML
    private void crewListButtonOnClick(MouseEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("createCrewList.fxml"));
        Parent createCrewListParent = loader.load();
        
        Scene createCrewListScene = new Scene(createCrewListParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(createCrewListScene);
        
        sameStage.show(); 
    }
    

    @FXML
    private void costumeDesignButtonOnClick(MouseEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("costumeDesign.fxml"));
        Parent costumeDesignParent = loader.load();
        
        Scene costumeDesignScene = new Scene(costumeDesignParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(costumeDesignScene);
        
        sameStage.show(); 
    }
    
}
