package Conditions;

public class Conditions {
    public static void main(String[] args) {
        int a=15;
        System.out.println("--------------------------------------------------------");
        System.out.println("Only if execution");
        if(a==15){
            System.out.println("a is equal to 15");
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("if and else execution");
        if(a<15){
            System.out.println("a is less than 15");
        }
        else{
            System.out.println("a is greater than or equal to 15");
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("if, elseif and else execution");
        if(a>10){
            System.out.println("a is greater than 10");
        }
        else if(a==10){
            System.out.println("a is equal to 10");
        }
        else{
            System.out.println("a is less than 10");
        }
        System.out.println("--------------------------------------------------------");
    }
}
