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
 * @author 88017
 */
public class EmployeeLeaveApplication implements Serializable{
    private String name;
    private int id;
    private String Desig;
    private LocalDate stday,endday;
    private  String levdiss;

    public EmployeeLeaveApplication(String name, int id, String Desig, LocalDate stday, LocalDate endday, String levdiss) {
        this.name = name;
        this.id = id;
        this.Desig = Desig;
        this.stday = stday;
        this.endday = endday;
        this.levdiss = levdiss;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesig() {
        return Desig;
    }

    public void setDesig(String Desig) {
        this.Desig = Desig;
    }

    public LocalDate getStday() {
        return stday;
    }

    public void setStday(LocalDate stday) {
        this.stday = stday;
    }

    public LocalDate getEndday() {
        return endday;
    }

    public void setEndday(LocalDate endday) {
        this.endday = endday;
    }

    public String getLevdiss() {
        return levdiss;
    }

    public void setLevdiss(String levdiss) {
        this.levdiss = levdiss;
    }

    @Override
    public String toString() {
        return "EmployeeLeaveApplication{" + "name=" + name + ", id=" + id + ", Desig=" + Desig + ", stday=" + stday + ", endday=" + endday + ", levdiss=" + levdiss + "}\n";
    }   
    
}
