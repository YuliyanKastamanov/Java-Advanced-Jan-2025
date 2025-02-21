package OOP.L01_WorkingWithAbstraction.demo;

import demo.Person;

public class Main {

    public static void main(String[] args) {

        MyPerson myPerson = new MyPerson("Peter", 25);
        System.out.println(myPerson.getName());
        myPerson.setName("Kaloyan");
        System.out.println(myPerson.getName());


//        final int number = 10;
//        number = 25;

    }
}
