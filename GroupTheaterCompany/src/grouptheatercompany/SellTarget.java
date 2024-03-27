/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grouptheatercompany;

import java.time.LocalDate;

/**
 *
 * @author User
 */
public class SellTarget {
     private String showsName;
     private int salesTarget;
     private LocalDate showDate;
     private int sales;

    public String getShowsName() {
        return showsName;
    }

    public void setShowsName(String showsName) {
        this.showsName = showsName;
    }

    public int getSalesTarget() {
        return salesTarget;
    }

    public void setSalesTarget(int salesTarget) {
        this.salesTarget = salesTarget;
    }

    public LocalDate getShowDate() {
        return showDate;
    }

    public void setShowDate(LocalDate showDate) {
        this.showDate = showDate;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public SellTarget(String showsName, int salesTarget, LocalDate showDate, int sales) {
        this.showsName = showsName;
        this.salesTarget = salesTarget;
        this.showDate = showDate;
        this.sales = sales;
    }

    @Override
    public String toString() {
        return "SellTarget{" + "showsName=" + showsName + ", salesTarget=" + salesTarget + ", showDate=" + showDate + ", sales=" + sales + '}';
    }
     
     
     
     
     
     
     
    
}
