package Tasks.Day7;

public class P22Prime1to10 {
    public boolean isprime(int x){
        int c=0;
        for(int i=2;i<x/2;i++){
            if(x%i==0){
                c++;
            }
        }
        if (c==0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        P22Prime1to10 var=new P22Prime1to10();
        System.out.println("Prime numbers from 1 to 10:");
        for (int j=2;j<=10;j++){
            if (var.isprime(j)){
                System.out.println(j);
            }
        }
    }
}
