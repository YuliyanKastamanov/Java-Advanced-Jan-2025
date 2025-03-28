package singleton_demo;

public class Demo {

    public static void main(String[] args) {

        Wallet myWallet = Wallet.getWalletInstance("Kaloyan");
        myWallet.addMoney(500.0);

        System.out.println(myWallet.getOwnerName());
        System.out.println(myWallet.getAmount());

        myWallet = Wallet.getWalletInstance("Peter");

        System.out.println(myWallet.getOwnerName());
        System.out.println(myWallet.getAmount());
    }
}
