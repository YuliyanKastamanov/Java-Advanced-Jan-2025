package OOP.L01_WorkingWithAbstraction.demo;

import demo.Person;

public class MyPerson extends Person {

    public MyPerson(String name, int age) {
        super(name, age);
    }

//    @Override
//    public String getName() {
//        System.out.println("This getter is overridden by MyPerson class!");
//        return super.getName();
//    }

    void printAge(){
//        System.out.println(this.age);
    }
}
