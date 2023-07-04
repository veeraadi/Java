package Tasks.Day7;

public class P14 {
    public static void main(String[] args) {
        int x=5;
        for(int i=1;i<6;i++){
            for(int k=0;k<x;k++){
                System.out.print(" ");
            }
            for(int j=5;j>=i;j--){
                System.out.print(j);
            }
            x--;
            System.out.println();
        }
    }
}
