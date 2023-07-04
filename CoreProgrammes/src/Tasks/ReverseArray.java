package Tasks;

public class ReverseArray {
    public static void main(String[] args) {
        int[] a = {25, 15, 68, 31, 545, 12, 47};
        int l=a.length,t;
        int[] b = new int[l];   //Creating new array with same size of array a
        System.out.println("--------------------------------------------------------");
        System.out.println("Reversing array using another array: ");
        for (int i = 0; i < l;i++ ){    //iterating through new array
            b[i]=a[l-i-1];              //Storing the "array a" elements in reverse order into "array b"
            System.out.print(b[i]+" ");
        }
        System.out.println();
        System.out.println("--------------------------------------------------------");
        System.out.println("Reversing array without using another array: ");
        for(int i=0;i<l/2;i++) {    //Iterating through the first half of array excluding the middle most element
            t = a[i];
            a[i] = a[l - i - 1];
            a[l - i - 1] = t;
        }                           /*Swapping the elements of first half of array with second half of array
                                      with their respective place by using a temporary variable*/
        for (int j:a){
            System.out.print(j+" ");
        }
        System.out.println();
        System.out.println("--------------------------------------------------------");
    }
}
