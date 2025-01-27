package L06_Defining_Classes.Exercise.CatLady_09;

abstract class Cat {
    private String name;

    Cat(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    boolean isCatPresented(String name){
        return this.name.equals(name);
    }
}
