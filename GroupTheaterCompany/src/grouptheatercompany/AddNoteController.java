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
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author JOY SAHA
 */
public class AddNoteController implements Initializable {

    @FXML
    private TextField totalTicketSaleTextField;
    @FXML
    private TextField onlineSalesTextField;
    @FXML
    private TextField thirdPartyVendorsTextField;
    @FXML
    private TextField totalCancelTicketsTextField;
    @FXML
    private TextField revenueTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void createButtonOnClick(MouseEvent event) {
        Director d=new Director();
        d.createNote(
           Integer.parseInt(totalTicketSaleTextField.getText()),
      Integer.parseInt(onlineSalesTextField.getText()),
      Integer.parseInt(thirdPartyVendorsTextField.getText()),
      Integer.parseInt(totalCancelTicketsTextField.getText()),
      Float.parseFloat(revenueTextField.getText())     
        );
        
        totalTicketSaleTextField.setText(null);
        onlineSalesTextField.setText(null);
        thirdPartyVendorsTextField.setText(null);
        totalCancelTicketsTextField.setText(null);
        revenueTextField.setText(null); 
    }
    
}
