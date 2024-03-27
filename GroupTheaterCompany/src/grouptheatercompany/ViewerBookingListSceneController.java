/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grouptheatercompany;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class ViewerBookingListSceneController implements Initializable {

    @FXML
    private Button HomeButton;
    @FXML
    private DatePicker ShowsDatePicker;
    @FXML
    private TextField TicketBookedTxtFld;
    @FXML
    private Button SaveButton;
    @FXML
    private TextArea ListTextArea;
    @FXML
    private ComboBox<String> ShowsNameComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        ShowsNameComboBox.getItems().addAll("Friends", "Lyric", "Lost", "Arrow");
    }

    @FXML
    private void HomeButton(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("TicketSalesPersonDashBoard.fxml"));
        Parent dashboardParent = loader.load();

        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        sameStage.setScene(dashboardScene);

        sameStage.show();
    }

    public String viewBookingList() {
        File p = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        String r = null;
        try {
            p = new File("Booking.bin");
            fis = new FileInputStream(p);
            ois = new ObjectInputStream(fis);
            Booking rs;
            try {
                while (true) {
                    rs = (Booking) ois.readObject();
                    if (r == null) {
                        r = rs.toString();
                    } else {
                        r = r + rs.toString();
                    }
                }
            } catch (Exception e) {

            }
        } catch (IOException ex) {
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException ex) {
            }
        }

        return r;
    }

    @FXML
    private void SaveButton(MouseEvent event) {

        Booking rs = new Booking(
                ShowsNameComboBox.getValue(),
                ShowsDatePicker.getValue(),
                Integer.parseInt(TicketBookedTxtFld.getText()));

        rs.toString();
        Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("Warning Alert");
        a.setContentText(rs.toString());
        a.setHeaderText(null);
        a.showAndWait();

        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            f = new File("Booking.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(rs);

        } catch (IOException ex) {
            // Logger.getLogger(SetRehearsalTimeController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException ex) {
                // Logger.getLogger(SetRehearsalTimeController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        ListTextArea.setText("");

        ListTextArea.appendText(viewBookingList());
    }

}
