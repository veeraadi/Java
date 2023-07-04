package Methods;

public class WithReturnType {
    public int emp(int basic,int hra,int bonus){
        int total=basic+hra+bonus;
        System.out.println("Total Salary: "+total);
        return total;
    }
    public String str(){
        return "All is well";
    }
    public float f(){
        return 349f;
    }

    public static void main(String[] args) {
        WithReturnType ex=new WithReturnType();
        int emp1 = ex.emp(1000,659,453);
        int emp2=ex.emp(9000,359,353);
        int emp3=ex.emp(1930,949,493);
        int TotalSalary=emp1+emp2+emp3;
        String s=ex.str();
        float q=ex.f();
        System.out.println("Total Salary of all Employees: "+TotalSalary);
        System.out.println("String: "+s+"\nFloat: "+q);
    }
}
