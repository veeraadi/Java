package Inheritance.Single;

public class MainEx {
    public static void main(String[] args) {
        Employee emp=new Employee(101,"Adithya","Bangalore",700000);
        System.out.println("================================");
        emp.getEmployeeDetails();
        System.out.println("================================");

        Manager m=new Manager(102,"Tejaswi","Bangalore",1000000,"Manager");
        m.getdetailsManager();
        System.out.println("================================");
        m.getEmployeeDetails();
        System.out.println("================================");
    }
}
