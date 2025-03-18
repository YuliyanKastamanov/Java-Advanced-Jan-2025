package OOP.L09_Debugging_Techniques.Demo;

public class Main {

    public static void main(String[] args) {


        int a = 8;
        int b = 20;

        System.out.println(sum(a, b));

        a = 5;
        b = 15;

        System.out.println(sum(a, b));



        for (int i = 1; i <=100 ; i++) {
            Animal dog = new Animal("Rey", 5);
        }

        //dog.setName("Archi");


    }

    private static int sum(int a, int b) {

       return a + b;
    }
}
