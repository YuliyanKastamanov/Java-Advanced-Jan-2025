package polymorphism_demo.staticcc;

public class Demo {

    public static void main(String[] args) {

        Printer.print("Kaloyan");
        Printer.print(150);
        Printer.print(2.5);

        Citizen citizen1 = new Citizen();
        Citizen citizen = new Citizen("Kaloyan");
        citizen.info();
        citizen.info("Some more info...");
    }
}
