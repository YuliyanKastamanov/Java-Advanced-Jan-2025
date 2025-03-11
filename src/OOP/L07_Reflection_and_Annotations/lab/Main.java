public class Main {

    @Author(name = "George")
    public static void main(String[] args) throws NoSuchMethodException {
        Tracker.printMethodsByAuthor(Reflection.class);
    }


    @Author(name = "Kaloyan")
    private void someMethod(){

    }
}
