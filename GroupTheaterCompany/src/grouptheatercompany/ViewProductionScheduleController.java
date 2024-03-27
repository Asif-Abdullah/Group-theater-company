/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grouptheatercompany;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author JOY SAHA
 */
public class ViewProductionScheduleController implements Initializable {

    @FXML
    private TableView<ProductionSchedule> tableView;
    @FXML
    private TableColumn<ProductionSchedule, String> productNameColumn;
    @FXML
    private TableColumn<ProductionSchedule, String> quantityColumn;
    @FXML
    private TableColumn<ProductionSchedule, String> startDateColumn;
    @FXML
    private TableColumn<ProductionSchedule, String> endDateColumn;
    @FXML
    private TableColumn<ProductionSchedule, String> supervisorNameColumn;
    @FXML
    private TableColumn<ProductionSchedule, String> notesColumn;
    
    @FXML
    private TextField commentTextField;
    @FXML
    private TextArea feedbackTextArea;
    private ArrayList<Comment> cArr;
    

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
        
       Director d = new Director(); 
      List<ProductionSchedule> productionSchedules =d.viewProductionSchedule();
        tableView.getItems().clear();
        tableView.getItems().addAll(productionSchedules);  
        
        //ProductionManager pm=new ProductionManager();
       // feedbackTextArea.setText("");
         // feedbackTextArea.appendText(d.viewCommentPS());
          cArr = new ArrayList<Comment>();
          File f=null;
          FileInputStream fis = null;
            DataInputStream dis = null;
            try{
                //FileInputStream fis = new FileInputStream("studData.bin");
                 f = new File("CommentPM.bin");
                fis = new FileInputStream(f);
                dis = new DataInputStream(fis);
                
                feedbackTextArea.clear();
                while(true){

                    feedbackTextArea.appendText(
                        
                        "" + dis.readUTF() + "\n"
                    );
                }
                //dis.close();
            }
            catch(Exception e){
              try {
                  //Alert a = new Alert(AlertType.INFORMATION);
                  //a.setContentText(e.toString());
                  //a.setContentText("Content from Data file is loaded successfully.");
                  //a.showAndWait();
                  dis.close();
                  //SHOW e.toString() IN AN ALERT
              } catch (IOException ex) {
                  Logger.getLogger(ViewProductionScheduleController.class.getName()).log(Level.SEVERE, null, ex);
              }
            }  
            

          
         
            

    }
    
      public boolean valid(){
       if(commentTextField.getText().isEmpty()){
          Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("No Comment Assigned");
        a.setContentText("Please assign a comment!");
        a.setHeaderText(null);
        a.showAndWait(); 
        return false;
       }return true;
      }

    @FXML
    private void homeSceneOnClicked(MouseEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Director Dashboard.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();
    }

    @FXML
    private void sendButtonOnClick(MouseEvent event) {
        // Director d = new Director(); 
       //d.createCommentPS(commentTextField.getText());
        boolean b=valid();
        if(b==true){
       cArr.add(
            new Comment(  
                    commentTextField.getText()  
                )
        );
        
        
        try{
                FileOutputStream fos = new FileOutputStream("CommentD.bin", true);
                DataOutputStream dos = new DataOutputStream(fos);
                for(Comment c: cArr){
                    dos.writeUTF(c.getComment());
                }
            
                dos.close();
                commentTextField.setText(null);
                 Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setTitle("Information Alert");
        a.setHeaderText(null);
        a.setContentText("Comment Sent Successfully ");
        a.showAndWait(); 
            }
            catch(Exception e){
                //SHOW e.toString() IN AN ALERT
            }          
           
        
    }
    
    }  
 }
