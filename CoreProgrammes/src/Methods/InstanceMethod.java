package Methods;

public class InstanceMethod {
    char c='a';
    public void ex2(){
        System.out.println(c);
        System.out.println("Instance Method Example Method Ex2");
    }

    public static void main(String[] args) {
        InstanceMethod v=new InstanceMethod();
        v.ex2();
    }
}
