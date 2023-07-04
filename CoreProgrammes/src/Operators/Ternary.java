package Operators;

public class Ternary {
    public static void main(String[] args) {
        int a = 61;
        int b = 34;
        int t = (a > b) ? a : b;
        System.out.println(t + "\n");
        int c = 974, d = 347;
        String t2 = (c % 2 == 0) ? "Even" : "Odd";
        System.out.println(t2 + "\n");
        String t3 = (d % 2 == 0) ? "Even" : "Odd";
        System.out.println(t3);
    }
}