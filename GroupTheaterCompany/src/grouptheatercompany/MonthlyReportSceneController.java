
package grouptheatercompany;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
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
public class MonthlyReportSceneController implements Initializable {

    @FXML
    private ComboBox<String> monthComboBox;
    @FXML
    private TextField totalSalaryTextField;
    @FXML
    private TextField TransCostTextField;
    @FXML
    private TextField auditoriumCostTextField;
    @FXML
    private TextField elecBillTextField;
    @FXML
    private TextField totalSalesAmountTextField;
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

    /**
     * Initializes the controller class.
     */
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

        // TODO
    }


    @FXML
    private void SendButtonOnclick(ActionEvent event) {
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            f = new File("MonthlyReportOb.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            MonthlyReport m = new MonthlyReport(
                    Integer.parseInt(totalSalaryTextField.getText()),
                    Integer.parseInt(TransCostTextField.getText()),
                    Integer.parseInt(auditoriumCostTextField.getText()),
                    Integer.parseInt(elecBillTextField.getText()),
                    monthComboBox.getValue(),
                    Integer.parseInt(totalSalesAmountTextField.getText())
            );
            oos.writeObject(m);

        } catch (IOException ex) {
            Logger.getLogger(MonthlyReportSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(MonthlyReportSceneController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setTitle("Information Alert");
        a.setHeaderText("Successful!!");
        a.setContentText("Monthly report has been added successfully ");
        a.showAndWait();
    }

    @FXML
    private void previewReportButtonOnClick(ActionEvent event) {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("MonthlyReportOb.bin"));
            MonthlyReport m;
            while (true) {
                try {
                    m = (MonthlyReport) ois.readObject();
                    tableView.getItems().add(m);
                } catch (EOFException e) {
                    break; // end of file reached, break out of the loop
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
        scene2 = FXMLLoader.load(getClass().getResource("AccountsOfficer.fxml"));
        Scene scene3 = new Scene(scene2);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene3);
        window.show();
    }

    @FXML
    private void DeleteButtonOnClick(ActionEvent event) {
    }

}
