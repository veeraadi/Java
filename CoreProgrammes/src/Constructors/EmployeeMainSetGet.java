package Constructors;

public class EmployeeMainSetGet {
    public static void main(String[] args) {
        Employee em=new Employee();
        em.seteId(101);
        em.seteName("Narayana");
        em.seteSalary(800000);
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Object created and initialized using Setters and Getters:");
        System.out.println("Id: "+em.geteId()+"\n"+"Name: "+em.geteName()+"\n"+"Salary: "+em.geteSalary());
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Object created using em Object: ");
        Employee em1=new Employee(em);
        System.out.println("Object created and initialized using Setters and Getters:");
        System.out.println("Id: "+em.geteId()+"\n"+"Name: "+em.geteName()+"\n"+"Salary: "+em.geteSalary());
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Reference Values of Objects: ");
        System.out.println("Original object reference variable: "+em);
        System.out.println("Duplicated object reference variable: "+em1);
        System.out.println("--------------------------------------------------------------------------------------");
    }
}
