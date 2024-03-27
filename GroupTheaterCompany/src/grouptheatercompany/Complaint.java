/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grouptheatercompany;

import java.io.Serializable;

/**
 *
 * @author 88017
 */
public class Complaint implements Serializable{
    private String name;
    private String complaint;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }

    public Complaint(String name, String complaint) {
        this.name = name;
        this.complaint = complaint;
    }

    @Override
    public String toString() {
        return "Complaint{" + "name=" + name + ", complaint=" + complaint + "}\n";
    }
    
    
    
}
