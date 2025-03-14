package OOP.L07_Reflection_and_Annotations.Exercise.BarracksWarsReturnDependencies_05.core.commands;


import OOP.L07_Reflection_and_Annotations.Exercise.BarracksWarsReturnDependencies_05.contracts.Inject;
import OOP.L07_Reflection_and_Annotations.Exercise.BarracksWarsReturnDependencies_05.contracts.Repository;

public class ReportCommand extends CommandImpl {
    @Inject
    private Repository repository;

    protected ReportCommand(String[] data) {
        super(data);
    }

    @Override
    public String execute() {
        return this.repository.getStatistics();
    }
}
