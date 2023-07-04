package Inheritance.Multilevel;

public class Main {
    public static void main(String[] args) {
        C c=new C();
        System.out.println("==============");
        System.out.println("Class C");
        System.out.println("-------");
        c.m3();
        System.out.println("==============");
        System.out.println("Class B");
        System.out.println("-------");
        B b =new B();
        System.out.println(b.i);
        System.out.println(b.j);
        b.m2();
        b.m1();
        System.out.println("==============");
        System.out.println("Class A");
        System.out.println("-------");
        A a = new A();
        System.out.println(a.i);
        a.m1();
        System.out.println("==============");
    }
}
