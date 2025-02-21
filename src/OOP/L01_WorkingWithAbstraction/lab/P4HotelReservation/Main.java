package OOP.L01_WorkingWithAbstraction.lab.P4HotelReservation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] holidayData = scanner.nextLine().split("\\s+");

        System.out.printf("%.2f", getTotalHolidayPrice(holidayData));
    }

    public static double getTotalHolidayPrice(String[] holidayData) {
        double pricePerDay = Double.parseDouble(holidayData[0]);
        int days = Integer.parseInt(holidayData[1]);
        Season season = Season.valueOf(holidayData[2]);
        Discount discount = Discount.valueOf(holidayData[3]);

        return PriceCalculator.calculate(pricePerDay,
                                         days,
                                         season,
                                         discount);
    }
}
