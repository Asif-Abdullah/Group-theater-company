/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grouptheatercompany;

import java.io.Serializable;

/**
 *
 * @author User
 */
public class TicketConfirmation implements Serializable {
     private String customerName, bookingTicket;
    private int contactNumber;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getBookingTicket() {
        return bookingTicket;
    }

    public void setBookingTicket(String bookingTicket) {
        this.bookingTicket = bookingTicket;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public TicketConfirmation(String customerName, String bookingTicket, int contactNumber) {
        this.customerName = customerName;
        this.bookingTicket = bookingTicket;
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "TicketConfirmation{" + "customerName=" + customerName + ", bookingTicket=" + bookingTicket + ", contactNumber=" + contactNumber + "}\n";
    }
    
    
    
    
}
