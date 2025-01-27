package L06_Defining_Classes.Exercise.CarSalesman_05;

public class Car {

    private String model;
    private String engine;

    private int weight; //optional
    private String color; //optional

    public Car(String model, String engine) {
        this.model = model;
        this.engine = engine;
        this.weight = 0;
        this.color = "n/a";
    }

    public Car(String model, String engine, int weight, String color) {
        this(model, engine);
        this.weight = weight;
        this.color = color;
    }

    public Car (String model, String engineModel, int weight) {
        this(model, engineModel);
        this.weight = weight;
        this.color = "n/a";
    }

    public Car(String model, String engine, String color) {
        this(model, engine);
        this.weight = 0;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }
}