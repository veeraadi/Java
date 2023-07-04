package Variable;

public class NonStatic {
    int l=518;
    float p = 67f;
    double d=54d;
    char a='t';
    public static void main(String[] args) {
        NonStatic var=new NonStatic(); //Object to access the instance variable
        System.out.println("Instance Int: "+var.l);
        System.out.println("Instance Char: "+var.a);
        System.out.println("Instance Float: "+var.p);
        System.out.println("Instance Double: "+var.d);
    }
}
