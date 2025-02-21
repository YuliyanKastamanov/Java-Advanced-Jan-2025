package OOP.L01_WorkingWithAbstraction.lab;

public class Demo {

    public static void main(String[] args) {

        Month[] values = Month.values();
        for (Month value : values) {
//            System.out.println(value);
        }

//        System.out.println(Month.valueOf("DECEMBER"));

        System.out.println(calcSalary(Month.FEBRUARY));
        System.out.println(Month.FEBRUARY.toString());

        System.out.println(Demo.class.getName());
    }

    public static double calcSalary(Month month){
        System.out.println(month.name());
        return month.calculateSalary(100);
    }
}
