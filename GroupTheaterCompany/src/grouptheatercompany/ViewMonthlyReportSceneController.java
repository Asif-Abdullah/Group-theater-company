package grouptheatercompany;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class ViewMonthlyReportSceneController implements Initializable {

    @FXML
    private ComboBox<String> monthComboBox;
    @FXML
    private TableView<MonthlyReport> tableView;
    @FXML
    private TableColumn<MonthlyReport, String> monthsColumn;
    @FXML
    private TableColumn<MonthlyReport, Integer> ticketSalesColumn;
    @FXML
    private TableColumn<MonthlyReport, Integer> SalaryColumn;
    @FXML
    private TableColumn<MonthlyReport, Integer> TransCostColumn;
    @FXML
    private TableColumn<MonthlyReport, Integer> auditRentColumn;
    @FXML
    private TableColumn<MonthlyReport, Integer> ElecBillColumn;
    private ArrayList<MonthlyReport> Report;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Report = new ArrayList<MonthlyReport>();
        monthComboBox.getItems().addAll("January", "February", "March", "April", "May", "June", "July", "August", "September", "October",
                 "November", "December");
        monthsColumn.setCellValueFactory(new PropertyValueFactory<MonthlyReport, String>("month"));
        ticketSalesColumn.setCellValueFactory(new PropertyValueFactory<MonthlyReport, Integer>("salary"));
        SalaryColumn.setCellValueFactory(new PropertyValueFactory<MonthlyReport, Integer>("Tcost"));
        TransCostColumn.setCellValueFactory(new PropertyValueFactory<MonthlyReport, Integer>("ArCost"));
        auditRentColumn.setCellValueFactory(new PropertyValueFactory<MonthlyReport, Integer>("Ebill"));
        ElecBillColumn.setCellValueFactory(new PropertyValueFactory<MonthlyReport, Integer>("ticketseles"));

    }

    @FXML
    private void loadButtionOnClick(ActionEvent event) {
        //todo
    }

    @FXML
    private void ViewButtonOnClick(ActionEvent event) {

        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream("MonthlyReportOb.bin"));

            MonthlyReport m;
            while (true) {
                try {
                    m = (MonthlyReport) ois.readObject();

                    tableView.getItems().add(m);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {

                if (ois != null) {
                    ois.close();
                }
            } catch (IOException ex) {

                ex.printStackTrace();
            }

        }
    }

    @FXML
    private void BackButtonOnClick(ActionEvent event) throws IOException {
        Parent scene2;
        scene2 = FXMLLoader.load(getClass().getResource("Producer.fxml"));
        Scene scene3 = new Scene(scene2);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene3);
        window.show();
    }
}
