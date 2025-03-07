package OOP.L04_Interfaces_and_Abstraction.lab.demo_interfaces_and_abstraction;

public interface Payable extends SomeInterface, Iterable {

    Double VAT = 0.2;

    void pay(int price);

    default void addMoneyToAccount(int money) {
        printDefaultMsg(this);
    }

    private static void printDefaultMsg(Payable payable) {
        System.out.printf("Service addMoneyToAccount is not available for %s!\n",
                          payable.getClass().getSimpleName());
    }

    static double calculateVat(int price) {
        return price * VAT;
    }
}
