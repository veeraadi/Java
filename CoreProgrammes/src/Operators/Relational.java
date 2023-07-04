package Operators;

public class Relational {
    public static void main(String[] args) {
        int a = 96;
        int b = 34;
        int c = 96;

        // "=="
        System.out.println("----------------==----------------");
        boolean d = (a==b);
        System.out.println(d);
        boolean e = (a==c);
        System.out.println(e);

        // "!="
        System.out.println("----------------!=----------------");
        boolean h = (a!=b);
        System.out.println(h);
        boolean i = (a!=c);
        System.out.println(i);

        // ">"
        System.out.println("---------------->----------------");
        boolean f = (a>b);
        System.out.println(f);
        boolean g = (a>c);
        System.out.println(g);

        // "<"
        System.out.println("----------------<----------------");
        boolean j = (b<a);
        System.out.println(j);
        boolean k = (a<c);
        System.out.println(k);

        // ">="
        System.out.println("---------------->=----------------");
        boolean l = (b>=a);
        System.out.println(l);
        boolean m = (a>=c);
        System.out.println(m);

        // "<="
        System.out.println("----------------<=----------------");
        boolean n = (a<=b);
        System.out.println(n);
        boolean o = (a<=c);
        System.out.println(o);
    }
}
