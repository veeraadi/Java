package Tasks.Day7;

public class P8 {
    public static void main(String[] args) {
        int k=1;
        for(int i=1;i<6;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k+++" ");
            }
            System.out.println();
        }
    }
}
