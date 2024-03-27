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
public class RehearsalSchedule implements Serializable {
    private int rehearsalId;
    private String rehearsalPurpose,Location;
    private LocalTime startTime,endTime;
    private LocalDate date;

    public int getRehearsalId() {
        return rehearsalId;
    }

    public void setRehearsalId(int rehearsalId) {
        this.rehearsalId = rehearsalId;
    }

    public String getRehearsalPurpose() {
        return rehearsalPurpose;
    }

    public void setRehearsalPurpose(String rehearsalPurpose) {
        this.rehearsalPurpose = rehearsalPurpose;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public RehearsalSchedule(int rehearsalId, String rehearsalPurpose, LocalTime startTime, LocalTime endTime, LocalDate date, String Location) {
        this.rehearsalId = rehearsalId;
        this.rehearsalPurpose = rehearsalPurpose;
        this.startTime = startTime;
        this.endTime = endTime;
        this.date = date;
        this.Location = Location;
    }

    @Override
    public String toString() {
        return "RehearsalSchedule{" + "rehearsalId=" + rehearsalId + ", rehearsalPurpose=" + rehearsalPurpose + ", Location=" + Location + ", startTime=" + startTime + ", endTime=" + endTime + ", date=" + date + "}\n";
    }
    
    public String toViewRehearsalSchedule() {
        return "Rehearsal Schedule { "+ "Rehearsal Id: " + rehearsalId + ", Rehearsal Purpose: " + rehearsalPurpose + ", Location: " + Location + ", Start Time: " + startTime + ", End Time: " + endTime + ", Date: " + date + "}\n";
    }
    
    
    
}
