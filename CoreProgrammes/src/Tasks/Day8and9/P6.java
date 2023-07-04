package Tasks.Day8and9;

public class P6 {
    public static void main(String[] args) {
        int a=1;
        int b=2,c;
        System.out.print(a+" ");
        while (b<90){
            System.out.print(b+" ");
            c=b;
            b+=a;
            a=c;
        }
    }
}
