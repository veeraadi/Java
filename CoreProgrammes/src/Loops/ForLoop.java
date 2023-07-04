package Loops;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------");
        System.out.println("Numbers");
        for (int j=0;j<10;j++){
            System.out.println(j);
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("Five Table");
        for (int i=1;i<=10;i++){
            System.out.println("5 * "+i+" = "+i*5);
        }
        System.out.println("--------------------------------------------------------");
        int k=0;
        for(System.out.println("Hello");k<10;k++){
            System.out.println(k);
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("Decrement: ");
        for(int a=100; a>2; a-=2){
            System.out.print(a+" ");
        }
        System.out.println("\n--------------------------------------------------------");
        System.out.println("Local Variable: ");
        int count=0;
        for (int b=1; b<=10; b++){
            count+=b;
        }
        System.out.println(count);
        System.out.println("--------------------------------------------------------");
    }
}
