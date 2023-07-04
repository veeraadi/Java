package Arrays;

public class LowestinArray {
    public static void main(String[] args){
        int a[]=new int[6];
        a[0]=64;
        a[1]=24;
        a[2]=57;
        a[3]=94;
        a[4]=64;
        a[5]=87;
        int c=a[0];
        for (int i=1;i<6;i++){
            if(c>a[i]){
                c=a[i];
            }
        }
        System.out.println("Lowest value in the array: "+c);

    }
}
