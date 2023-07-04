package Methods;

public class WithParameters {
    public int emp(int basic, int hra, int bonus){
        int total=basic+hra+bonus;
        System.out.println("Total Salary: "+total);
        return total;
    }

    public static void main(String[] args) {
        WithParameters ex=new WithParameters();
        int emp1=ex.emp(1000,659,453);
        int emp2=ex.emp(9000,359,353);
        int emp3=ex.emp(1930,949,493);
        int totalsalary=emp1+emp2+emp3;
        System.out.println("Total Salary of all the Employees: "+totalsalary);
    }
}
