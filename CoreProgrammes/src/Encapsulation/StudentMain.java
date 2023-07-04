package Encapsulation;

public class StudentMain {
    public static void main(String[] args) {
        Student S=new Student();
        S.SetLname("Adithya");
        S.SetFname("Veera");
        S.SetAge(21);
        S.SetBranch("Computer Science Engineering");
        S.SetEmail("veeraadithya.1234@gmail.com");
        S.SetPhNo("9441761801");
        S.SetPlace("Koilakuntla");
        System.out.println("Name: "+S.GetFname()+" "+S.GetLname());
        System.out.println("Age: "+S.GetAge());
        System.out.println("Branch: "+S.GetBranch());
        System.out.println("Ph No: "+S.GetPhNo());
        System.out.println("Email ID: "+S.GetEmail());
        System.out.println("Place: "+S.GetPlace());
    }
}
