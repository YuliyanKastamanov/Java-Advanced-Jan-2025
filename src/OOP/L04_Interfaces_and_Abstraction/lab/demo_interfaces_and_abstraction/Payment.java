package OOP.L04_Interfaces_and_Abstraction.lab.demo_interfaces_and_abstraction;

public abstract class Payment implements Accountable{

    private String username;

    public Payment(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    protected abstract void report();
}
