package OOP.L07_Reflection_and_Annotations.Exercise.BarracksWarsReturnDependencies_05;


import OOP.L07_Reflection_and_Annotations.Exercise.BarracksWarsReturnDependencies_05.contracts.Repository;
import OOP.L07_Reflection_and_Annotations.Exercise.BarracksWarsReturnDependencies_05.contracts.UnitFactory;
import OOP.L07_Reflection_and_Annotations.Exercise.BarracksWarsReturnDependencies_05.core.CommandInterpreterImpl;
import OOP.L07_Reflection_and_Annotations.Exercise.BarracksWarsReturnDependencies_05.core.Engine;
import OOP.L07_Reflection_and_Annotations.Exercise.BarracksWarsReturnDependencies_05.core.factories.UnitFactoryImpl;
import OOP.L07_Reflection_and_Annotations.Exercise.BarracksWarsReturnDependencies_05.data.UnitRepository;

public class Main {

	public static void main(String[] args) {
		Repository repository = new UnitRepository();
		UnitFactory unitFactory = new UnitFactoryImpl();
		Runnable engine = new Engine(new CommandInterpreterImpl(repository, unitFactory));
		engine.run();
	}
}
