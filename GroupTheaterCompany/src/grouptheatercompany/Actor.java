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
public class Actor implements Serializable {
    private static String projectName;
    private String actorName, actorRole,note;
    private float salary;
    private String contractNumber;

    public static String getProjectName() {
        return projectName;
    }

    public static void setProjectName(String projectName) {
        Actor.projectName = projectName;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public String getActorRole() {
        return actorRole;
    }

    public void setActorRole(String actorRole) {
        this.actorRole = actorRole;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Actor(String actorName, String actorRole, float salary, String contractNumber, String note) {
        this.actorName = actorName;
        this.actorRole = actorRole;
        this.salary = salary;
        this.contractNumber = contractNumber;
        this.note = note;
    }

    
    public Actor(String actorName, String actorRole, float salary, String contractNumber) {
        this.actorName = actorName;
        this.actorRole = actorRole;
        this.salary = salary;
        this.contractNumber = contractNumber;
    }

    @Override
    public String toString() {
        return "Actor{" + "actorName = " + actorName + ", actorRole = " + actorRole + ", salary = " + salary + ", contractNumber = " + contractNumber + '}';
    }
    
   public String toViewCastActorList() {
        return "Actor{" + "Actor Name : " + actorName + ", Actor Role : " + actorRole + ", Salary : " + salary + ", Contract Number : " + contractNumber +", Notes : " + note + "}\n";
    } 
    
}
