package demo;

public class ITSupport extends Employee{

    private int solvedTickets;

    public ITSupport(String name, double salary, int solvedTickets) {
        super(name, salary);
        this.solvedTickets = solvedTickets;
    }

    public void assignTicket(){
        System.out.println("Ticket assigned!");
    }

}
