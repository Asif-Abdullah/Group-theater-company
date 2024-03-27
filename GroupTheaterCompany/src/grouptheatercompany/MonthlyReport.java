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
public class MonthlyReport implements Serializable {
    private int salary;
    private int Tcost;
    private int ArCost;
    private int Ebill;
    private String month;
    private int ticketseles;

    public MonthlyReport(int salary, int Tcost, int ArCost, int Ebill, String month, int ticketseles) {
        this.salary = salary;
        this.Tcost = Tcost;
        this.ArCost = ArCost;
        this.Ebill = Ebill;
        this.month = month;
        this.ticketseles = ticketseles;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getTcost() {
        return Tcost;
    }

    public void setTcost(int Tcost) {
        this.Tcost = Tcost;
    }

    public int getArCost() {
        return ArCost;
    }

    public void setArCost(int ArCost) {
        this.ArCost = ArCost;
    }

    public int getEbill() {
        return Ebill;
    }

    public void setEbill(int Ebill) {
        this.Ebill = Ebill;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getTicketseles() {
        return ticketseles;
    }

    public void setTicketseles(int ticketseles) {
        this.ticketseles = ticketseles;
    }

    @Override
    public String toString() {
        return "MonthlyReport{" + "salary=" + salary + ", Tcost=" + Tcost + ", ArCost=" + ArCost + ", Ebill=" + Ebill + ", month=" + month + ", ticketseles=" + ticketseles + '}';
    }
    
    
}
