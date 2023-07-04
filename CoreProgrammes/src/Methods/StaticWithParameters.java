package Methods;

public class StaticWithParameters {
    public static int emp(int basic, int hra, int bonus){
        int total=basic+hra+bonus;
        System.out.println("Total Salary: "+total);
        return total;
    }

    public static void main(String[] args) {
        int emp1=StaticWithParameters.emp(1000,659,453);
        int emp2=StaticWithParameters.emp(9000,359,353);
        int emp3=StaticWithParameters.emp(1930,949,493);
        int totalsalary=emp1+emp2+emp3;
        System.out.println("Total Salary of all the Employees: "+totalsalary);
    }
}
