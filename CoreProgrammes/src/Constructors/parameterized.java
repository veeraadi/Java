package Constructors;

public class parameterized {
    private String Name;
    private String Place;
    private int Age;

    parameterized(String n, String p, int a){
        this.Name=n;
        this.Age=a;
        this.Place=p;
    }
    public String Intro(){
        String I="\nI'm "+Name+", "+this.Age+" old and I'm form "+this.Place;
        return I;
    }
}
