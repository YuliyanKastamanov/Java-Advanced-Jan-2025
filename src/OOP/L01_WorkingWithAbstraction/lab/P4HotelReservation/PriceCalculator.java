package OOP.L01_WorkingWithAbstraction.lab.P4HotelReservation;

public class PriceCalculator {

    public static double calculate(double pricePerDay,
                                   int numberOfDays,
                                   Season season,
                                   Discount discount) {

        double basePrice = pricePerDay * numberOfDays * season.getMultiplier();

        return basePrice - (basePrice * discount.getDiscountPercentage() / 100);
    }
}
