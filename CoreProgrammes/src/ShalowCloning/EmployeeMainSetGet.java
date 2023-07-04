package ShalowCloning;

public class EmployeeMainSetGet {
    public static void main(String[] args) throws CloneNotSupportedException{
        Accounts a=new Accounts();
        a.setNo(848413);
        a.setBalance(34684);
        a.setName("Adithya");
        a.setType("Savings");
        Employee e=new Employee(102,"Adithya",700000,"Bangalore",a);
        System.out.println("\nOriginal Employee Details: ");
        e.getdetails();

        Employee duplicate=(Employee) e.clone();
        System.out.println("\nDuplicate Employee Details: ");
        duplicate.getdetails();
        System.out.println("\nObject References: ");
        System.out.println("====================================================================");
        System.out.println("Original Employee Object Reference: "+e);
        System.out.println("Duplicate Employee Object Reference: "+duplicate);
        System.out.println("Original Account Object Reference: "+a);
        System.out.println("Duplicate Account Object Reference: "+e.acc);
        System.out.println("====================================================================");
    }
}
