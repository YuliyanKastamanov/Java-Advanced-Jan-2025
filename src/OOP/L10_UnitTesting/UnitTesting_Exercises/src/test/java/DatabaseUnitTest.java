import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import p01_Database.Database;

import javax.naming.OperationNotSupportedException;

public class DatabaseUnitTest {



    //1. Тестваме само един сценарий
    //2. Имената на тестовете трябва да бъдат максимално описателни

    @Test
    public void whenCreateDatabaseWithZeroElements_thenExceptionIsThrow(){

        Integer[] elements = new Integer[0];

        Assertions.assertThrows(OperationNotSupportedException.class, () ->{

            Database database = new Database(elements);
        });
    }

    @Test
    public void whenCreateDatabaseWithMoreThanSixteenElements_thenExceptionIsThrow(){

        Integer[] elements = new Integer[17];

        Assertions.assertThrows(OperationNotSupportedException.class, () ->{

            Database database = new Database(elements);
        });
    }

    @Test
    public void whenCreateDatabaseWithAllowedCountsOfElements_thenDatabaseShouldBeSuccessfullyCreated() throws OperationNotSupportedException {


        Integer[] elements = new Integer[]{10, 20, 30, 40};
        Database database = new Database(elements);

        Assertions.assertArrayEquals(database.getElements(), elements);
        Assertions.assertEquals(database.getElements()[0], elements[0]);
        Assertions.assertEquals(database.getElements()[1], elements[1]);
        Assertions.assertEquals(database.getElements()[2], elements[2]);
        Assertions.assertEquals(database.getElements()[3], elements[3]);

    }


    @Test
    public void whenAddNullElementToDatabase_thenExceptionIsThrown() throws OperationNotSupportedException {

        Integer element = null;

        Integer[] elements = new Integer[]{10, 20, 30, 40};
        Database database = new Database(elements);

        Assertions.assertThrows(OperationNotSupportedException.class, () -> {

            database.add(element);

        });
    }

    @Test
    public void whenAddValidNumberToDatabase_thenTheNumberSuccessfullyAddedToDatabaseAndCountIncrementedByOne() throws OperationNotSupportedException {


        Integer element = 50;

        Integer[] elements = new Integer[]{10, 20, 30, 40};
        Database database = new Database(elements);

        database.add(element);
        //Очаквам:
        //1. Последният елемент в database трябва да бъде числото, което съм добавил
        Integer lastElement = database.getElements()[database.getElements().length - 1];
        Assertions.assertEquals(element, lastElement);

        //2. Броят на елементите да се увеличе с 1
        int newElementsCount = database.getElements().length;
        Assertions.assertEquals(newElementsCount, elements.length + 1);

    }

    @Test
    public void whenRemoveElementFromDatabaseWithManyElements_thenElementSuccessfullyRemovedAndCountDecrementedByOne() throws OperationNotSupportedException {

        Integer[] elements = new Integer[]{10, 20, 30, 40};
        Database database = new Database(elements);
        int initialCountOfElements = database.getElements().length;

        database.remove();

        int actualCountOfElements = database.getElements().length;
        Assertions.assertEquals(actualCountOfElements, initialCountOfElements - 1);
    }


    @Test
    public void whenRemoveElementFromEmptyDatabase_thenExceptionIsThrown() throws OperationNotSupportedException {

        Integer[] elements = new Integer[]{10};
        Database database = new Database(elements);
        database.remove();


        Assertions.assertThrows(OperationNotSupportedException.class, () -> {
            database.remove();
        });
    }



}
