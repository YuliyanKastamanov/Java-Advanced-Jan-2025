package OOP.L07_Reflection_and_Annotations.Exercise.barracksWars.core.factories;

import OOP.L07_Reflection_and_Annotations.Exercise.barracksWars.interfaces.Unit;
import OOP.L07_Reflection_and_Annotations.Exercise.barracksWars.interfaces.UnitFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UnitFactoryImpl implements UnitFactory {

	private static final String UNITS_PACKAGE_NAME =
			"barracksWars.models.units.";

	@Override
	public Unit createUnit(String unitType)  {
		// TODO: implement for problem 3

        try {
            Class unitClass = Class.forName(UNITS_PACKAGE_NAME + unitType);
			Constructor<Unit> unitConstructor = unitClass.getConstructor();
			Unit newUnit = unitConstructor.newInstance();
			return newUnit;
        } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException |
                 IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }
}
