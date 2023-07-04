package Inheritance.Single;

public class Employee {
    private int Id;
    private String Name;
    private String Loc;
    private double Salary;

    public Employee() {
    }

    public Employee(int id, String name, String loc, double salary) {
        Id = id;
        Name = name;
        Loc = loc;
        Salary = salary;
    }
    public void getEmployeeDetails(){
        System.out.println("Employee Details");
        System.out.println("================================");
        System.out.println("Employee Id: "+Id);
        System.out.println("Employee Name: "+Name);
        System.out.println("Employee Salary: "+Salary);
        System.out.println("Employee Location: "+Loc);

    }
}
