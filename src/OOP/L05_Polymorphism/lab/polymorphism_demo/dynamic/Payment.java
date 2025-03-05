package polymorphism_demo.dynamic;

public abstract class Payment {

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

    public abstract void getCredit();

    public void someMethod() throws Exception {
        throw new IllegalArgumentException();
    }
}
