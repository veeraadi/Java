package MarkerInterface;

public class EmployeeMainCloneable {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("\n\nOriginal Employee Details: ");
        Employee eOriginal=new Employee(101,"Adithya",700000,"Bangalore");
        eOriginal.getEmployeeDetails();

        System.out.println("=====================================================================================\n\n");


        System.out.println("Duplicate Employee Details: ");
        Object obj=eOriginal.clone();
        Employee eDuplicate=(Employee)obj;
        eDuplicate.getEmployeeDetails();
        System.out.println("=====================================================================================\n\n");
        System.out.println("Reference values of objects: \n");
        System.out.println("Original Employee Parameterized Const Ref Object: "+eOriginal);
        System.out.println("Duplicate Employee Parameterized Const Ref Object: "+eDuplicate);
        System.out.println("=====================================================================================\n\n");

        eOriginal.change("Veera");
        System.out.println("Original Employee Details: ");
        eOriginal.getEmployeeDetails();
        System.out.println("=====================================================================================\n\n");


        System.out.println("Duplicate Employee Details: ");
        eOriginal.getEmployeeDetails();
        System.out.println("=====================================================================================\n\n");
    }
}
