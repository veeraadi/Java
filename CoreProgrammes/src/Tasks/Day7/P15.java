package Tasks.Day7;

public class P15 {
    public static void main(String[] args) {
        for(int i=5;i>0;i--){
            int k=5;
            for(int j=1;j<6;j++){
                if(j<i){
                    System.out.print(" ");
                }
                else{
                    System.out.print(k);
                    k--;
                }
            }
            System.out.println();
        }
    }
}
