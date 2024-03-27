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
public class CostumeRequirement implements Serializable{
    private int numOfCostumeRequired;
    private LocalDate startDate, endDate;
    private String designerName, specificRequirement;

    public int getNumOfCostumeRequired() {
        return numOfCostumeRequired;
    }

    public void setNumOfCostumeRequired(int numOfCostumeRequired) {
        this.numOfCostumeRequired = numOfCostumeRequired;
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

    public String getDesignerName() {
        return designerName;
    }

    public void setDesignerName(String designerName) {
        this.designerName = designerName;
    }

    public String getSpecificRequirement() {
        return specificRequirement;
    }

    public void setSpecificRequirement(String specificRequirement) {
        this.specificRequirement = specificRequirement;
    }

    public CostumeRequirement(int numOfCostumeRequired, LocalDate startDate, LocalDate endDate, String designerName, String specificRequirement) {
        this.numOfCostumeRequired = numOfCostumeRequired;
        this.startDate = startDate;
        this.endDate = endDate;
        this.designerName = designerName;
        this.specificRequirement = specificRequirement;
    }

    @Override
    public String toString() {
        return "CostumeRequirement{" + "numOfCostumeRequired=" + numOfCostumeRequired + ", startDate=" + startDate + ", endDate=" + endDate + ", designerName=" + designerName + ", specificRequirement=" + specificRequirement + '}';
    }
    
    public String toViewCostumeRequirementList() {
        return "Costume Requirement{" + "NumOfCostumeRequired: " + numOfCostumeRequired + ", Start Date=" + startDate + ", End Date: " + endDate + ", Designer Name: " + designerName + ", specific Requirement: " + specificRequirement + "}\n";
    }
    
    
    
}
