package OOP.L04_Interfaces_and_Abstraction.lab.demo_interfaces_and_abstraction;

import java.util.Map;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String paymentChoice = scanner.nextLine();
        int price = Integer.parseInt(scanner.nextLine());
        // CreditCard
        // Revolut
        // PayPal

//        Map<String, SomeInterface> someInterfaceMap = Map.of("CreditCard", new CreditCardPayment(),
//                                                             "Revolut", new RevolutPayment(),
//                                                             "PayPal", new PaypalPayment()
//                                                            );

        Map<String, Payable> payableMap = Map.of(
        "CreditCard", new CreditCardPayment("Kaloyan"),
        "Revolut", new RevolutPayment("Kaloyan"),
        "PayPal", new PaypalPayment("Kaloyan")
                                                );

        Payable payable = payableMap.get(paymentChoice);

        payable.pay(price);

        System.out.println(Payable.calculateVat(price));

        payable.addMoneyToAccount(500);
    }

    static void pay(Payable payable, int price) {
        payable.pay(price);
    }
}
