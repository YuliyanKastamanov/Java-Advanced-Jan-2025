package L08_Generics.lab.jar;

public class Main {

    public static void main(String[] args) {

        Jar<Integer> jar = new Jar<>();
        jar.add(15);
        jar.add(45);
        jar.add(78);

        System.out.println(jar.remove());
    }
}
