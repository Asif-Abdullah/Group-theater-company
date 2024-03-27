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
 * @author JOY SAHA
 */
public class Crew implements Serializable {
    private String projectName;
    private int totalNumberOfCrewMembers;
    private String name,asignDuties;
    private LocalDate date;
    private String contractNumber;
    private float salary;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getTotalNumberOfCrewMembers() {
        return totalNumberOfCrewMembers;
    }

    public void setTotalNumberOfCrewMembers(int totalNumberOfCrewMembers) {
        this.totalNumberOfCrewMembers = totalNumberOfCrewMembers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAsignDuties() {
        return asignDuties;
    }

    public void setAsignDuties(String asignDuties) {
        this.asignDuties = asignDuties;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Crew(String name, String asignDuties, LocalDate date, String contractNumber, float salary) {
        this.name = name;
        this.asignDuties = asignDuties;
        this.date = date;
        this.contractNumber = contractNumber;
        this.salary = salary;
    }

    public Crew(String projectName, int totalNumberOfCrewMembers) {
        this.projectName = projectName;
        this.totalNumberOfCrewMembers = totalNumberOfCrewMembers;
    }
    
    @Override
    public String toString() {
        return "Crew{" + "name=" + name + ", asignDuties=" + asignDuties + ", date=" + date + ", contractNumber=" + contractNumber + ", salary=" + salary + '}';
    }
    
    public String toViewCrewList() {
        return "Name: " + name + ", Asign Duties: " + asignDuties + ", Date: " + date + ", Contract Number: " + contractNumber + ", Salary: " + salary + "\n";
    }
    public String toViewCrew() {
        return "Project Name: " + projectName + "\n Total Number Of Crew Members: " + totalNumberOfCrewMembers  + "\n";
    }
}
