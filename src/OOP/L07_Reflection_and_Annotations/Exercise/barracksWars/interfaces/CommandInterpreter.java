package OOP.L07_Reflection_and_Annotations.Exercise.barracksWars.interfaces;

public interface CommandInterpreter {

	Executable interpretCommand(String[] data, String commandName);
}
