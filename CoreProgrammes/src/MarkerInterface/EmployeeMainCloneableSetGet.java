package MarkerInterface;

public class EmployeeMainCloneableSetGet {
    public static void main(String[] args) throws CloneNotSupportedException{
        System.out.println("\n\nOriginal Employee Details: ");
        EmployeeSetGet e1Original=new EmployeeSetGet();
        e1Original.setId(102);
        e1Original.setName("Dharani");
        e1Original.setSalary(350000);
        e1Original.setLoc("Mysore");
        System.out.println("\nEmployee Details: ");
        System.out.println("=====================================================================================");
        System.out.println("Employee Id: "+ e1Original.getId());
        System.out.println("Employee Name: "+ e1Original.getName());
        System.out.println("Employee Salary: "+e1Original.getSalary());
        System.out.println("Employee Location: "+ e1Original.getLoc());
        System.out.println("=====================================================================================\n\n");
        System.out.println("Duplicate Employee Details: ");
        Object obj=e1Original.clone();
        EmployeeSetGet e1Duplicate=(EmployeeSetGet) obj;
        System.out.println("\nEmployee Details: ");
        System.out.println("=====================================================================================");
        System.out.println("Employee Id: "+ e1Duplicate.getId());
        System.out.println("Employee Name: "+ e1Duplicate.getName());
        System.out.println("Employee Salary: "+e1Duplicate.getSalary());
        System.out.println("Employee Location: "+ e1Duplicate.getLoc());
        System.out.println("=====================================================================================");
        System.out.println("\nReference values of the objects created using Setters and Getters: \n");
        System.out.println("Original Employee Setter Getter Ref Object: "+e1Original);
        System.out.println("Duplicate Employee Setter Getter Ref Object: "+e1Duplicate);
        System.out.println("=====================================================================================\n\n");

    }
}
