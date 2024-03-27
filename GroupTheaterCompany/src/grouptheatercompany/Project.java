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
public class Project implements Serializable {
    private String eventName, eventPurpose,venue;
    private float budget;
    private LocalDate date;
    private LocalTime startTime,endTime;

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventPurpose() {
        return eventPurpose;
    }

    public void setEventPurpose(String eventPurpose) {
        this.eventPurpose = eventPurpose;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public float getBudget() {
        return budget;
    }

    public void setBudget(float budget) {
        this.budget = budget;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    

    public Project(String eventName, LocalDate date, LocalTime startTime, LocalTime endTime, String venue, float budget, String eventPurpose) {
        this.eventName = eventName;
         this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.venue = venue;
        this.budget = budget;
        this.eventPurpose = eventPurpose;
        }

    @Override
    public String toString() {
        return "Project{" + "eventName=" + eventName + ", purpose=" + eventPurpose + ", venue=" + venue + ", budget=" + budget + ", date=" + date + ", sTime=" + startTime + ", eTime=" + endTime + '}';
    }
    
    public String toViewProjectDetails() {
        return "Project Details {" + "Event Name : " + eventName + ", Event Purpose : " + eventPurpose + ", Venue : " + venue + ", budget : " + budget + ", Date : " + date + ", Start Time : " + startTime + ", End Time : " + endTime + "}\n";
    }
    
}
