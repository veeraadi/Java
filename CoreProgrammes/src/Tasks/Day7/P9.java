package Tasks.Day7;

public class P9 {
    public static void main(String[] args) {
        for(int i=1;i<6;i++){
            int k=i;
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
                k+=5;
            }
            System.out.println();
        }
    }
}
