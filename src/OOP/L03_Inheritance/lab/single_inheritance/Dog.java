package single_inheritance;

public class Dog extends Animal {

    public void bark() {
        super.eat();
        this.eat();
        System.out.println("barking...");
    }

    @Override
    public void eat(){
        System.out.println("Overridden by Dog class!!!");
        System.out.println("eating...");
    }

    @Override
    public String toString() {
       return "Dog to String...";
    }
}
