
package grouptheatercompany;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author 88017
 */
public class AccountsOfficerController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
      //todo 
    }    

    @FXML
    private void IncomeStatementandBalanceSheetButtonOnClick(ActionEvent event) throws IOException {
        
        Parent scene2;
        scene2 = FXMLLoader.load(getClass().getResource("IncomeStatementAndBaleaneScene.fxml"));
        Scene scene3 = new Scene(scene2);      
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene3);
        window.show();
    }

    @FXML
    private void CreateMonthlyReportButtonOnClick(ActionEvent event) throws IOException {
       
        Parent scene2;
        scene2 = FXMLLoader.load(getClass().getResource("MonthlyReportScene.fxml"));
        Scene scene3 = new Scene(scene2);      
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene3);
        window.show();
        
    }

    @FXML
    private void ViewTicketSalesReportButtonOnClick(ActionEvent event) throws IOException {
        
        Parent scene2;
        scene2 = FXMLLoader.load(getClass().getResource("ViewTicketSalesReportScene.fxml"));
        Scene scene3 = new Scene(scene2);      
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene3);
        window.show();
    }

    @FXML
    private void EmployeeSalaryButtonOnClick(ActionEvent event) throws IOException {
       
        Parent scene2;
        scene2 = FXMLLoader.load(getClass().getResource("EmployeeSalaryScene.fxml"));
        Scene scene3 = new Scene(scene2);      
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene3);
        window.show();
    }

    @FXML
    private void EmployeeBonusButtonClick(ActionEvent event) throws IOException {
       
        Parent scene2;
        scene2 = FXMLLoader.load(getClass().getResource("BonusScene.fxml"));
        Scene scene3 = new Scene(scene2);      
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene3);
        window.show();
       
    }

    @FXML
    private void LeaveApplicationButtonOnClick(ActionEvent event) throws IOException {
        
        Parent scene2;
        scene2 = FXMLLoader.load(getClass().getResource("LeaveApplicationScene.fxml"));
        Scene scene3 = new Scene(scene2);      
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene3);
        window.show();
    }

    @FXML
    private void TaxReportButtonOnClick(ActionEvent event) throws IOException {
        Parent scene2;
        scene2 = FXMLLoader.load(getClass().getResource("TaxReportScene.fxml"));
        Scene scene3 = new Scene(scene2);      
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene3);
        window.show();
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) throws IOException {
        Parent scene2;
        scene2 = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
        Scene scene3 = new Scene(scene2);      
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene3);
        window.show();
    }

    @FXML
    private void eidAlFitrButtonOnClick(ActionEvent event) throws IOException {
        Parent fileChooserViewParent = FXMLLoader.load(getClass().getResource("EidulFitrScene.fxml"));
        Scene fileChooserViewScene = new Scene(fileChooserViewParent);
        Stage newWindow  = new Stage();
        newWindow.setTitle("Eid ul-Fitr Bonus Scene");
        newWindow.setScene(fileChooserViewScene);
        newWindow.show();
    }

    @FXML
    private void eidUlAzhaButtonOnClick(ActionEvent event) throws IOException {
         Parent fileChooserViewParent = FXMLLoader.load(getClass().getResource("EidAlAzhaScene.fxml"));
        Scene fileChooserViewScene = new Scene(fileChooserViewParent);
        Stage newWindow  = new Stage();
        newWindow.setTitle("Eid Al-Azha Bonus Scene");
        newWindow.setScene(fileChooserViewScene);
        newWindow.show();
    }

    @FXML
    private void boishakhiVataButtonOnClick(ActionEvent event) throws IOException {
         Parent fileChooserViewParent = FXMLLoader.load(getClass().getResource("aaaa.fxml"));
        Scene fileChooserViewScene = new Scene(fileChooserViewParent);
        Stage newWindow  = new Stage();
        newWindow.setTitle("Eid Al-Azha Bonus Scene");
        newWindow.setScene(fileChooserViewScene);
        newWindow.show();
    }

    
    
}
