package Tasks.Day6;

public class Day6p9 {
    public static void main(String[] args) {
        for (int i=5;i>0;i-=1){
            for(int j=5;j>=i;j-=1){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
