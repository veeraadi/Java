package Methods;

public class StaticMethod {
    static int g=56;
    public static void ex1(){
        System.out.println("Static Method Example Method Ex1");
    }

    public static void main(String[] args) {
        System.out.println(StaticMethod.g);
        StaticMethod.ex1();
    }
}