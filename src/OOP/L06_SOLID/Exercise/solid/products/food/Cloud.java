package OOP.L06_SOLID.Exercise.solid.products.food;

//bad example
public class Cloud implements Food{

    @Override
    public double getKilograms() {
        //One billion cubic meters times . 5 gram per cubic meter equals 500 million grams.
        // Thus, the cloud weighs about 500,000 kilograms!

        return 500000;
    }



    @Override
    public double getCalories() {
        throw new UnsupportedOperationException("Claud's doesn't have calories. They can't be eaten!");

    }


}
