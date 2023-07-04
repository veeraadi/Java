package Constructors;

public class Student {
    int i,j;
    Student(){
        i=10;
        j=23;
    }
    public void add(){
        System.out.println("Additon of Numbers: "+(i+j));
    }
    public void sub(){
        System.out.println("Subtraction of Numbers: "+(i-j));
    }
    public void mul(){
        System.out.println("Multiplication of Numbers: "+(i*j));
    }
}
