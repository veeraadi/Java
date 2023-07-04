package Operators;

public class Logical {
    public static void main(String[] args) {
        int a = 64;
        int b = 28;
        int c = 548;
        boolean p = true;
        boolean q = false;
        System.out.println(p&&q);
        System.out.println(p||q);
        System.out.println(!q);
        if (a>b && a>c){
            System.out.println(a+" is the largest number");
        }
        else{
            System.out.println(c+" is the largest number");
        }
    }
}
