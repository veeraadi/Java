package Tasks;

public class Variableusage {
    //Static variable
    static int a=97;
    //instance variable
    int c=56;
    public void add(int x, int y, int z) {
        //Local variable
        int w=49;
        int total = w+x+y+z;
        System.out.println("Sum: "+ total);
    }
    public static void main(String[] args) {
        int b=34;
        Variableusage var = new Variableusage();
        //Accessing all variables in add method
        var.add(a,b,var.c);
    }
}
