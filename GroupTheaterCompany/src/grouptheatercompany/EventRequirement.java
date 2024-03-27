/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grouptheatercompany;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author JOY SAHA
 */
public class EventRequirement implements Serializable {
    private String typeOfEvent;
    private LocalDate date;
    private LocalTime time;
    private int numberOfAttenance;
    private float budget;

    public String getTypeOfEvent() {
        return typeOfEvent;
    }

    public void setTypeOfEvent(String typeOfEvent) {
        this.typeOfEvent = typeOfEvent;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public int getNumberOfAttenance() {
        return numberOfAttenance;
    }

    public void setNumberOfAttenance(int numberOfAttenance) {
        this.numberOfAttenance = numberOfAttenance;
    }

    public float getBudget() {
        return budget;
    }

    public void setBudget(float budget) {
        this.budget = budget;
    }

    public EventRequirement(String typeOfEvent, LocalDate date, LocalTime time, int numberOfAttenance, float budget) {
        this.typeOfEvent = typeOfEvent;
        this.date = date;
        this.time = time;
        this.numberOfAttenance = numberOfAttenance;
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "EventRequirement{" + "typeOfEvent=" + typeOfEvent + ", date=" + date + ", time=" + time + ", numberOfAttenance=" + numberOfAttenance + ", budget=" + budget + '}';
    }
    
    
    public String toViewEventRequirement() {
        return "EventRequirement{" + "Type Of Event: " + typeOfEvent + ", Date: " + date + ", Time: " + time + ", Number Of Attenance: " + numberOfAttenance + ", Budget: " + budget + "}\n";
    }
    
    
}
