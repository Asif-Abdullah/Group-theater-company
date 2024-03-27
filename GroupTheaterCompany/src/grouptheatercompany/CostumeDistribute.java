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
public class CostumeDistribute implements Serializable {
    private String eventName,performerName;
    private int costumeId;
    private String contractNumber;
    private LocalDate startDate, endDate;

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getPerformerName() {
        return performerName;
    }

    public void setPerformerName(String performerName) {
        this.performerName = performerName;
    }

    public int getCostumeId() {
        return costumeId;
    }

    public void setCostumeId(int costumeId) {
        this.costumeId = costumeId;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
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

    public CostumeDistribute(String eventName, int costumeId, String performerName, LocalDate startDate, LocalDate endDate , String contractNumber) {
        this.eventName = eventName;
        this.costumeId = costumeId;
        this.performerName = performerName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.contractNumber = contractNumber;
    }

    @Override
    public String toString() {
        return "CostumeDistribute{" + "eventName=" + eventName + ", performerName=" + performerName + ", costumeId=" + costumeId + ", contractNumber=" + contractNumber + ", startDate=" + startDate + ", endDate=" + endDate + '}';
    }
    public String toViewCostumeDistributeList() {
        return "CostumeDistribute{" + "Event Name: " + eventName + ", Performer Name: " + performerName + ", Costume Id: " + costumeId + ", Contract Number=" + contractNumber + ", Start Date: " + startDate + ", End Date: " + endDate + "}\n";
    } 
    
    
}
