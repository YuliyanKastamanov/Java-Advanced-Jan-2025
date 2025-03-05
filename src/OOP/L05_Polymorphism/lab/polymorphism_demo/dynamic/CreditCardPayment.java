package polymorphism_demo.dynamic;

public class CreditCardPayment extends Payment implements Payable {

    public CreditCardPayment(String username) {
        super(username);
    }

    @Override
    public void pay(int price) {
        System.out.println("Sum " + price + " is payed by Credit Card");
    }

    @Override
    public void addMoneyToAccount(int money) {
        System.out.println("Successfully added " + money + " to Credit Card!");
    }

    public void report() {
        System.out.println("CreditCardPayment report!");
    }

    @Override
    public void getCredit() {
        System.out.println("Credit card credit!!!");
    }

    @Override
    public void someMethod() throws Exception {
       throw new Exception();
    }
}
