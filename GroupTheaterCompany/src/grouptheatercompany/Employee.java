
package grouptheatercompany;

import java.io.Serializable;



//public class Employee
public class Employee implements Serializable{
 
    private String name;
    private int id;
    private String dept;
    private String Desig;
    private int salary;

  

    public Employee(String name, int id, String dept, String Desig, int salary) {
        this.name = name;
        this.id = id;
        this.dept = dept;
        this.Desig = Desig;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDesig() {
        return Desig;
    }

    public void setDesig(String Desig) {
        this.Desig = Desig;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override/*
    public String toString() {
        return "Employee{" + "name=" + name + ", id=" + id + ", dept=" + dept + ", Desig=" + Desig + ", salary=" + salary + "}\n";
    }
    */
    public String toString() {
    return "Employee{" + "name=" + name + ", id=" + id + ", dept=" + dept + ", Desig=" + Desig + ", salary=" + salary + "}\n";
}

    
    
    
    
    
}
