package Exam_Examples.hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private String name;
    private int capacity;
    private List<Person> roster;

    public Hotel(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.roster = new ArrayList<>();
    }

    //Method add(Person person) - adds an entity to the roster if there is room for it
    public void add(Person person){
        if(this.roster.size() < capacity){
            this.roster.add(person);
        }
    }


    //•	Method remove(String name) - removes a person by given name, if such exists, and returns boolean
    public boolean remove(String name){
        boolean isSuccessful = false;

        for (Person person : roster){
            if (person.getName().equals(name)){
                roster.remove(person);
                isSuccessful = true;
                break;
            }
        }
        return isSuccessful;
    }

    //•	Method getPerson(String name, String hometown) –
    // returns the people with the given name and hometown or null if there is no such person.
    public Person getPerson(String name, String hometown){
        Person personToReturn = null;
        for (Person person : roster){
            if(person.getName().equals(name) && person.getHometown().equals(hometown)){
                personToReturn = person;
            }
        }
        return personToReturn;
    }

    //•	Getter getCount() – returns the number of people.
    public int getCount(){

        return roster.size();
    }

    //•	getStatistics() – returns a String in the following format:
    //o	"The people in the hotel {name} are:
    //{Person1}
    //{Person2}
    //(…)"

    public String getStatistics(){

        StringBuilder builder = new StringBuilder();
        builder.append(String.format("The people in the hotel %s are:%n", this.name));
        for (Person person : roster){
            builder.append(person.toString()).append(System.lineSeparator());
        }

        return builder.toString();

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
