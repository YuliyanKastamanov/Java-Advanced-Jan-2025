package OOP.L04_Interfaces_and_Abstraction.lab.demo_interfaces_and_abstraction;

import java.util.Iterator;

public class CreditCardPayment extends Payment implements Payable, SomeInterface {

    public CreditCardPayment(String username) {
        super(username);
    }

    @Override
    protected void report() {

    }

    @Override
    public void pay(int price) {
        System.out.printf("Sum %d is payed by Credit card!\n", price);
    }

    @Override
    public void addMoneyToAccount(int money) {
        System.out.printf("Successfully added %d to Credit Card\n", money);
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
