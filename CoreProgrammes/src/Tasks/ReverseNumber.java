package Tasks;

public class ReverseNumber {
    public static void main(String[] args) {
        int i = 9742,r,n=0;
        while(i!=0){
            r=i%10;     //Getting last digit
            n=n*10+r;   //Adding the last digit to reversed number
            i/=10;      //Removing the last digit from number after adding it to reverse
        }
        System.out.println("Reverse: "+n);
    }
}
