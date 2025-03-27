import java.util.*;

public class ChainblockImpl implements Chainblock {
    //Chainblock -> database with unique transactions
    //всеки един chainblock да се характеризира с място, в което да се съхраняват транзакции
    //id -> Transaction (id, status, from, to, amount)
    private Map<Integer, Transaction> transactionsMap;

    //конструктор
    public ChainblockImpl() {
        this.transactionsMap = new HashMap<>();
    }
    public int getCount() {
        //връща броя на транзакциите
        return this.transactionsMap.size();
    }

    public void add(Transaction transaction) {
        //transaction -> транзакцията, която трябва да добавим, ако я няма
        int id = transaction.getId();
        if (!this.transactionsMap.containsKey(id)) {
            this.transactionsMap.put(id, transaction);
        }
    }

    public boolean contains(Transaction transaction) {
        //database = transactionsMap
        return this.transactionsMap.containsValue(transaction);
    }

    public boolean contains(int id) {
        return this.transactionsMap.containsKey(id);
    }


    public void changeTransactionStatus(int id, TransactionStatus newStatus) {
        //chainblock -> database -> transactionsMap
        //transactionsMap (id -> Transaction)
        //1. нямаме транзакция с даденото id
        if (!transactionsMap.containsKey(id)) {
            throw new IllegalArgumentException("There is no transaction with such id.");
        }
        //2. имаме транзакция с даденото id
        else {
            Transaction transactionForChange = transactionsMap.get(id);
            transactionForChange.setStatus(newStatus);
        }
    }

    public void removeTransactionById(int id) {
        //transactionsMap (id -> Transaction)
        //1. имаме транзакция с даденото id
        if (transactionsMap.containsKey(id)) {
            this.transactionsMap.remove(id);
        }
        //2. нямаме транзакция с даденото id
        else {
            throw new IllegalArgumentException("There is no transaction with such id.");
        }
    }

    public Transaction getById(int id) {
        //transactionsMap (id -> Transaction)
        //1. нямаме транзакция с даденото ID -> IllegalArgumentException
        if (!transactionsMap.containsKey(id)) {
            throw new IllegalArgumentException("There is no transaction with given id.");
        }
        //2. имаме транзакция с даденото ID -> връщаме транзакцията
        return transactionsMap.get(id);
    }

    public Iterable<Transaction> getByTransactionStatus(TransactionStatus status) {
        List<Transaction> filteredTransactions = new ArrayList<>(); //транзакции с дадения статус
        for (Transaction transaction : this.transactionsMap.values()) {
            if (transaction.getStatus() == status) {
                filteredTransactions.add(transaction);
            }
        }

        //списък с филтрираните транзакции
        //1. нямаме транзакции с дадени статус
        if (filteredTransactions.isEmpty()) {
            throw new IllegalArgumentException("There is no transactions with given status.");
        }
        //2. имаме транзакции с дадения статус -> сортираме по amount в descending order
        filteredTransactions.sort(Comparator.comparing(Transaction::getAmount).reversed());
        return filteredTransactions;
    }

    public Iterable<String> getAllSendersWithTransactionStatus (TransactionStatus status) {
        return null;
    }

    public Iterable<String> getAllReceiversWithTransactionStatus(TransactionStatus status) {
        return null;
    }

    public Iterable<Transaction> getAllOrderedByAmountDescendingThenById() {
        return null;
    }

    public Iterable<Transaction> getBySenderOrderedByAmountDescending(String sender) {
        return null;
    }

    public Iterable<Transaction> getByReceiverOrderedByAmountThenById(String receiver) {
        return null;
    }

    public Iterable<Transaction> getByTransactionStatusAndMaximumAmount(TransactionStatus status, double amount) {
        return null;
    }

    public Iterable<Transaction> getBySenderAndMinimumAmountDescending(String sender, double amount) {
        return null;
    }

    public Iterable<Transaction> getByReceiverAndAmountRange(String receiver, double lo, double hi) {
        return null;
    }

    public Iterable<Transaction> getAllInAmountRange(double lo, double hi) {
        return null;
    }

    public Iterator<Transaction> iterator() {
        return null;
    }
}
