package polymorphism_demo.dynamic;

public class RevolutPayment extends Payment implements Payable {

    public RevolutPayment(String username) {
        super(username);
    }

    @Override
    public void pay(int price) {
        System.out.println("Sum " + price + " is payed by RevolutPayment");
    }

    @Override
    public void getCredit() {
        System.out.println("Revolut credit!!!");
    }
}
