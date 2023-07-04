package MarkerInterface;
import java.io.Serializable;
public class Employee implements Serializable,Cloneable {
    private int Id;
    private String Name;
    private double Salary;
    private String Loc;
    Employee(int Id,String Name,double Salary, String Loc){
        this.Id=Id;
        this.Name=Name;
        this.Salary=Salary;
        this.Loc=Loc;
    }
    public void getEmployeeDetails(){
        System.out.println("\nEmployee Details: ");
        System.out.println("=====================================================================================");
        System.out.println("Employee Id: "+Id);
        System.out.println("Employee Name: "+Name);
        System.out.println("Employee Salary: "+Salary);
        System.out.println("Employee Location: "+Loc);
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public void change(String NewName){
        Name=NewName+" "+Name;
    }
}