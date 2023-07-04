package Inheritance.Single;

import Inheritance.Single.Employee;

public class Manager extends Employee {
    private String Designation;

    public Manager(int id, String name, String loc, double salary, String designation) {
        super(id, name, loc, salary);
        Designation = designation;
    }
    public void getdetailsManager(){
        getEmployeeDetails();
        System.out.println("Employee Designation: "+Designation);
    }
}
