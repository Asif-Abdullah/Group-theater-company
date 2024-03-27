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
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class TicketSalesPersonDashBoardController implements Initializable {
    @FXML
    private Button HomeButton;
    @FXML
    private Button SellButton;
    @FXML
    private Button SeeButton;
    @FXML
    private Button BookingListButton;
    @FXML
    private Button ConfirmationButton;
    @FXML
    private Button AcceptButton;
    @FXML
    private Button ReportButton;
    @FXML
    private Button DataButton;
    @FXML
    private Button TargetButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


  /*  private void SellTicketButton(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("SellTicketScene.fxml"));
        Parent SellTicketSceneParent = loader.load();
        
        Scene SellTicketSceneScene = new Scene(SellTicketSceneParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(SellTicketSceneScene);
        
        sameStage.show();

    }

    private void ShowTimeButton(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ShowTimeTicket.fxml"));
        Parent ShowTimeSceneParent = loader.load();
        
        Scene ShowTimeSceneScene = new Scene(ShowTimeSceneParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(ShowTimeSceneScene);
        
        sameStage.show();
    }

    private void BookingListBUtton(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ViewerBookingListScene.fxml"));
        Parent BookingListParent = loader.load();
        
        Scene BookingListScene = new Scene(BookingListParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(BookingListScene);
        
        sameStage.show();
    }

    private void ContactButton(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("CancelConfirmTicketScene.fxml"));
        Parent TicketConfirmationParent = loader.load();
        
        Scene TicketConfirmationScene = new Scene(TicketConfirmationParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(TicketConfirmationScene);
        
        sameStage.show();
    }

    private void AcceptPaymentButton(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("PaymentAcceptScene.fxml"));
        Parent AcceptPaymentParent = loader.load();
        
        Scene AcceptPaymentScene = new Scene(AcceptPaymentParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(AcceptPaymentScene);
        
        sameStage.show();
    }

  


    private void TicketSellReport(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("TicketSellReport.fxml"));
        Parent AcceptPaymentParent = loader.load();
        
        Scene AcceptPaymentScene = new Scene(AcceptPaymentParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(AcceptPaymentScene);
        
        sameStage.show();
    }*/

    @FXML
    private void HomeButton(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("TicketSalesPersonDashBoard.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();
    }

    @FXML
    private void SellButton(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("SellTicketScene.fxml"));
        Parent SellTicketSceneParent = loader.load();
        
        Scene SellTicketSceneScene = new Scene(SellTicketSceneParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(SellTicketSceneScene);
        
        sameStage.show();
        
    }

    @FXML
    private void SeeButton(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ShowTimeTicket.fxml"));
        Parent SellTicketSceneParent = loader.load();
        
        Scene SellTicketSceneScene = new Scene(SellTicketSceneParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(SellTicketSceneScene);
        
        sameStage.show();
    }

    @FXML
    private void BookingListButton(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ViewerBookingListScene.fxml"));
        Parent BookingListParent = loader.load();
        
        Scene BookingListScene = new Scene(BookingListParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(BookingListScene);
        
        sameStage.show();
    }

    @FXML
    private void ConfirmattionButton(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("CancelConfirmTicketScene.fxml"));
        Parent BookingListParent = loader.load();
        
        Scene BookingListScene = new Scene(BookingListParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(BookingListScene);
        
        sameStage.show();
    }

    @FXML
    private void AcceptButton(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("PaymentAcceptScene.fxml"));
        Parent BookingListParent = loader.load();
        
        Scene BookingListScene = new Scene(BookingListParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(BookingListScene);
        
        sameStage.show();
    }

    @FXML
    private void ReportButton(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("TicketSellReport.fxml"));
        Parent BookingListParent = loader.load();
        
        Scene BookingListScene = new Scene(BookingListParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(BookingListScene);
        
        sameStage.show();
    }

    @FXML
    private void DataButton(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ManagingCustomerData.fxml"));
        Parent BookingListParent = loader.load();
        
        Scene BookingListScene = new Scene(BookingListParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(BookingListScene);
        
        sameStage.show();
    }

    @FXML
    private void TargetButton(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("MeetingSalesTarget.fxml"));
        Parent BookingListParent = loader.load();
        
        Scene BookingListScene = new Scene(BookingListParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(BookingListScene);
        
        sameStage.show();
    }
    
}
