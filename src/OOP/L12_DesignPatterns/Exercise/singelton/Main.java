package OOP.L12_DesignPatterns.Exercise.singelton;

public class Main {

    public static void main(String[] args) {


        /*Person yuli =  new Person("Yuli");
        Person ivan =  new Person("Ivan");
        Person poly =  new Person("Poly");*/

        //Singleton -> един клас, който има само една инстанция
        //private Constructors

        Database mySQL = Database.getInstance("MySQL");
        Database mariaDB = Database.getInstance("MariaDB");

        System.out.println();
    }



}
