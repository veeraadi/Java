package MarkerInterface;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
public class Deserialize {
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        FileInputStream input = new FileInputStream("E:\\Java\\Core JAVA Inellij\\CoreProgrammes\\src\\Employee.ser");
        ObjectInputStream inputstream = new ObjectInputStream(input);
        Employee e1 = (Employee) inputstream.readObject();
        e1.getEmployeeDetails();
        input.close();
        inputstream.close();
        System.out.println("=====================================================================================\n\n");
        FileInputStream input1=new FileInputStream("E:\\Java\\Core JAVA Inellij\\CoreProgrammes\\src\\EmployeeSetGet.ser");
        ObjectInputStream inputstream1=new ObjectInputStream(input1);
        EmployeeSetGet emp1 = (EmployeeSetGet) inputstream1.readObject();

        input1.close();
        inputstream1.close();

        System.out.println("Employee Details: ");
        System.out.println("=====================================================================================");
        System.out.println("Employee Id: "+emp1.getId());
        System.out.println("Employee Name: "+emp1.getName());
        System.out.println("Employee Salary: "+emp1.getSalary());
        System.out.println("Employee Location: "+emp1.getLoc());
        System.out.println("=====================================================================================\n\n");
        System.out.println("Reference Values of the objects: \n");
        System.out.println("Employee parameterized constr Ref Obj: "+e1);
        System.out.println("Employee Setter Gettes Ref Obj: "+emp1);
        System.out.println("=====================================================================================\n\n");
    }
}
