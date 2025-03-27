public interface Transaction {
    int getId();
    void setStatus(TransactionStatus transactionStatus);
    TransactionStatus getStatus();
    String getFrom();
    String getTo();
    double getAmount();

}
