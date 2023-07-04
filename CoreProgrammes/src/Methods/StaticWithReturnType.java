package Methods;

public class StaticWithReturnType {
    public static int emp(int basic,int hra,int bonus){
        int total=basic+hra+bonus;
        System.out.println("Total Salary: "+total);
        return total;
    }
    public static String str(){
        String p="All is well";
        return p;
    }
    public static float f(){
        return 349f;
    }

    public static void main(String[] args) {
        int emp1 = StaticWithReturnType.emp(1000,659,453);
        int emp2=StaticWithReturnType.emp(9000,359,353);
        int emp3=StaticWithReturnType.emp(1930,949,493);
        int TotalSalary=emp1+emp2+emp3;
        String s=StaticWithReturnType.str();
        float q=StaticWithReturnType.f();
        System.out.println("Total Salary of all Employees: "+TotalSalary);
        System.out.println("String: "+s+"\nFloat: "+q);
    }
}
