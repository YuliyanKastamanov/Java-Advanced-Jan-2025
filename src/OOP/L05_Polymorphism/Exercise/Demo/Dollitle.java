package OOP.L05_Polymorphism.Exercise.Demo;

public class Dollitle {



    public void  healCat(Cat cat){



        if(cat instanceof Lion){
            ((Lion) cat).roar();
        }

        System.out.printf("%s has been healed and is ready to run!%n", cat.getClass().getSimpleName());
        cat.run();
    }


}
