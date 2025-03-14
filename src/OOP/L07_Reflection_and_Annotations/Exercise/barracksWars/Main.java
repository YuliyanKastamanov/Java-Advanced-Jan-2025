package OOP.L07_Reflection_and_Annotations.Exercise.barracksWars;


import OOP.L07_Reflection_and_Annotations.Exercise.barracksWars.core.Engine;
import OOP.L07_Reflection_and_Annotations.Exercise.barracksWars.core.factories.UnitFactoryImpl;
import OOP.L07_Reflection_and_Annotations.Exercise.barracksWars.data.UnitRepository;
import OOP.L07_Reflection_and_Annotations.Exercise.barracksWars.interfaces.Repository;
import OOP.L07_Reflection_and_Annotations.Exercise.barracksWars.interfaces.UnitFactory;

public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();

        Runnable engine = new Engine(repository, unitFactory);
        engine.run();
    }
}
