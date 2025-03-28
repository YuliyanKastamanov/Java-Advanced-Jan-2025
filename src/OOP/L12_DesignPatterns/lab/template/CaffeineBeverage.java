package template;

public abstract class CaffeineBeverage {

    private String name;

    public CaffeineBeverage(String name) {
        this.name = name;
    }

    //Template method
    public final void prepareBeverage(){
        boilWater();
        addCoffee();
        addSugar();
        serve();
    }

    abstract void boilWater();
    abstract void addCoffee();
    abstract void addSugar();
    abstract void serve();
}
