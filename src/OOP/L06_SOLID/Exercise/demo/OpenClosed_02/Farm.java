package OOP.L06_SOLID.Exercise.demo.OpenClosed_02;

import java.util.List;

public class Farm {

    private List<Animal> animals;



    public void giveFood(){

        for (Animal animal : animals){
            animal.eat();
        }
    }

    public void giveWater(){

        for (Animal animal : animals){
            animal.drinkWater();
        }
    }
}
