package MarkerInterface;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeMainSerializableSetGet {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        EmployeeSetGet emp=new EmployeeSetGet();
        emp.setId(102);
        emp.setName("Dharani");
        emp.setSalary(350000);
        emp.setLoc("Mysore");
        FileOutputStream file=new FileOutputStream("E:\\Java\\Core JAVA Inellij\\CoreProgrammes\\src\\EmployeeSetGet.ser");
        ObjectOutputStream out = new ObjectOutputStream(file);
        out.writeObject(emp);
        out.close();
        file.close();
        System.out.println("Object Serialized and saved to EmployeeSetGet.txt file");
        System.out.println();
    }
}
