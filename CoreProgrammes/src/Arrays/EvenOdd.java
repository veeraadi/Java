package Arrays;

public class EvenOdd {
    public static void main(String[] args) {
        int []b={541,513,8,41,643,418,151,34,28,37};
        int []a={10,20,30,40,50,60,70,80,90,100};
        System.out.println("--------------------------------------------------------");
        System.out.println("Changing array based on index value:");
        for (int i=0;i<a.length;i++){
            if(i%2==0){
                a[i]*=2;
            }
            else{
                a[i]*=3;
            }
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("--------------------------------------------------------");
        System.out.println("Changing array based on array value:");
        for (int i=0;i<b.length;i++){
            if(b[i]%2==0){
                b[i]*=2;
            }
            else{
                b[i]*=3;
            }
            System.out.print(b[i]+" ");
        }
        System.out.println();
        System.out.println("--------------------------------------------------------");
    }
}
