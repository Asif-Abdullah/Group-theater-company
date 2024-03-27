/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grouptheatercompany;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author 88017
 */
public class ViewMeetingListController implements Initializable {

    @FXML
    private TableView<ArrangeMeeting> tableView;
    @FXML
    private TableColumn<ArrangeMeeting, String> MeetingTitleColumn;
    @FXML
    private TableColumn<ArrangeMeeting, LocalDate> MeetingDateColumn;
    @FXML
    private TableColumn<ArrangeMeeting, String> MeetingDayColumn;
    @FXML
    private TableColumn<ArrangeMeeting, String> MeetingTypeColumn;
    @FXML
    private TableColumn<ArrangeMeeting, String> MeetingVenueColumn;
    @FXML
    private TableColumn<ArrangeMeeting, String> EmployeeNemeColumn;
ArrayList<ArrangeMeeting>MeetingList;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        MeetingList = new ArrayList<ArrangeMeeting>();
        MeetingTitleColumn.setCellValueFactory(new PropertyValueFactory<ArrangeMeeting, String>("title"));
        MeetingDateColumn.setCellValueFactory(new PropertyValueFactory<ArrangeMeeting, LocalDate>("mdate"));
        MeetingDayColumn.setCellValueFactory(new PropertyValueFactory<ArrangeMeeting, String>("dayTime"));
        MeetingTypeColumn.setCellValueFactory(new PropertyValueFactory<ArrangeMeeting, String>("mtype"));
        MeetingVenueColumn.setCellValueFactory(new PropertyValueFactory<ArrangeMeeting, String>("venue"));
        EmployeeNemeColumn.setCellValueFactory(new PropertyValueFactory<ArrangeMeeting, String>("name"));
        
    }    

    @FXML
    private void ViewButtonOnClick(ActionEvent event) {
        
         ObjectInputStream ois = null;
        try {
            ArrangeMeeting meet;
            ois = new ObjectInputStream(new FileInputStream("ArrageMeetingFile.bin"));
           

            while (true) {

                meet = (ArrangeMeeting) ois.readObject();
                tableView.getItems().add(meet);
              
            }
        } catch (Exception ex) {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            ex.printStackTrace();
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException ex) {
            }
        }

    }
    
}
