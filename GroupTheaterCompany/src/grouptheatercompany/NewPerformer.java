/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grouptheatercompany;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author 88017
 */
//public class NewPerformer 
  public class NewPerformer implements Serializable{
    
    private String name;
    private String type;
    private String gender;
    private LocalDate birthday;
    private int nid;

    public NewPerformer(String name, String type, String gender, LocalDate birthday, int nid) {
        this.name = name;
        this.type = type;
        this.gender = gender;
        this.birthday = birthday;
        this.nid = nid;
    }
public void submitReport(){}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }

    @Override
    public String toString() {
        return "AddPerformer{" + "Name=" + name + ", Performer type=" + type + ", Gender=" + gender + ", Birthday=" + birthday + ", Nid=" + nid + '}'+"\n";
    }

   
    public void display(){
        System.out.println("Name="+name+",type="+type+", gender="+gender+", birthday="+birthday+", nid="+nid);
    }
    
    
    
}
