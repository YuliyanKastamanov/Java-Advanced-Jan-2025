package OOP.L07_Reflection_and_Annotations.Exercise.BarracksWarsReturnDependencies_05.contracts;

import jdk.jshell.spi.ExecutionControl;

public interface Repository {

	void addUnit(Unit unit);

	String getStatistics();

	void removeUnit(String unitType) throws ExecutionControl.NotImplementedException;
}
