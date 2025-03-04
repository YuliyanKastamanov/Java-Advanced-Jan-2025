package OOP.L04_Interfaces_and_Abstraction.Exercise.Demo;

public class CardPayment implements Payable{
    @Override
    public void pay() {
        System.out.println("Card Payment");
    }
}
