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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author 88017
 */
public class AddAndViewPerformerController implements Initializable {

    @FXML
    private TableView<NewPerformer> tableView;
    @FXML
    private TableColumn<NewPerformer, String> nameColumn;
    @FXML
    private TableColumn<NewPerformer, String> ptypeColumn;
    @FXML
    private TableColumn<NewPerformer, String> genderColumn;
    @FXML
    private TableColumn<NewPerformer, LocalDate> dobColumn;
    @FXML
    private TableColumn<NewPerformer, String> nidColumn;
    ArrayList<NewPerformer> Perfor;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Perfor = new ArrayList<NewPerformer>();
        nameColumn.setCellValueFactory(new PropertyValueFactory<NewPerformer, String>("name"));
        ptypeColumn.setCellValueFactory(new PropertyValueFactory<NewPerformer, String>("type"));
        genderColumn.setCellValueFactory(new PropertyValueFactory<NewPerformer, String>("Gender"));
        dobColumn.setCellValueFactory(new PropertyValueFactory<NewPerformer, LocalDate>("birthday"));
        nidColumn.setCellValueFactory(new PropertyValueFactory<NewPerformer, String>("nid"));

    }

    @FXML
    private void ViewAllPerformorInTableButtonOnClick(ActionEvent event) {
        ObjectInputStream ois = null;
        try {
            NewPerformer per;
            ois = new ObjectInputStream(new FileInputStream("PerformerObject.bin"));
            // per = (NewPerformer) ois.readObject();

            while (true) {

                per = (NewPerformer) ois.readObject();
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
    private void backButtonOnClick(ActionEvent event) throws IOException {
         Parent scene2;
        scene2 = FXMLLoader.load(getClass().getResource("Producer.fxml"));
        Scene scene3 = new Scene(scene2);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene3);
        window.show();
        //todo
    }

   

}
