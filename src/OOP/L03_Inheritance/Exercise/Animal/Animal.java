package Animal;

public class Animal {

    private static final String INVALID_INPUT = "Invalid input!";

    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) {
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.trim().isEmpty()){
            this.name = name;
        }else {
            throw new IllegalArgumentException(INVALID_INPUT);
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if(age >= 0){
            this.age = age;
        }else {
            throw new IllegalArgumentException(INVALID_INPUT);
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {

        if (!gender.trim().isEmpty()){
            this.gender = gender;
        }else {
            throw new IllegalArgumentException(INVALID_INPUT);
        }
    }

    public String produceSound(){
        return null;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        builder.append(String.format("%s%n", this.getClass().getSimpleName()));
        builder.append(String.format("%s %d %s%n", this.name, this.age, this.gender));
        builder.append(this.produceSound());
        return builder.toString();
    }
}
