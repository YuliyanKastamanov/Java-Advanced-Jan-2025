package demo;

public class Main {

    public static void main(String[] args) {
        // String in java is immutable
        String str = new String("old String");
        System.out.println(str);
        String newString = str.replaceAll("old", "new");
        System.out.println(str);
        System.out.println(newString);

    }
}
