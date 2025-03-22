import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import p02_ExtendedDatabase.Database;
import p02_ExtendedDatabase.Person;

import javax.naming.OperationNotSupportedException;

public class ExtendedDatabaseUnitTest {


    //add(Person person)


    @Test
    public void whenTryToAddNullValue_thenExceptionIsThrown() throws OperationNotSupportedException {
        Person yuli = new Person(1, "Yuli");
        Person gosho = new Person(2, "Gosho");
        Person[] people = {yuli, gosho};

        Database database = new Database(people);

        Assertions.assertThrows(OperationNotSupportedException.class, () -> {

            database.add(null);
        });
    }

    @Test
    public void whenTryToAddNonNullValue_thenPersonIsAddedAndIndexIsIncreaseByOne() throws OperationNotSupportedException {
        Person yuli = new Person(1, "Yuli");
        Person gosho = new Person(2, "Gosho");
        Person[] people = {yuli, gosho};

        Database database = new Database(people);
        int initialPeopleCount = database.getElements().length;

        Person pesho = new Person(3, "Pesho");
        database.add(pesho);

        int newPeopleCount =  database.getElements().length;

        Person lastPerson = database.getElements()[newPeopleCount - 1];

        //1. Pesho to be added in database
        Assertions.assertEquals(lastPerson, pesho);

        //2. Count people to be incremented by one
        Assertions.assertEquals(newPeopleCount, initialPeopleCount + 1);


    }

    @Test
    public void whenTryToFindByUsernameWithValueNull_thenExceptionIsThrown() throws OperationNotSupportedException {

        Person yuli = new Person(1, "Yuli");
        Person gosho = new Person(2, "Gosho");
        Person[] people = {yuli, gosho};

        Database database = new Database(people);

        Assertions.assertThrows(OperationNotSupportedException.class, () -> {

            database.findByUsername(null);

        });

    }

    @Test
    public void whenTryToFindByUnknownUsername_thenExceptionIsThrown() throws OperationNotSupportedException {

        Person yuli = new Person(1, "Yuli");
        Person gosho = new Person(2, "Gosho");
        Person[] people = {yuli, gosho};

        Database database = new Database(people);

        Assertions.assertThrows(OperationNotSupportedException.class, () -> {

            database.findByUsername("Pesho");

        });

    }

    @Test
    public void whenTryToFindExistingUsername_thenPersonIsReturned() throws OperationNotSupportedException {

        Person yuli = new Person(1, "Yuli");
        Person gosho = new Person(2, "Gosho");
        Person[] people = {yuli, gosho};

        Database database = new Database(people);

        Person findByUsername = database.findByUsername("Yuli");

        Assertions.assertEquals(findByUsername.getUsername(), "Yuli");
        Assertions.assertEquals(findByUsername.getId(), 1);
        Assertions.assertEquals(findByUsername, yuli);


    }

    @Test
    public void whenTryToFindByUnknownId_thenExceptionIsThrown() throws OperationNotSupportedException {

        Person yuli = new Person(1, "Yuli");
        Person gosho = new Person(2, "Gosho");
        Person[] people = {yuli, gosho};

        Database database = new Database(people);

        Assertions.assertThrows(OperationNotSupportedException.class, () -> {

            database.findById(10);

        });

    }


    @Test
    public void whenTryToFindExistingId_thenPersonIsReturned() throws OperationNotSupportedException {

        Person yuli = new Person(1, "Yuli");
        Person gosho = new Person(2, "Gosho");
        Person[] people = {yuli, gosho};

        Database database = new Database(people);

        Person personFoundById = database.findById(1);

        Assertions.assertEquals(personFoundById.getId(), 1);
        Assertions.assertEquals(personFoundById.getUsername(), "Yuli");
        Assertions.assertEquals(personFoundById, yuli);


    }


    @Test
    public void whenRemovePersonFromDatabaseWithManyPeople_thenElementSuccessfullyRemovedAndCountDecrementedByOne() throws OperationNotSupportedException {


        Person yuli = new Person(1, "Yuli");
        Person gosho = new Person(2, "Gosho");
        Person[] people = {yuli, gosho};

        Database database = new Database(people);
        int initialCountOfElements = database.getElements().length;

        database.remove();

        int actualCountOfElements = database.getElements().length;
        Assertions.assertEquals(actualCountOfElements, initialCountOfElements - 1);
    }

    @Test
    public void whenRemovePersonFromEmptyDatabase_thenExceptionIsThrown() throws OperationNotSupportedException {


        Person yuli = new Person(1, "Yuli");
        Person[] people = {yuli};

        Database database = new Database(people);

        database.remove();


        Assertions.assertThrows(OperationNotSupportedException.class, () -> {
            database.remove();
        });
    }

    @Test
    public void whenCreateDatabaseWithZeroElements_thenExceptionIsThrow(){

        Person[] personArrayWithZeroElements = new Person[0];

        Assertions.assertThrows(OperationNotSupportedException.class, () ->{

           Database database = new Database(personArrayWithZeroElements);
        });
        Person[] personArrayWithMoreThan17Elements = new Person[20];


        Assertions.assertThrows(OperationNotSupportedException.class, () ->{

            Database database = new Database(personArrayWithMoreThan17Elements);
        });

    }



}
