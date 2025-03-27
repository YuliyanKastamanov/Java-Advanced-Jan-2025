package OOP.L12_DesignPatterns.Exercise.factoryExercise;

public class CakeFactory {

    public static Cake createCake(String type){
        Cake cake = null;

        switch (type) {
            case "chocolate" -> cake = new Cake(20, 20, 8);
            case "vegan" -> cake = new Cake(25, 50, 8);
            case "red-velvet" -> cake = new Cake(30, 40, 12);
        }

        return cake;
    }
}
