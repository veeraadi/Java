package Operators;

public class incrementandDecrement {
    public static void main(String[] args) {
        //Post Increment
        int a = 924;
        int b = a++;                                //Assignment after increment
        System.out.println("Post Increment");
        System.out.println("b=" + b + "\na=" + a);
        //Post Decrement
        int c=971;
        int d=c--;                                  //Assignment after Decrement
        System.out.println("Post Decrement");
        System.out.println("d=" + d + "\nc=" + c);
        //Pre Increment
        int e=641;
        int f=++e;                                  //Increment before Assignment
        System.out.println("Pre Increment");
        System.out.println("e=" + e + "\nf=" + f);
        //Pre Decrement
        int g=426;
        int h=--g;                                  //Decrement before Assignment
        System.out.println("Pre Decrement");
        System.out.println("g=" + g + "\nh=" + h);
        //Trails
        int i=628;
        System.out.println("Trails");
        System.out.println(i++);
        System.out.println(i++);
        System.out.println(--i);
    }
}
