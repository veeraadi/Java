package DeepCloning;
public class Employee implements Cloneable{
    int id;
    String name;
    double salary;
    String loc;
    Accounts acc;
    Employee(int id,String name, double salary,String loc,Accounts a){
        this.id=id;
        this.loc=loc;
        this.name=name;
        this.salary=salary;
        this.acc=a;
    }

    public void getdetails(){
        System.out.println("=================================================");
        System.out.println("Employee Details: ");
        System.out.println("=================================================");
        System.out.println("Employee Id: "+id);
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Salary: "+salary+"\n");
        System.out.println("-------------------------------------------------");
        System.out.println("Account Details: ");
        System.out.println("-------------------------------------------------");
        System.out.println("Account Number: "+acc.no);
        System.out.println("Account Holder Name: "+acc.name);
        System.out.println("Account Type: "+acc.type);
        System.out.println("Account Balance: "+acc.balance);
        System.out.println("=================================================");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
