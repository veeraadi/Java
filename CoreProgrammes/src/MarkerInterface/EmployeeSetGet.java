package MarkerInterface;
import java.io.Serializable;
public class EmployeeSetGet implements Serializable, Cloneable {
    private int Id;
    private String Name;
    private double Salary;
    private String Loc;
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public double getSalary() {
        return Salary;
    }
    public void setSalary(double salary) {
        Salary = salary;
    }
    public String getLoc() {
        return Loc;
    }
    public void setLoc(String loc) {
        Loc = loc;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
