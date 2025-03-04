package OOP.L04_Interfaces_and_Abstraction.Exercise.BirthdayCelebrations_03;

public class Robot implements Identifiable{

    private String id;
    private String model;

    public Robot(String id, String model) {
        this.id = id;
        this.model = model;
    }

    @Override
    public String getId() {
        return id;
    }

    public String getModel() {
        return model;
    }
}
