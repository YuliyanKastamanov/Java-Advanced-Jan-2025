package JavaAdvanced.L09_Iterators_and_Comparators.Exercise.StrategyPattern_06;

public class Person {

    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }
}
