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
public class ProductionManager {
    public  String viewRehearsalSchedule(){
        
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
    
    public void createProductionSchedule(String productName, int quantity, LocalDate startDate, LocalDate endDate, String supervisorName, String notes){
         
         if(startDate.isBefore(endDate)){
        
        ProductionSchedule ps = new ProductionSchedule(
                productName,
                quantity,
                startDate,
                endDate,
                supervisorName,
                notes    
            );
            
             Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("Warning Alert");
        a.setContentText(ps.toString());
        a.setHeaderText(null);
        a.showAndWait(); 
     
        
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try {
            f = new File("ProductionSchedule.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
            
            
          
            
            oos.writeObject(ps);

        } catch (IOException ex) {
            Logger.getLogger(CreateNewProductionScheduleRadioButtonController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                Logger.getLogger(CreateNewProductionScheduleRadioButtonController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }  }
        else
        {
            Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("Warning Alert");
        a.setContentText("End Date must be greater than Start Date");
        a.setHeaderText(null);
        a.showAndWait();
        }
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
     
     public void createCastActorList(String name,String role,float salary,String contractNumber,String note){
         Actor ac= new Actor(
                name,
                 role,
                 salary,
                 contractNumber,
                 note
         );
         
                  Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("Warning Alert");
        a.setContentText(ac.toString());
        a.setHeaderText(null);
        a.showAndWait(); 
     
        
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try {
            f = new File("CastActor.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
            
            
          
            
            oos.writeObject(ac);

        } catch (IOException ex) {
            //
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
               // Logger.getLogger(CreateNewProductionScheduleRadioButtonController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
     }
     
     
      public List<Actor> viewCastActorList(){
    
        ObjectInputStream ois=null;
        List<Actor> actors = new ArrayList<>();
        try {
            
            ois = new ObjectInputStream(new FileInputStream("CastActor.bin"));
            
            while(true){
                try{
                    Actor ac = (Actor) ois.readObject();
                    actors.add(ac);
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
     
      public void addCrewList(String name,String assignDuties,LocalDate date,String contractNumber, float salary){
         Crew c= new Crew(
                name,
                 assignDuties,
                 date,
                 contractNumber,
                 salary
          
         );
         
                  Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("Warning Alert");
        a.setContentText(c.toString());
        a.setHeaderText(null);
        a.showAndWait(); 
     
        
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try {
            f = new File("AddCrewList.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
            
            
          
            
            oos.writeObject(c);

        } catch (IOException ex) {
            //
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
               // Logger.getLogger(CreateNewProductionScheduleRadioButtonController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
     }
      
      public String viewAddCrewList(){
        
        File p = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        String r = null;
        try {
            p = new File("AddCrewList.bin");
            fis = new FileInputStream(p);
            ois = new ObjectInputStream(fis);
            Crew c;
            
            try{
                while(true){
                    c = (Crew)ois.readObject();
                     if(r==null){
                      r=c.toViewCrewList(); 
                   }else{ 
                   r=r+ c.toViewCrewList();
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
    
     public void createCrewList(String eventName, int num){
         
         Crew cr =new Crew(
                 eventName,
                 num
         );
         
          File p = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        
         File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
       
        try {
            p = new File("AddCrewList.bin");
            fis = new FileInputStream(p);
            ois = new ObjectInputStream(fis);
            Crew c;
            
               f = new File("CrewList.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
            
            try{
                oos.writeObject(cr);
                while(true){
                    c = (Crew)ois.readObject();
                       oos.writeObject(c);
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
     
     
     
     // To View Crew List(Delete)
      public String viewCrewList(){
        
        File p = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        String r = null;
        try {
            p = new File("CrewList.bin");
            fis = new FileInputStream(p);
            ois = new ObjectInputStream(fis);
            Crew c;
            Crew cr;
            
            try{cr = (Crew)ois.readObject();
                if(r==null){
                      r=cr.toViewCrew(); 
                   }else{ 
                   r=r+ cr.toViewCrew();
                   }
                while(true){
                    c = (Crew)ois.readObject();
                     if(r==null){
                      r=c.toViewCrewList(); 
                   }else{ 
                   r=r+ c.toViewCrewList();
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
      
      public void createCostumeDistributeList(String eventName, int costumeId, String performerName, LocalDate sDate, LocalDate eDate, String contractNumber){
           if(sDate.isBefore(eDate)){
          CostumeDistribute cd=new CostumeDistribute(
                  eventName,
                  costumeId,
                  performerName,
                  sDate,
                  eDate,
                  contractNumber
          );
           Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("Warning Alert");
        a.setContentText(cd.toString());
        a.setHeaderText(null);
        a.showAndWait(); 
     
        
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try {
            f = new File("CostumeDistribute.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
            
            
          
            
            oos.writeObject(cd);

        } catch (IOException ex) {
            //
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
               // Logger.getLogger(CreateNewProductionScheduleRadioButtonController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } }
        else
        {
            Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("Warning Alert");
        a.setContentText("End Date must be greater than Start Date");
        a.setHeaderText(null);
        a.showAndWait();
        } 
          
      }
      
       public List<CostumeDistribute> viewCostumeDistributeList(){
    
        ObjectInputStream ois=null;
        List<CostumeDistribute> cdList = new ArrayList<>();
        try {
            
            ois = new ObjectInputStream(new FileInputStream("CostumeDistribute.bin"));
            
            while(true){
                try{
                    CostumeDistribute cd = (CostumeDistribute) ois.readObject();
                    cdList.add(cd);
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
        return cdList;
    }
     
       public void createCostumeRequiremenList(int numOfCostumeRequired, LocalDate sDate, LocalDate eDate, String designerName, String specificRequirement){
          if(sDate.isBefore(eDate)){
           CostumeRequirement cr=new CostumeRequirement(
                 numOfCostumeRequired,
                 sDate, 
                 eDate,
                 designerName, 
                 specificRequirement
          );
           Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("Warning Alert");
        a.setContentText(cr.toString());
        a.setHeaderText(null);
        a.showAndWait(); 
     
        
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try {
            f = new File("CostumeRequirement.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
            
            
          
            
            oos.writeObject(cr);

        } catch (IOException ex) {
            //
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
               // Logger.getLogger(CreateNewProductionScheduleRadioButtonController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }  }
        else
        {
            Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("Warning Alert");
        a.setContentText("End Date must be greater than Start Date");
        a.setHeaderText(null);
        a.showAndWait();
        }
          
      }
      
       public void createEventRequirement(String typeOfEvent, LocalDate date, LocalTime time, int numberOdAttendance, float budget){
          EventRequirement er=new EventRequirement(
                 typeOfEvent,
                 date,
                 time,
                 numberOdAttendance,
                 budget
          );
           Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("Warning Alert");
        a.setContentText(er.toString());
        a.setHeaderText(null);
        a.showAndWait(); 
     
        
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try {
            f = new File("EventRequirement.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
            
            
          
            
            oos.writeObject(er);

        } catch (IOException ex) {
            //
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
               // Logger.getLogger(CreateNewProductionScheduleRadioButtonController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
          
      }
      
       public void createShortListVenue(String location, int capacity, String parkingAccessibility, String vanueManagerName, float budget){
          Venue v=new Venue(
                 location,
                 capacity,
                 parkingAccessibility,
                 vanueManagerName,
                 budget
          );
           Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("Warning Alert");
        a.setContentText(v.toString());
        a.setHeaderText(null);
        a.showAndWait(); 
     
        
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try {
            f = new File("ShortListVenue.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
            
            
          
            
            oos.writeObject(v);

        } catch (IOException ex) {
            //
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
               // Logger.getLogger(CreateNewProductionScheduleRadioButtonController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
         
       }
        public List<Venue> viewShortListVenue(){
    
        ObjectInputStream ois=null;
        List<Venue> vList = new ArrayList<>();
        try {
            
            ois = new ObjectInputStream(new FileInputStream("ShortListVenue.bin"));
            
            while(true){
                try{
                    Venue v = (Venue) ois.readObject();
                    vList.add(v);
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
        return vList;
    }
        
        public void createFinalVenue(String location, int capacity, String parkingAccessibility, String vanueManagerName, float budget){
          Venue v=new Venue(
                 location,
                 capacity,
                 parkingAccessibility,
                 vanueManagerName,
                 budget
          );
           Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle("Warning Alert");
        a.setContentText(v.toString());
        a.setHeaderText(null);
        a.showAndWait(); 
     
        
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try {
            f = new File("FinalVenue.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
            
            
          
            
            oos.writeObject(v);

        } catch (IOException ex) {
            //
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
               // Logger.getLogger(CreateNewProductionScheduleRadioButtonController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
         
       }
        
    
      }
      
       
