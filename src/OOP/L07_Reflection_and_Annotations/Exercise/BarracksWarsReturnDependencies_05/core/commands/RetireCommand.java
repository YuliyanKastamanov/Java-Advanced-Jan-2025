package OOP.L07_Reflection_and_Annotations.Exercise.BarracksWarsReturnDependencies_05.core.commands;

import OOP.L07_Reflection_and_Annotations.Exercise.BarracksWarsReturnDependencies_05.contracts.Inject;
import OOP.L07_Reflection_and_Annotations.Exercise.BarracksWarsReturnDependencies_05.contracts.Repository;
import jdk.jshell.spi.ExecutionControl;


public class RetireCommand extends CommandImpl {
    @Inject
    private Repository repository;
    protected RetireCommand(String[] data) {
        super(data);
    }

    @Override
    public String execute() {
        try {
            this.repository.removeUnit(this.getData()[1]);
            return this.getData()[1] + " retired!";
        } catch (ExecutionControl.NotImplementedException e) {
            return e.getMessage();
        }
    }
}
