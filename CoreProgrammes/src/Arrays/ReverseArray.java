package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] a = {25, 15, 68, 31, 545, 12, 47};
        int l=a.length,t;
        int[] b = new int[l];
        System.out.println("--------------------------------------------------------");
        System.out.println("Reversing array using another array: ");
        for (int i = 0; i < l;i++ ){
            b[i]=a[l-i-1];
            System.out.print(b[i]+" ");
        }
        System.out.println();
        System.out.println("--------------------------------------------------------");
        System.out.println("Reversing array without using another array: ");
        for(int i=0;i<l/2;i++) {
            t = a[i];
            a[i] = a[l - i - 1];
            a[l - i - 1] = t;
        }
        for (int j:a){
            System.out.print(j+" ");
        }
        System.out.println();
        System.out.println("--------------------------------------------------------");
    }
}
