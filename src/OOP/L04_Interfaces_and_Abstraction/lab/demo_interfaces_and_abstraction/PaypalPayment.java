package demo_interfaces_and_abstraction;

import java.util.Iterator;

public class PaypalPayment extends Payment implements Payable, SomeInterface {

    public PaypalPayment(String username) {
        super(username);
    }

    @Override
   protected void report() {

    }

    @Override
    public void pay(int price) {
        System.out.printf("Sum %d is payed by PayPal!\n", price);
    }

    @Override
    public void someMethod() {

    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void account(int money) {

    }
}
