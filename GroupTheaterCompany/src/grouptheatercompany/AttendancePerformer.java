/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grouptheatercompany;

import java.io.Serializable;
import java.time.LocalDate;
/**
 *
 * @author User
 */
public class AttendancePerformer implements Serializable{
   
    
    private String performerName;
    private int performerID;

    public String getPerformerName() {
        return performerName;
    }

    public void setPerformerName(String performerName) {
        this.performerName = performerName;
    }

    public int getPerformerID() {
        return performerID;
    }

    public void setPerformerID(int performerID) {
        this.performerID = performerID;
    }

    public AttendancePerformer(String performerName, int performerID) {
        this.performerName = performerName;
        this.performerID = performerID;
    }

    @Override
    public String toString() {
        return "AttendancePerformer{" + "performerName=" + performerName + ", performerID=" + performerID + "}\n";
    }
    
    
    
    
}
