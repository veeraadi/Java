package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.aSet(345);
        e1.bSet(487);
        System.out.println("The value of a: "+e1.aGet());
        System.out.println("The value of a: "+e1.bGet());
    }
}
