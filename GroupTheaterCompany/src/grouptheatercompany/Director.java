/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grouptheatercompany;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Alert;

/**
 *
 * @author JOY SAHA
 */
public class Director {

    
    public void createRehearsalSchedule(int id, String purpose, LocalTime sTime, LocalTime eTime, LocalDate date, String location){
       
        if(sTime.isBefore(eTime)){
        
         RehearsalSchedule rs = new RehearsalSchedule(
                id,
                purpose,
                sTime,
                eTime,
                date,
                location    
            );
         rs.toString()
            ;
             Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("Warning Alert");
        a.setContentText(rs.toString());
        a.setHeaderText(null);
        a.showAndWait(); 
        
        
          File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try {
            f = new File("RehearsalTime.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
            
            
            oos.writeObject(rs);

        } catch (IOException ex) {
            Logger.getLogger(SetRehearsalTimeController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                Logger.getLogger(SetRehearsalTimeController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
        }
        else
        {
            Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("Warning Alert");
        a.setContentText("End time must be greater than start time");
        a.setHeaderText(null);
        a.showAndWait();
        }
        
      
    }
    
    public String viewRehearsalSchedule(){
        
        File p = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        String r = null;
        try {
            p = new File("RehearsalTime.bin");
            fis = new FileInputStream(p);
            ois = new ObjectInputStream(fis);
            RehearsalSchedule rs;
            
            try{
                while(true){
                    rs = (RehearsalSchedule)ois.readObject();
                   if(r==null){
                      r=rs.toViewRehearsalSchedule(); 
                   }else{ 
                   r=r+ rs.toViewRehearsalSchedule();
                   }
                }
            }
            catch(Exception e){
                
            }           
        } catch (IOException ex) { } 
        finally {
            try {
                if(ois != null) ois.close();
            } catch (IOException ex) { }
        }
        
      return r;
    }
    
     public List<ProductionSchedule> viewProductionSchedule(){
    
        ObjectInputStream ois=null;
        List<ProductionSchedule> productionSchedules = new ArrayList<>();
        try {
            
            ois = new ObjectInputStream(new FileInputStream("ProductionSchedule.bin"));
            
            while(true){
                try{
                    ProductionSchedule ps = (ProductionSchedule) ois.readObject();
                    productionSchedules.add(ps);
                } catch (EOFException e){
                    break; // Reached end of file, exit loop
                }
            }
            
        } catch (Exception ex) {
            try {
                if(ois!=null)
                    ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            ex.printStackTrace();
        }        
        return productionSchedules;
    }
     
     
      public String viewActorDetails(){
       File p = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        String r = null;
        try {
            p = new File("CastActor.bin");
            fis = new FileInputStream(p);
            ois = new ObjectInputStream(fis);
            Actor act;
            
            try{
                while(true){
                   act = (Actor)ois.readObject();
                     if(r==null){
                      r=act.toViewCastActorList(); 
                   }else{ 
                   r=r+ act.toViewCastActorList();
                   }
                }
            }
            catch(Exception e){
                
            }           
        } catch (IOException ex) { } 
        finally {
            try {
                if(ois != null) ois.close();
            } catch (IOException ex) { }
        }
        
      return r;
    }
   
      
      public void createProject(String eventName, String purpose, LocalDate date, LocalTime sTime, LocalTime eTime, String venue, Float budget){
          
          if(sTime.isBefore(eTime)){
           Project p = new Project(
                eventName,
                date,
                sTime,
                eTime,
                venue,
                budget,
                purpose
                );
            
             Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("Warning Alert");
        a.setContentText(p.toString());
        a.setHeaderText(null);
        a.showAndWait(); 
          
           File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try {
            f = new File("Project.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
            
            oos.writeObject(p);

        } catch (IOException ex) {
            Logger.getLogger(SetRehearsalTimeController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                Logger.getLogger(SetRehearsalTimeController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
        }
        else
        {
            Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("Warning Alert");
        a.setContentText("End time must be greater than start time");
        a.setHeaderText(null);
        a.showAndWait();
        }
      }
      
   public List<Project> viewProject(){
    
        ObjectInputStream ois=null;
        List<Project> projects = new ArrayList<>();
        try {
            
            ois = new ObjectInputStream(new FileInputStream("Project.bin"));
            
            while(true){
                try{
                    Project p = (Project) ois.readObject();
                    projects.add(p);
                } catch (EOFException e){
                    break; // Reached end of file, exit loop
                }
            }
            
        } catch (Exception ex) {
            try {
                if(ois!=null)
                    ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            ex.printStackTrace();
        }        
        return projects;
    }
   public void createAddActor(String name, String role, float salary, String contractNumber){

    File f = null;
    FileOutputStream fos = null;      
    ObjectOutputStream oos = null;

    try {
        f = new File("AddActor.bin");
        if(f.exists()){
            fos = new FileOutputStream(f,true);
            oos = new AppendableObjectOutputStream(fos);                
        }
        else{
            fos = new FileOutputStream(f);
            oos = new ObjectOutputStream(fos);               
        }
        Actor newActor = new Actor(  
                name,
                role,
                salary,
                contractNumber  
            );
        Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("Warning Alert");
        a.setContentText(newActor.toString());
        a.setHeaderText(null);
        a.showAndWait(); 

        try{
            oos.writeObject(newActor);
        }
        catch(IOException e){
            Alert b = new Alert(Alert.AlertType.WARNING);
            b.setTitle("IO Alert");
            b.setContentText(e.toString());
            b.setHeaderText(null);
            b.showAndWait(); 
        }

    } catch (IOException ex) {
        Logger.getLogger(SelectActorController.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        try {
            if(oos != null) oos.close();
            if(fos != null) fos.close();
        } catch (IOException ex) {
            Logger.getLogger(SelectActorController.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
}

    
     public List<Actor> viewAddActorList(){
    
        ObjectInputStream ois=null;
        List<Actor> actors = new ArrayList<>();
        try {
            
            ois = new ObjectInputStream(new FileInputStream("AddActor.bin"));
            
            while(true){
                try{
                    Actor act = (Actor) ois.readObject();
                    actors.add(act);
                } catch (EOFException e){
                    break; // Reached end of file, exit loop
                }
            }
            
        } catch (Exception ex) {
            try {
                if(ois!=null)
                    ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            ex.printStackTrace();
        }        
        return actors;
    }
    
     
     public void createFinalActorList(String projectName){
         
         
          File p = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        
         File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
       
        try {
            p = new File("AddActor.bin");
            fis = new FileInputStream(p);
            ois = new ObjectInputStream(fis);
            Actor a;
            
               f = new File("FinalActorList.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
            
            try{
               // oos.writeObject(projectName);
                while(true){
                    a = (Actor)ois.readObject();
                       oos.writeObject(a);
                }
            }
            catch(Exception e){
                
            }           
        } catch (IOException ex) { } 
        finally {
            try {
                if(ois != null) ois.close();
            } catch (IOException ex) { }
        }
        
        
      }
         
  public void createNote(int totalTicketSale,int onlineSales,int thirdPartyVendors,int totalCancelTickets,float revenue){

    File f = null;
    FileOutputStream fos = null;      
    ObjectOutputStream oos = null;

    try {
        f = new File("Note.bin");
        if(f.exists()){
            fos = new FileOutputStream(f,true);
            oos = new AppendableObjectOutputStream(fos);                
        }
        else{
            fos = new FileOutputStream(f);
            oos = new ObjectOutputStream(fos);               
        }
        Note n = new Note(  
               totalTicketSale,
               onlineSales,
               thirdPartyVendors,
               totalCancelTickets,
                revenue 
            );
        Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("Warning Alert");
        a.setContentText(n.toString());
        a.setHeaderText(null);
        a.showAndWait(); 

        try{
            oos.writeObject(n);
        }
        catch(IOException e){
            Alert b = new Alert(Alert.AlertType.WARNING);
            b.setTitle("IO Alert");
            b.setContentText(e.toString());
            b.setHeaderText(null);
            b.showAndWait(); 
        }

    } catch (IOException ex) {
        //Logger.getLogger(SelectActorController.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        try {
            if(oos != null) oos.close();
            if(fos != null) fos.close();
        } catch (IOException ex) {
            Logger.getLogger(SelectActorController.class.getName()).log(Level.SEVERE, null, ex);
        }//
    } 
}
    
 public String viewNote(){
       File p = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        String r = null;
        try {
            p = new File("Note.bin");
            fis = new FileInputStream(p);
            ois = new ObjectInputStream(fis);
            Note n;
            
            try{
                while(true){
                   n = (Note)ois.readObject();
                     if(r==null){
                      r=n.toViewNote(); 
                   }else{ 
                   r=r+ n.toViewNote();
                   }
                }
            }
            catch(Exception e){
                
            }           
        } catch (IOException ex) { } 
        finally {
            try {
                if(ois != null) ois.close();
            } catch (IOException ex) { }
        }
        
      return r;
    }    
     //need to change
      public String viewTicketSalesreport(){
       File p = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        String r = null;
        try {
            p = new File("Report.bin");
            fis = new FileInputStream(p);
            ois = new ObjectInputStream(fis);
            Report rp;
            
            try{
                while(true){
                   rp = (Report)ois.readObject();
                     if(r==null){
                      r=rp.toString(); 
                   }else{ 
                   r=r+ rp.toString();
                   }
                }
            }
            catch(Exception e){
                
            }           
        } catch (IOException ex) { } 
        finally {
            try {
                if(ois != null) ois.close();
            } catch (IOException ex) { }
        }
        
      return r;
    }       
            
          
            
           
     
          
}
