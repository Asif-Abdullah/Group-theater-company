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
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author 88017
 */
public class ViewTicketSalesReportSceneController implements Initializable {

    @FXML
    private TableView<Report> tableView;
    @FXML
    private TableColumn<Report, LocalDate> DateColumn;
    @FXML
    private TableColumn<Report, String> DayColumn;
    @FXML
    private TableColumn<Report, Integer> SalesColumn;
    ArrayList<Report> Rep;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Rep = new ArrayList<Report>();
        DateColumn.setCellValueFactory(new PropertyValueFactory<Report, LocalDate>("showDate"));
        DayColumn.setCellValueFactory(new PropertyValueFactory<Report, String>("showsName"));
        SalesColumn.setCellValueFactory(new PropertyValueFactory<Report, Integer>("totalSell"));
        // TODO
    }

    @FXML
    private void ViewTicketSalesReportButtonOnClick(ActionEvent event) {
        ObjectInputStream ois = null;
        try {
            Report per;
            ois = new ObjectInputStream(new FileInputStream("Report.bin"));
           

            while (true) {

                per = (Report) ois.readObject();
                tableView.getItems().add(per);
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

    @FXML
    private void BackButtonOnClick(ActionEvent event) throws IOException {
        Parent scene2;
        scene2 = FXMLLoader.load(getClass().getResource("AccountsOfficer.fxml"));
        Scene scene3 = new Scene(scene2);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene3);
        window.show();
    }

}
