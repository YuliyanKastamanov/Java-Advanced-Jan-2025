package demo;

public class HR extends Employee{

    private int hiredPeople;

    public HR(String name, double salary, int hiredPeople) {
        super(name, salary);
        this.hiredPeople = hiredPeople;
    }

    public void checkCV(){
        System.out.println("CV checked");
    }


}
