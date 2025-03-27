package OOP.L11_TestDrivenDevelopment.Exercise.Chainblock.src.main.java;

public interface Chainblock extends Iterable<Transaction> {

    //chainblock = database with transactions + функционалности
    int getCount();

    void add(Transaction transaction);

    boolean contains(Transaction transaction);

    boolean contains(int id);

    void changeTransactionStatus(int id, TransactionStatus newStatus);

    void removeTransactionById(int id);

    Transaction getById(int id);

    Iterable<Transaction> getByTransactionStatus(TransactionStatus status);

    Iterable<String> getAllSendersWithTransactionStatus(TransactionStatus status);

    Iterable<String> getAllReceiversWithTransactionStatus(TransactionStatus status);

    Iterable<Transaction> getAllOrderedByAmountDescendingThenById();

    Iterable<Transaction> getBySenderOrderedByAmountDescending(String sender);

    Iterable<Transaction> getByReceiverOrderedByAmountThenById(String receiver);

    Iterable<Transaction> getByTransactionStatusAndMaximumAmount(TransactionStatus status, double amount);

    Iterable<Transaction> getBySenderAndMinimumAmountDescending(String sender, double amount);

    Iterable<Transaction> getByReceiverAndAmountRange(String receiver, double lo, double hi);

    Iterable<Transaction> getAllInAmountRange(double lo, double hi);

}
