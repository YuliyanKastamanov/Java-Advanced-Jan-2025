package OOP.L07_Reflection_and_Annotations.Exercise.barracksWars.core;


import OOP.L07_Reflection_and_Annotations.Exercise.barracksWars.interfaces.Repository;
import OOP.L07_Reflection_and_Annotations.Exercise.barracksWars.interfaces.Unit;
import OOP.L07_Reflection_and_Annotations.Exercise.barracksWars.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Engine implements Runnable {

	private Repository repository;
	private UnitFactory unitFactory;

	public Engine(Repository repository, UnitFactory unitFactory) {
		this.repository = repository;
		this.unitFactory = unitFactory;
	}

	@Override
	public void run() {
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));
		while (true) {
			try {
				String input = reader.readLine();
				String[] data = input.split("\\s+");
				String commandName = data[0];
				String result = interpretCommand(data, commandName);
				if (result.equals("fight")) {
					break;
				}
				System.out.println(result);
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
			} catch (IOException | ExecutionControl.NotImplementedException e) {
				e.printStackTrace();
			}
		}
	}


    //interpretCommand using Reflection
/*    private String interpretCommand(String[] data, String commandName) throws ExecutionControl.NotImplementedException {
        String result = null;

        Command command = null;
        String className = Character.toUpperCase(commandName.charAt(0)) + commandName.substring(1) + "Command";

        try {
            Class commandClass = Class.forName(COMMANDS_PACKAGE_NAME + className);
            Constructor<Command> commandConstructor = commandClass.getConstructor(String[].class, Repository.class, UnitFactory.class);

            Command commandObject = commandConstructor.newInstance(data, this.repository, this.unitFactory);
            result = commandObject.execute();

        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException |
                 InvocationTargetException e) {
            e.printStackTrace();
        }

        return result;
    }*/


	private String interpretCommand(String[] data, String commandName) throws ExecutionControl.NotImplementedException {
		String result;
		switch (commandName) {
			case "add":
				result = this.addUnitCommand(data);
				break;
			case "report":
				result = this.reportCommand(data);
				break;
			case "fight":
				result = this.fightCommand(data);
				break;
			case "retire":
				//retire Archer
				result = this.retireUnit(data);
				break;
			default:
				throw new RuntimeException("Invalid command!");
		}
		return result;
	}

	private String retireUnit(String[] data) throws ExecutionControl.NotImplementedException {

		String unitType = data[1];
		repository.removeUnit(unitType);
		return "%s retired!".formatted(unitType);

	}

	private String reportCommand(String[] data) {
		String output = this.repository.getStatistics();
		return output;
	}

	private String addUnitCommand(String[] data) throws ExecutionControl.NotImplementedException {
		String unitType = data[1];
		Unit unitToAdd = this.unitFactory.createUnit(unitType);
		this.repository.addUnit(unitToAdd);
		String output = unitType + " added!";
		return output;
	}
	
	private String fightCommand(String[] data) {
		return "fight";
	}
}
