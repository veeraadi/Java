package Tasks.Day7;

public class P17 {
    public static void main(String[] args) {
        for(int i=2;i<=10;i+=2){
            for(int j=2;j<=i;j+=2){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
