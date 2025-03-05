package polymorphism_demo.dynamic;

public class PaypalPayment extends Payment implements Payable {

    public PaypalPayment(String username) {
        super(username);
    }

    @Override
    public void pay(int price) {
        System.out.println("Sum " + price + " is payed by PayPal");

    }

    @Override
    public void getCredit() {
        System.out.println("Pay pal credit!!!");
    }
}
