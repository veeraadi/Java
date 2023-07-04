package Constructors;

public class ParaMain {
    public static void main(String[] args) {
        parameterized stu=new parameterized("Adithya","Koilakutla",21);
        System.out.println("----------------------------------------------");
        System.out.println(stu.Intro());
        System.out.println("----------------------------------------------");
        parameterized stu2=new parameterized("Tejaswi","Koilakuntla",21);
        System.out.println(stu2.Intro());
        System.out.println("----------------------------------------------");
        parameterized stu3=new parameterized("Poojitha","Koilakuntla",21);
        System.out.println(stu3.Intro());
        System.out.println("----------------------------------------------");
        parameterized stu4=new parameterized("Dharani","Kadapa",21);
        System.out.println(stu4.Intro());
        System.out.println("----------------------------------------------");
    }
}
