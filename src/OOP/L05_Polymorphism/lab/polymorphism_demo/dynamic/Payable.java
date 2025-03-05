package polymorphism_demo.dynamic;

public interface Payable {

    Double VAT = 0.2;

    void pay(int price);

    default void addMoneyToAccount(int money) {
        System.out.printf("Service addMoneyToAccount is not available for %s!\n",
                          this.getClass().getSimpleName());
    }

    static double calculateVat(int amount) {

        return amount * VAT;
    }
}
