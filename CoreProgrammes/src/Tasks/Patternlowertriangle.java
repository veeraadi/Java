package Tasks;

public class Patternlowertriangle {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++) {    //Running for loop from i=1 to i=10 by incrementing 1
            for(int j=1;j<=i;j++){   ////Running inner for loop from j=1 to j=i by incrementing 1
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

