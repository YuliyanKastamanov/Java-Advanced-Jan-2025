package OOP.L07_Reflection_and_Annotations.Exercise.BarracksWarsReturnDependencies_05.core.commands;


import OOP.L07_Reflection_and_Annotations.Exercise.BarracksWarsReturnDependencies_05.contracts.Executable;

public abstract class CommandImpl implements Executable {
    private String[] data;

    protected CommandImpl(String[] data){
        this.data = data;
    }

    protected String[] getData(){
        return this.data;
    }
}
