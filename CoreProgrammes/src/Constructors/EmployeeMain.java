package Constructors;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, 450000, "Tejaswi");
        Employee e2 = new Employee(102, 700000, "Adithya");
        Employee e3 = new Employee(0, 1000000, "Poojitha");
        Employee e4 = new Employee(104, 350000, null);
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println(e1.getdetails());
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println(e2.getdetails());
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println(e3.getdetails());
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println(e4.getdetails());
        System.out.println("--------------------------------------------------------------------------------------");
        e3.seteId(103);
        e4.seteName("Dharani");
        System.out.println(e3.getdetails());
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println(e4.getdetails());
        System.out.println("--------------------------------------------------------------------------------------");
        Employee e5 = new Employee(e2);
        System.out.println("Object after using Copy Constructor:");
        System.out.println(e5.getdetails());
        System.out.println("--------------------------------------------------------------------------------------");
        /*e2.seteId(105);
        System.out.println("Object values after changing the original object but not duplicated object: \n");
        System.out.println("Changed Original object: ");
        System.out.println(e2.getdetails());
        System.out.println("--------------------------------------------------------------------------------------\n");
        System.out.println("Not changed duplicated object: ");
        System.out.println(e5.getdetails());
        System.out.println("--------------------------------------------------------------------------------------");*/
        System.out.println("Original Object Reference value: "+e2);
        System.out.println("Copied Object Reference value: "+e5);
        System.out.println("--------------------------------------------------------------------------------------");
    }
}
