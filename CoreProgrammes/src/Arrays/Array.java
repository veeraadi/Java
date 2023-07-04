package Arrays;

public class Array {
    public static void main(String[] args) {
        int a[]=new int[5];
        int []b={34,115,324,124,451};
        a[0]=343;
        a[1]=43;
        a[2]=643;
        a[3]=542;
        a[4]=16;
        System.out.println("--------------------------------------------------------");
        System.out.println("Initialization after declaration");
        System.out.println(a[1]);
        System.out.println(a[0]);
        System.out.println("--------------------------------------------------------");
        System.out.println("Initialization along with declaration");
        System.out.println(b[1]);
        System.out.println(b[0]);
        System.out.println("--------------------------------------------------------");
        System.out.println("Printing all values using foreach loop");
        for (int i: a){
            System.out.println(i);
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("Initializing using for loop");
        int c[]=new int[5];
        for (int i=0;i<=4;i++){
            c[i]=i*5;
        }
        System.out.println(c[3]);
        System.out.println("--------------------------------------------------------");
        System.out.println("String Array Implementation");
        String[] S={"Teja","Adithya","Pooji","Dharani"};
        for (String n:S){
            System.out.println(n);
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("String Array Implementation");
        char[] s={'T','A','P','D'};
        for (char N:s){
            System.out.println(N);
        }
        System.out.println("--------------------------------------------------------");
    }
}
