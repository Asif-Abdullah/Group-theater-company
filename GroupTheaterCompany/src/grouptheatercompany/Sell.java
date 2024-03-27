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
public class Sell {
      private String showsName;
       private LocalDate showDate;
     private int ticketPrice;
    
     private String tickets;

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

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getTickets() {
        return tickets;
    }

    public void setTickets(String tickets) {
        this.tickets = tickets;
    }

    public Sell(String showsName, LocalDate showDate, int ticketPrice, String tickets) {
        this.showsName = showsName;
        this.showDate = showDate;
        this.ticketPrice = ticketPrice;
        this.tickets = tickets;
    }

    @Override
    public String toString() {
        return "Sell{" + "showsName=" + showsName + ", showDate=" + showDate + ", ticketPrice=" + ticketPrice + ", tickets=" + tickets + '}';
    }
     
     
     
    
}
