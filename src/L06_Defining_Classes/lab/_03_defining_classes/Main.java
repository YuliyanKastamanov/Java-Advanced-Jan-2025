package L06_Defining_Classes.lab._03_defining_classes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    //  id       bankAccount
    private static Map<Integer, BankAccount> bankAccounts = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        while (!"End".equals(line)) {

            String[] tokens = line.split("\\s+");
            //•	Create
            //•	Deposit {Id} {Amount}
            //•	SetInterest {Interest}
            //•	GetInterest {ID} {Years}
            switch (tokens[0]) {
                case "Create":
                    createBankAccount();
                    break;
                case "Deposit":
                    depositSum(Integer.parseInt(tokens[1]),
                               Double.parseDouble(tokens[2]));
                    break;
                case "SetInterest":
                    setInterest(Double.parseDouble(tokens[1]));
                    break;
                case "GetInterest":
                    getInterest(Integer.parseInt(tokens[1]),
                                Integer.parseInt(tokens[2]));
                    break;
            }

            line = scanner.nextLine();
        }
    }

    private static void getInterest(int id, int years) {
        if (bankAccounts.containsKey(id)) {
            BankAccount bankAccount = bankAccounts.get(id);
            System.out.printf("%.2f\n", bankAccount.getInterest(years));
        } else {
            System.out.println("Account does not exist");
        }
    }

    private static void setInterest(double interest) {
        BankAccount.setInterestRate(interest);
    }

    private static void depositSum(int id, double amount) {

        if (bankAccounts.containsKey(id)) {
            BankAccount bankAccount = bankAccounts.get(id);
            bankAccount.deposit(amount);
            System.out.printf("Deposited %.0f to ID%d\n", amount, id);
        } else {
            System.out.println("Account does not exist");
        }
    }

    private static void createBankAccount() {
        BankAccount bankAccount = new BankAccount();
        bankAccounts.put(bankAccount.getId(), bankAccount);
        System.out.printf("Account ID%d created\n", bankAccount.getId());
    }
}
