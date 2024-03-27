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
 * @author User
 */
public class Booking implements Serializable{
    
     private String showsName;
     private LocalDate showDate;
     private int bookedTicket;

    public String getShowsName() {
        return showsName;
    }

    public void setShowsName(String showsName) {
        this.showsName = showsName;
    }

    public LocalDate getShowDate() {
        return showDate;
    }

    public void setShowDate(LocalDate showDate) {
        this.showDate = showDate;
    }

    public int getBookedTicket() {
        return bookedTicket;
    }

    public void setBookedTicket(int bookedTicket) {
        this.bookedTicket = bookedTicket;
    }

    public Booking(String showsName, LocalDate showDate, int bookedTicket) {
        this.showsName = showsName;
        this.showDate = showDate;
        this.bookedTicket = bookedTicket;
    }

    @Override
    public String toString() {
        return "Booking{" + "showsName=" + showsName + ", showDate=" + showDate + ", bookedTicket=" + bookedTicket + "}\n";
    }
     
     
}
