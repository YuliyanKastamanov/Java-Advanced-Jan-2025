package demo_interfaces_and_abstraction;

import java.util.Iterator;

public class RevolutPayment extends Payment implements Payable, SomeInterface {

    public RevolutPayment(String username) {
        super(username);
    }

    @Override
    protected void report() {

    }

    @Override
    public void pay(int price) {
        System.out.printf("Sum %d is payed by Revolut!\n", price);
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
