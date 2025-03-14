package OOP.L07_Reflection_and_Annotations.Exercise.BarracksWarsReturnDependencies_05.core.factories;



import OOP.L07_Reflection_and_Annotations.Exercise.BarracksWarsReturnDependencies_05.contracts.Unit;
import OOP.L07_Reflection_and_Annotations.Exercise.BarracksWarsReturnDependencies_05.contracts.UnitFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UnitFactoryImpl implements UnitFactory {

	private static final String UNITS_PACKAGE_NAME =
			"pr0304Barracks.models.units.";

	@Override
	public Unit createUnit(String unitType) {

		Unit unit = null;

		try {
			Class<? extends Unit> unitClass =
					(Class<? extends Unit>) Class
							.forName(UnitFactoryImpl.UNITS_PACKAGE_NAME + unitType);
			Constructor constructor = unitClass.getDeclaredConstructor();
			constructor.setAccessible(true);
			unit = (Unit) constructor.newInstance();
		} catch (ClassNotFoundException
				| ClassCastException
				| NoSuchMethodException
				| InstantiationException
				| IllegalAccessException
				| InvocationTargetException e) {
			e.printStackTrace();
		}


		return unit;

	}
}
