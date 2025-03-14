package OOP.L07_Reflection_and_Annotations.Exercise.BarracksWarsReturnDependencies_05.core.commands;

public class FightCommand extends CommandImpl {
    protected FightCommand(String[] data) {
        super(data);
    }

    @Override
    public String execute() {
        return "fight";
    }
}
