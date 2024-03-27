/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grouptheatercompany;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author User
 */
public class SeePerformerReharsalTimeController implements Initializable {

    @FXML
    private TableView<?> CalenderTable;
    @FXML
    private TableColumn<?, ?> ShowsC1;
    @FXML
    private TableColumn<?, ?> DateC2;
    @FXML
    private TableColumn<?, ?> TimeC3;
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
    private void HomeButton(MouseEvent event) {
    }
    
}
