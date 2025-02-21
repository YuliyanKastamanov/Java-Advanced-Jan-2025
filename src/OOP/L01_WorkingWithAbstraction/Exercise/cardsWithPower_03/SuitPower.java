package OOP.L01_WorkingWithAbstraction.Exercise.cardsWithPower_03;

public enum SuitPower {


    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int power;

    SuitPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
