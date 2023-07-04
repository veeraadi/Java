package MarkerInterface;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeMainSerializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee e=new Employee(101,"Adithya",700000,"Bangalore");
        FileOutputStream file=new FileOutputStream("E:\\Java\\Core JAVA Inellij\\CoreProgrammes\\src\\Employee.ser");
        ObjectOutputStream out = new ObjectOutputStream(file);
        out.writeObject(e);
        out.close();
        file.close();
        System.out.println("Object Serialized and saved to Employee.txt file");
        System.out.println();
    }
}
