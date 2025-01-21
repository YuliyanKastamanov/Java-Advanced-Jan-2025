package L05_Functional_Programming.lab;

import java.util.Scanner;
import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {

        //Supplier<ReturnType> -> use with get
        Supplier<Scanner> getScannerSupplier = () -> new Scanner(System.in);

        Scanner scanner = getScannerSupplier.get();
        System.out.println(scanner.nextLine());
    }

    private static Scanner getScanner() {
        return new Scanner(System.in);
    }
}
