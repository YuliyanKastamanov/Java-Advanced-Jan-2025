package OOP.L11_TestDrivenDevelopment.Exercise.Chainblock.src.main.java;

public class TransactionImpl implements Transaction {

    private int id;
    private TransactionStatus status;
    private String from;
    private String to;
    private double amount;

    public TransactionImpl(int id, TransactionStatus status, String from, String to, double amount) {
        this.id = id;
        this.status = status;
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void setStatus(TransactionStatus transactionStatus) {
        this.status = transactionStatus;
    }

    @Override
    public TransactionStatus getStatus() {
        return this.status;
    }

    @Override
    public String getFrom() {
        return this.from;
    }

    @Override
    public String getTo() {
        return this.to;
    }

    @Override
    public double getAmount() {
        return this.amount;
    }
}
