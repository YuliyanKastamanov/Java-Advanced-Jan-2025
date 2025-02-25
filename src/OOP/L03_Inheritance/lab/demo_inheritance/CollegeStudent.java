package demo_inheritance;

public class CollegeStudent extends Student {

    protected CollegeStudent(String name, String address, String school) {
        super(name, address, school);
        validateName(name);
    }

    public static void validateName(String name) {
        if (name.length() < 4) {
            throw new IllegalArgumentException("Name has to have more than 4 symbols!");
        }
    }
}
