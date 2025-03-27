import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ChainblockImplTest {
    private Chainblock database; //база от данни с транзакции
    private TransactionImpl transaction; //транзакция, с която работим в тестовете

    @Before
    public void setUp() {
        //преди всеки един тест създаваме празна база от данни и конкретна транзакция, с която да работим
        this.database = new ChainblockImpl();
        this.transaction = new TransactionImpl(1, TransactionStatus.SUCCESSFUL, "Desi", "Stoyan", 1000.00);
    }

    //add
    //1. добавяме транзакция, която я има в database
    @Test
    public void testAddExistingTransaction() {
        //празен database
        //transaction = {id: 1, status: SUCCESSFUL, from: "Desi", to: "Stoyan", amount: 1000.00}
        Assert.assertEquals(0, this.database.getCount());
        //0 transaction
        //добавяме транзакция
        this.database.add(transaction);
        //1 transaction
        Assert.assertEquals(1, this.database.getCount());
        //добавяме същата транзакция
        this.database.add(transaction);
        //1 transaction
        Assert.assertEquals(1, this.database.getCount());
    }

    //2. добавяме транзакция, която я няма в database
    @Test
    public void testAddCorrectTransaction() {
        //празен database
        //transaction = {id: 1, status: SUCCESSFUL, from: "Desi", to: "Stoyan", amount: 1000.00}
        Assert.assertEquals(0, this.database.getCount());
        //0 transaction
        //добавяме транзакция
        this.database.add(transaction);
        //1 transaction
        Assert.assertEquals(1, this.database.getCount());
    }

    //contains -> true (имаме такава транзакция в базата данни) и false (нямаме такава транзакция в базата данни)
    //contains(id)
    //contains(Transaction)
    @Test
    public void testContains() {
        //празен database
        //transaction = {id: 1, status: SUCCESSFUL, from: "Desi", to: "Stoyan", amount: 1000.00}
        // 0 transactions
        Assert.assertEquals(0, this.database.getCount());
        //проверяваме, че връща false ако няма транзакция с даденото id или няма същата транзакция
        Assert.assertFalse(this.database.contains(23));
        Assert.assertFalse(this.database.contains(transaction));

        //добавяме транзакция към database
        this.database.add(transaction);

        //1 transaction
        Assert.assertEquals(1, this.database.getCount());
        Assert.assertTrue(this.database.contains(1));
        Assert.assertTrue(this.database.contains(transaction));
    }

    //changeTransactionStatus
    //1. намираме транзакцията с дадено id -> сменяме статуса с дадения
    @Test
    public void testChangeTransactionStatus () {
        //празен database -  0 transactions
        //transaction = {id: 1, status: SUCCESSFUL, from: "Desi", to: "Stoyan", amount: 1000.00}
        this.database.add(transaction);
        //database - 1 transaction
        this.database.changeTransactionStatus(1, TransactionStatus.ABORTED);
        //database - 1 transaction
        transaction.setStatus(TransactionStatus.ABORTED);
        Assert.assertTrue(this.database.contains(transaction));
    }

    //2. нямаме транзакция с дадено id -> IllegalArgumentException
    @Test(expected = IllegalArgumentException.class)
    public void testChangeTransactionInvalidId() {
        //празен database -  0 transactions
        //transaction = {id: 1, status: SUCCESSFUL, from: "Desi", to: "Stoyan", amount: 1000.00}
        this.database.add(transaction);
        //database - 1 transaction
        this.database.changeTransactionStatus(23, TransactionStatus.ABORTED);
    }

    //removeTransactionById
    //1. премахваме транзакция по id, ако същестува
    @Test
    public void testSuccessfulRemoveTransactionById() {
        //празен database -  0 transactions
        //transaction = {id: 1, status: SUCCESSFUL, from: "Desi", to: "Stoyan", amount: 1000.00}
        Assert.assertEquals(0, this.database.getCount());

        //добавяме нова транзакция
        this.database.add(transaction);
        //database - 1 transaction

        //премахваме транзакция с id = 1
        this.database.removeTransactionById(transaction.getId());

        //празен database -  0 transactions
        Assert.assertEquals(0, this.database.getCount());
    }

    //2. премахваме несъществуваща транзакция
    @Test(expected = IllegalArgumentException.class)
    public void testRemoveTransactionByInvalidId () {
        //празен database -  0 transactions
        //transaction = {id: 1, status: SUCCESSFUL, from: "Desi", to: "Stoyan", amount: 1000.00}
        Assert.assertEquals(0, this.database.getCount());

        //добавяме нова транзакция
        this.database.add(transaction);
        //database - 1 transaction

        //премахваме транзакция с id = 2
        this.database.removeTransactionById(2);
    }

    //getById
    //1. ако имаме транзакция с даденото id -> връщаме дадената транзакция
    @Test
    public void testGetById() {
        //празен database -  0 transactions
        //transaction = {id: 1, status: SUCCESSFUL, from: "Desi", to: "Stoyan", amount: 1000.00}
        //добавяме нова транзакция
        this.database.add(transaction);
        //database - 1 transaction
        Transaction resultedTransaction = this.database.getById(transaction.getId());
        //проверка дали е върната правилната транзакция
        Assert.assertEquals(transaction.getId(), resultedTransaction.getId());
        Assert.assertEquals(transaction.getStatus(), resultedTransaction.getStatus());
        Assert.assertEquals(transaction.getFrom(), resultedTransaction.getFrom());
        Assert.assertEquals(transaction.getTo(), resultedTransaction.getTo());
        Assert.assertEquals(transaction.getAmount(), resultedTransaction.getAmount(), 0.01);
    }

    //2. ако нямаме транзакция с даденото id -> IllegalArgumentException
    @Test(expected = IllegalArgumentException.class)
    public void testGetByInvalidId() {
        //празен database -  0 transactions
        //transaction = {id: 1, status: SUCCESSFUL, from: "Desi", to: "Stoyan", amount: 1000.00}
        //добавяме нова транзакция
        this.database.add(transaction);
        //database - 1 transaction
        this.database.getById(5);
    }

    //getByTransactionStatus
    //1. имаме валиден статус -> всички транзакции с дадени статус, подредени в намаляващ ред по amount
    @Test
    public void testSuccessfulGetByTransactionStatus () {
        //празен database -  0 transactions
        //transaction = {id: 1, status: SUCCESSFUL, from: "Desi", to: "Stoyan", amount: 1000.00} -> не го използваме в този тест
        TransactionImpl firstTransaction = new TransactionImpl(1, TransactionStatus.SUCCESSFUL, "Ivan", "Peter", 1000.00);
        TransactionImpl secondTransaction = new TransactionImpl(2, TransactionStatus.SUCCESSFUL, "Georgi", "Stefan", 3000.00);
        TransactionImpl thirdTransaction = new TransactionImpl(3, TransactionStatus.ABORTED, "Peter", "Georgi", 2300.00);
        //добавяме създадените транзакции към database
        this.database.add(firstTransaction);
        this.database.add(secondTransaction);
        this.database.add(thirdTransaction);
        //филтрация по статус SUCCESSFUL
        Iterable<Transaction> result = this.database.getByTransactionStatus(TransactionStatus.SUCCESSFUL);
        List<Transaction> filteredTransactions = new ArrayList<>(); //списък с върнатите транзакции
        result.forEach(filteredTransactions::add);
        //проверка
        //1. всички транзакции ли са SUCCESSFUL
        filteredTransactions.forEach(tr -> Assert.assertEquals(TransactionStatus.SUCCESSFUL, tr.getStatus()));
        //2. транзакциите са подредени по намаляващ ред спрямо amount
        Assert.assertEquals(secondTransaction.getAmount(), filteredTransactions.get(0).getAmount(), 0.01);
        Assert.assertEquals(firstTransaction.getAmount(), filteredTransactions.get(1).getAmount(), 0.01);
    }

    //2. нямаме валиден статус -> IllegalArgumentException
    @Test(expected = IllegalArgumentException.class)
    public void testGetByInvalidTransactionStatus() {
        //празен database -  0 transactions
        TransactionImpl firstTransaction = new TransactionImpl(1, TransactionStatus.SUCCESSFUL, "Ivan", "Peter", 1000.00);
        TransactionImpl secondTransaction = new TransactionImpl(2, TransactionStatus.FAILED, "Georgi", "Stefan", 3000.00);
        TransactionImpl thirdTransaction = new TransactionImpl(3, TransactionStatus.ABORTED, "Peter", "Georgi", 2300.00);
        //добавяме създадените транзакции към database
        this.database.add(firstTransaction);
        this.database.add(secondTransaction);
        this.database.add(thirdTransaction);
        //филтрация по статус UNAUTHORIZED
        this.database.getByTransactionStatus(TransactionStatus.UNAUTHORIZED);
    }
}
