/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grouptheatercompany;

import java.io.Serializable;

/**
 *
 * @author JOY SAHA
 */
public class Note implements Serializable {
    private int totalTicketSales, onlineSales,thirdPartyVendor,totalCancelTicket;
    private float revenue;

    public int getTotalTicketSales() {
        return totalTicketSales;
    }

    public void setTotalTicketSales(int totalTicketSales) {
        this.totalTicketSales = totalTicketSales;
    }

    public int getOnlineSales() {
        return onlineSales;
    }

    public void setOnlineSales(int onlineSales) {
        this.onlineSales = onlineSales;
    }

    public int getThirdPartyVendor() {
        return thirdPartyVendor;
    }

    public void setThirdPartyVendor(int thirdPartyVendor) {
        this.thirdPartyVendor = thirdPartyVendor;
    }

    public int getTotalCancelTicket() {
        return totalCancelTicket;
    }

    public void setTotalCancelTicket(int totalCancelTicket) {
        this.totalCancelTicket = totalCancelTicket;
    }

    public float getRevenue() {
        return revenue;
    }

    public void setRevenue(float revenue) {
        this.revenue = revenue;
    }

    public Note(int totalTicketSales, int onlineSales, int thirdPartyVendor, int totalCancelTicket, float revenue) {
        this.totalTicketSales = totalTicketSales;
        this.onlineSales = onlineSales;
        this.thirdPartyVendor = thirdPartyVendor;
        this.totalCancelTicket = totalCancelTicket;
        this.revenue = revenue;
    }

    @Override
    public String toString() {
        return "Note{" + "totalTicketSales=" + totalTicketSales + ", onlineSales=" + onlineSales + ", thirdPartyVendor=" + thirdPartyVendor + ", totalCancelTicket=" + totalCancelTicket + ", revenue=" + revenue + '}';
    }
    
    public String toViewNote() {
        return "TotalTicketSales: " + totalTicketSales + ", OnlineSales: " + onlineSales + ", ThirdPartyVendor: " + thirdPartyVendor + ", TotalCancelTicket: " + totalCancelTicket + ", Revenue: " + revenue + "\n";
    }
}
