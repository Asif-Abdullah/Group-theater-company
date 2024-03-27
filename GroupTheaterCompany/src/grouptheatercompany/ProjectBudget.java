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
public class ProjectBudget implements Serializable {

    private int PerformerCost;
    private int ConstructionLaborCost;
    private int EquipmentRentalCost;
    private int SoundSystemCost;
    private int LocationRent;
    private int Otherexpenses;

    public int getPerformerCost() {
        return PerformerCost;
    }

    public void setPerformerCost(int PerformerCost) {
        this.PerformerCost = PerformerCost;
    }

    public int getConstructionLaborCost() {
        return ConstructionLaborCost;
    }

    public void setConstructionLaborCost(int ConstructionLaborCost) {
        this.ConstructionLaborCost = ConstructionLaborCost;
    }

    public int getEquipmentRentalCost() {
        return EquipmentRentalCost;
    }

    public void setEquipmentRentalCost(int EquipmentRentalCost) {
        this.EquipmentRentalCost = EquipmentRentalCost;
    }

    public int getSoundSystemCost() {
        return SoundSystemCost;
    }

    public void setSoundSystemCost(int SoundSystemCost) {
        this.SoundSystemCost = SoundSystemCost;
    }

    public int getLocationRent() {
        return LocationRent;
    }

    public void setLocationRent(int LocationRent) {
        this.LocationRent = LocationRent;
    }

    public int getOtherexpenses() {
        return Otherexpenses;
    }

    public void setOtherexpenses(int Otherexpenses) {
        this.Otherexpenses = Otherexpenses;
    }

    public ProjectBudget(int PerformerCost, int ConstructionLaborCost, int EquipmentRentalCost, int SoundSystemCost, int LocationRent, int Otherexpenses) {
        this.PerformerCost = PerformerCost;
        this.ConstructionLaborCost = ConstructionLaborCost;
        this.EquipmentRentalCost = EquipmentRentalCost;
        this.SoundSystemCost = SoundSystemCost;
        this.LocationRent = LocationRent;
        this.Otherexpenses = Otherexpenses;
    }

    @Override
    public String toString() {
        return "ProjectBudget{" + "PerformerCost=" + PerformerCost + ", ConstructionLaborCost=" + ConstructionLaborCost + ", EquipmentRentalCost=" + EquipmentRentalCost + ", SoundSystemCost=" + SoundSystemCost + ", LocationRent=" + LocationRent + ", Otherexpenses=" + Otherexpenses +"}\n";
    }
    

}
