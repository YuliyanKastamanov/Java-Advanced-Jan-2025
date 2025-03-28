package singleton_demo;

public class Wallet {

    private static Wallet instance;

    private String ownerName;
    private Double amount;


    private Wallet(String ownerName) {
        this.ownerName = ownerName;
        this.amount = 0.0;
    }

    public static Wallet getWalletInstance(String ownerName) {
        if (instance != null) {
            return instance;
        }
        instance = new Wallet(ownerName);
        return instance;
    }



    public String getOwnerName() {
        return ownerName;
    }


    public Double getAmount() {
        return amount;
    }

    public void addMoney(Double money) {
        this.amount += money;
    }
}
