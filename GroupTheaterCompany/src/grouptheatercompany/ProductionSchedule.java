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
 * @author JOY SAHA
 */
public class ProductionSchedule implements Serializable {
    private int quantity;
    private String productName,supervisorName,notes;
    private LocalDate startDate,endDate;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSupervisorName() {
        return supervisorName;
    }

    public void setSupervisorName(String supervisorName) {
        this.supervisorName = supervisorName;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public ProductionSchedule(String productName, int quantity, LocalDate startDate, LocalDate endDate, String supervisorName, String notes) {
        this.productName = productName;
        this.quantity = quantity;
        this.startDate = startDate;
        this.endDate = endDate;
        this.supervisorName = supervisorName;
        this.notes = notes;
       }

    @Override
    public String toString() {
        return "ProductionSchedule{" + "quantity=" + quantity + ", productName=" + productName + ", supervisorName=" + supervisorName + ", notes=" + notes + ", startDate=" + startDate + ", endDate=" + endDate + '}';
    }
    
    
     public String toViewProductionSchedule() {
        return "ProductionSchedule{" + ", productName=" + productName +"quantity=" + quantity + ", supervisorName=" + supervisorName +  ", startDate=" + startDate + ", endDate=" + endDate +", notes=" + notes + "}/n";
    }
    
}
