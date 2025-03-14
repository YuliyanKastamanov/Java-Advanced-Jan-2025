package OOP.L07_Reflection_and_Annotations.Exercise.BarracksWarsReturnDependencies_05.core;


import OOP.L07_Reflection_and_Annotations.Exercise.BarracksWarsReturnDependencies_05.contracts.CommandInterpreter;
import OOP.L07_Reflection_and_Annotations.Exercise.BarracksWarsReturnDependencies_05.contracts.Executable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Engine implements Runnable {

    private CommandInterpreter commandInterpreter;

    public Engine(CommandInterpreter commandInterpreter) {
        this.commandInterpreter = commandInterpreter;
    }

    @Override
    public void run() {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        while (true) {
            try {
                String input = reader.readLine();
                String[] data = input.split("\\s+");
                Executable executable = this.commandInterpreter.interpretCommand(data);
                String result = executable.execute();
                if (result.equals("fight")) {
                    break;
                }
                System.out.println(result);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
