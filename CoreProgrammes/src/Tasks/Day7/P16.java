package Tasks.Day7;

public class P16 {
    public static void main(String[] args) {
        for(int i=5;i>0;i--){
            for(int j=1;j<6;j++){
                if(j<i){
                    System.out.print(" ");
                }
                else{
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
