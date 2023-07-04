package Tasks;

public class Countofdigits {
    public static void main(String[] args) {
        int a=54342,r,c=0;
        while (a!=0){
            r=a%10;     //Getting Last digit
            c+=1;       //Incrementing the count
            a/=10;      //Removing the last digit from number after adding it to reverse
        }
        System.out.println("Count of the digits: "+c);
    }
}
