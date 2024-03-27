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
public class Report implements Serializable {
     private LocalDate showDate;
     private String showsName;
     private int totalSell;

    public LocalDate getShowDate() {
        return showDate;
    }

    public void setShowDate(LocalDate showDate) {
        this.showDate = showDate;
    }

    public String getShowsName() {
        return showsName;
    }

    public void setShowsName(String showsName) {
        this.showsName = showsName;
    }

    public int getTotalSell() {
        return totalSell;
    }

    public void setTotalSell(int totalSell) {
        this.totalSell = totalSell;
    }

    public Report(LocalDate showDate, String showsName, int totalSell) {
        this.showDate = showDate;
        this.showsName = showsName;
        this.totalSell = totalSell;
    }

    @Override
    public String toString() {
        return "Report{" + "showDate=" + showDate + ", showsName=" + showsName + ", totalSell=" + totalSell + "}\n";
    }
     
     
        
     
}
