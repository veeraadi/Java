package DeepCloning;

public class Accounts implements Cloneable {
    int no;
    String type;
    String name;
    double balance;
    Accounts(){

    }
    public Accounts(int no, String type, String name, double balance) {
        this.no = no;
        this.type = type;
        this.name = name;
        this.balance = balance;
    }

    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
