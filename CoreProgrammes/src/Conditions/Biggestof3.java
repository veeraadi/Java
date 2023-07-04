package Conditions;

public class Biggestof3 {
    public static void main(String[] args) {
        int a=24, b=24, c=454;
        if (a>b){
            if (a>c){
                System.out.println("a is biggest");
            }
            else if(c>a){
                System.out.println("c is biggest");
            }
            else{
                System.out.println("a and c are equal and greater than b");
            }
        }
        else if (b>a) {
            if (b > c) {
                System.out.println("b is biggest");
            } else if (c > b) {
                System.out.println("c is biggest");
            } else {
                System.out.println("b and c are equal and greater than a");
            }
        }
        else if (a==b){
            if(a==c) {
                System.out.println("a,b and c all three are equal");
            }
            else if(a>c){
                System.out.println("a and b are equal and larger than c");
            }
            else{
                System.out.println("c is largest");
            }
        }
    }
}
