package cat_lady;

public class StreetExtraordinaire extends Cat{
    private double decibels;

    public StreetExtraordinaire(String name, double decibels) {
        super(name);
        this.decibels = decibels;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f",this.getClass().getSimpleName(),super.getName(),this.decibels);
    }
}
