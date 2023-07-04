package Operators;

public class Assignment {
    public static void main(String[] args) {
        int a= 8556;
        int b=a;
        int c=7;
        char p= 'T';
        String q="Java Assignment";
        String e=q;
        System.out.println("Int Assignment: "+b+"\nChar Assignment: "+p+"\nString Assignment: "+e);
        System.out.println("--------------------------'+='--------------------------");
        a+=c;
        System.out.println("Add and assignment Operator: "+a);
        System.out.println("--------------------------'-='--------------------------");
        a-=c;
        System.out.println("Subtract and assignment Operator: "+a);
        System.out.println("--------------------------'*='--------------------------");
        a*=c;
        System.out.println("Multiply and assignment Operator: "+a);
        System.out.println("--------------------------'/='--------------------------");
        a/=c;
        System.out.println("Division and assignment Operator: "+a);
        System.out.println("--------------------------'%='--------------------------");
        a%=c;
        System.out.println("Modulo and assignment Operator: "+a);
        System.out.println("--------------------------------------------------------");
    }
}
