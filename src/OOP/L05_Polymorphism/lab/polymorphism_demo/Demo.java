package polymorphism_demo;

import java.util.Map;
import java.util.Scanner;

import polymorphism_demo.dynamic.BitcoinPayment;
import polymorphism_demo.dynamic.CreditCardPayment;
import polymorphism_demo.dynamic.Payable;
import polymorphism_demo.dynamic.Payment;
import polymorphism_demo.dynamic.PaypalPayment;
import polymorphism_demo.dynamic.RevolutPayment;

public class Demo {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String paymentChoice = scanner.nextLine();

        Payable payable = getPayable(paymentChoice);

        pay(payable, 500);

        Payment payment = getPayment(paymentChoice);
        payment.getCredit();
        payment.someMethod(); // Exception

        //        // Upcasting it is always safe
        //        Payable payable1 = new CreditCardPayment("Kaloyan");
        //        // DownCasting
        //        if (payable1 instanceof CreditCardPayment) {
        //            CreditCardPayment creditCardPayment1 = (CreditCardPayment) payable1;
        //            creditCardPayment1.report();
        //        }
    }

    static void pay(Payable payable, int amount) {
        payable.pay(amount);
    }

    private static Payable getPayable(String paymentChoice) {
        //        Map<String, Payable> payableMap = Map.of("CreditCard", new CreditCardPayment("Kaloyan"),
        //                                                 "Revolut", new RevolutPayment("Kaloyan"),
        //                                                 "PayPal", new PaypalPayment("Kaloyan"),
        //                                                 "Bitcoin", new BitcoinPayment("Kaloyan"));
        return switch (paymentChoice) {
            case "CreditCard" -> new CreditCardPayment("Kaloyan");
            case "Revolut" -> new RevolutPayment("Kaloyan");
            case "PayPal" -> new PaypalPayment("Kaloyan");
            case "Bitcoin" -> new BitcoinPayment("Kaloyan");
            default -> throw new UnsupportedOperationException("Unsupported payment method!");
        };

        //        return payableMap.get(paymentChoice);
    }

    private static Payment getPayment(String paymentChoice) {
        Map<String, Payment> payableMap = Map.of("CreditCard", new CreditCardPayment("Kaloyan"),
                                                 "Revolut", new RevolutPayment("Kaloyan"),
                                                 "PayPal", new PaypalPayment("Kaloyan"),
                                                 "Bitcoin", new BitcoinPayment("Kaloyan"));
        return payableMap.get(paymentChoice);
    }
}
