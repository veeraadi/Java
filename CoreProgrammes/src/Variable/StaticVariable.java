package Variable;

public class StaticVariable {
    static int i=50;
    static char c='p';
    public static void main(String[] args) {
        StaticVariable v=new StaticVariable();
        System.out.println("Hello Intellij");
        System.out.println("Static Int: "+i);
        System.out.println("Static Char: "+c);
        System.out.println("Static Int with Class name: " +v.i);
        System.out.println("Static Char with Class name: "+v.c);
    }
}
