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
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author JOY SAHA
 */
public class ViewProductionScheduleRadioButtonController implements Initializable {

    @FXML
    private TableView<ProductionSchedule> tableView;
    @FXML
    private TableColumn<ProductionSchedule,String> productNameColumn;
    @FXML
    private TableColumn<ProductionSchedule,String> quantityColumn;
    @FXML
    private TableColumn<ProductionSchedule,String> startDateColumn;
    @FXML
    private TableColumn<ProductionSchedule,String> endDateColumn;
    @FXML
    private TableColumn<ProductionSchedule,String> supervisorNameColumn;
    @FXML
    private TableColumn<ProductionSchedule,String> notesColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         productNameColumn.setCellValueFactory(new PropertyValueFactory<ProductionSchedule,String>("ProductName"));
         quantityColumn.setCellValueFactory(new PropertyValueFactory<ProductionSchedule,String>("Quantity"));
         startDateColumn.setCellValueFactory(new PropertyValueFactory<ProductionSchedule,String>("StartDate"));
         endDateColumn.setCellValueFactory(new PropertyValueFactory<ProductionSchedule,String>("EndDate"));
         supervisorNameColumn.setCellValueFactory(new PropertyValueFactory<ProductionSchedule,String>("SupervisorName"));
         notesColumn.setCellValueFactory(new PropertyValueFactory<ProductionSchedule,String>("Notes"));
        
   ProductionManager pm = new ProductionManager();      
  List<ProductionSchedule> productionSchedules = pm.viewProductionSchedule();
         tableView.getItems().clear();
        tableView.getItems().addAll(productionSchedules);    
}  
        
    
}
