package polymorphism_demo.dynamic;

public class BitcoinPayment extends Payment implements Payable {

    public BitcoinPayment(String username) {
        super(username);
    }

    @Override
    public void pay(int price) {
        System.out.println("Sum " + price + " is payed by Bitcoin");
    }

    @Override
    public void getCredit() {
        System.out.println("Bitcoin credit!!!");
    }
}
