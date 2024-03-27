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
public class LeaveApplication implements Serializable {

    static void appendText(String all_Rehearsal_Time_objects_are_loaded_suc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private int employeeId;
    private String department;
    private LocalDate startDate,endDate;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public LeaveApplication(int employeeId, String department, LocalDate startDate, LocalDate endDate) {
        this.employeeId = employeeId;
        this.department = department;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "LeaveApplication{" + "employeeId=" + employeeId + ", department=" + department + ", startDate=" + startDate + ", endDate=" + endDate + "}\n";
    }
    
    
}
