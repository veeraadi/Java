package Constructors;

import java.nio.file.FileSystemLoopException;

public class Employee {
    private int eId;
    private double eSalary;
    private String eName;


    //Default Constructor
    Employee(){
    }


    //Parameterized Constructor
    Employee(int id, double salary, String name){
        this.eId=id;
        this.eSalary=salary;
        this.eName=name;
    }

    //Copy Constructor
    Employee(Employee emp){
        this.eId=emp.eId;
        this.eName=emp.eName;
        this.eSalary=emp.eSalary;
    }


    public void seteId(int id){
        this.eId=id;
    }
    public int geteId(){
        return this.eId;
    }
    public double geteSalary() {
        return eSalary;
    }
    public void seteSalary(double eSalary) {
        this.eSalary = eSalary;
    }
    public String geteName() {
        return eName;
    }
    public void seteName(String eName) {
        this.eName = eName;
    }
    public String getdetails(){
        return "Id: "+this.eId+"\n"+"Name: "+this.eName+"\n"+"Salary: "+this.eSalary;
    }
}
