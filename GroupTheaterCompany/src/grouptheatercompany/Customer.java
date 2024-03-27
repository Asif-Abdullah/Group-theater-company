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
public class Customer implements Serializable{
     private String customerName;
     private int contactNumber;
     private String customerFeedback;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getCustomerFeedback() {
        return customerFeedback;
    }

    public void setCustomerFeedback(String customerFeedback) {
        this.customerFeedback = customerFeedback;
    }

    public Customer(String customerName, int contactNumber, String customerFeedback) {
        this.customerName = customerName;
        this.contactNumber = contactNumber;
        this.customerFeedback = customerFeedback;
    }

    @Override
    public String toString() {
        return "Customer{" + "customerName=" + customerName + ", contactNumber=" + contactNumber + ", customerFeedback=" + customerFeedback + "}\n";
    }
     
     
     
   
    
    
}
