package L09_Iterators_and_Comparators.Exercise.ComparingObjects_05;

public class Person implements Comparable<Person>{

    private String name;
    private Integer age;
    private String town;

    public Person(String name, Integer age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getTown() {
        return town;
    }

    @Override
    public int compareTo(Person otherPerson) {

        //Отговора при сравнение ще бъде следния
        // 0 = еднакви стойност
        // 1 = различни стойност
        //-1 = различни стойност

        //1. Сравнение по имена
        int nameComparingResult = this.name.compareTo(otherPerson.name);
        //2. Сравнение по години
        int ageComparingResult = this.age.compareTo(otherPerson.age);
        //3. Сравнение по градове
        int townComparingResult = this.town.compareTo(otherPerson.town);

        if(nameComparingResult != 0){
            return nameComparingResult;
        }else if(ageComparingResult != 0){
            return ageComparingResult;
        }else {
            return townComparingResult;
        }

    }
}
