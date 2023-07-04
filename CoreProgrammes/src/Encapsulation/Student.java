package Encapsulation;

public class Student {
    private String FirstName;
    private String LastName;
    private String Place;
    private int Age;
    private String email;
    private String ph_no;
    private String Branch;
    public void SetFname(String Fname){
        this.FirstName=Fname;
    }
    public String GetFname(){
        return FirstName;
    }
    public void SetLname(String Lname){
        this.LastName=Lname;
    }
    public String GetLname(){
        return LastName;
    }
    public void SetPlace(String Location){
        this.Place=Location;
    }
    public String GetPlace(){
        return Place;
    }
    public void SetAge(int age){
        this.Age=age;
    }
    public int GetAge(){
        return Age;
    }
    public void SetEmail(String Email){
        this.email=Email;
    }
    public String GetEmail(){
        return email;
    }
    public void SetPhNo(String PhNo){
        this.ph_no=PhNo;
    }
    public String GetPhNo(){
        return ph_no;
    }
    public void SetBranch(String Branch){
        this.Branch=Branch;
    }
    public String GetBranch(){
        return Branch;
    }



}
