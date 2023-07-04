package Loops;

public class NestedFor {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------");
        for(int i=0;i<=5;i++){
            for (int j = 1; j<=10; j += 2){
                System.out.println(i+" "+j);
            }
        }
        System.out.println("--------------------------------------------------------");
        for(int i=1;i<=5;i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------------");
        for(int i=1;i<=5;i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------------");
        for(int i=1;i<=5;i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------------");
    }
}
