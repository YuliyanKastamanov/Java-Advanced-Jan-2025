package OOP.L11_TestDrivenDevelopment.Exercise.Chainblock.src.main.java;

public interface Transaction {
    int getId();
    void setStatus(TransactionStatus transactionStatus);
    TransactionStatus getStatus();
    String getFrom();
    String getTo();
    double getAmount();

}
