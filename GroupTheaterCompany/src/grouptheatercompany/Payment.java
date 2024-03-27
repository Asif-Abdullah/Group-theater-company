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
public class Payment implements Serializable{
     private String showsName;
     private float totalAmount, cashAmount, changeAmount;

    public String getShowsName() {
        return showsName;
    }

    public void setShowsName(String showsName) {
        this.showsName = showsName;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public float getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(float cashAmount) {
        this.cashAmount = cashAmount;
    }

    public float getChangeAmount() {
        return changeAmount;
    }

    public void setChangeAmount(float changeAmount) {
        this.changeAmount = changeAmount;
    }

    public Payment(String showsName, float totalAmount, float cashAmount, float changeAmount) {
        this.showsName = showsName;
        this.totalAmount = totalAmount;
        this.cashAmount = cashAmount;
        this.changeAmount = changeAmount;
    }

    @Override
    public String toString() {
        return "Payment{" + "showsName=" + showsName + ", totalAmount=" + totalAmount + ", cashAmount=" + cashAmount + ", changeAmount=" + changeAmount + "}\n";
    }
     
     
     
      
     
}
