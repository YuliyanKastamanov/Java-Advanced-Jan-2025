package OOP.L12_DesignPatterns.Exercise.singelton;

public class Database {
    private String type;
    private static Database instance = null;

    private Database(String type) {
        this.type = type;
    }

    private Database() {
    }

    public void setType(String type) {
        this.type = type;
    }

    public static void setInstance(Database instance) {
        Database.instance = instance;
    }

    public static Database getInstance(String type){

        // имаме съществуващ обект
        if(instance != null){
            instance.setType(type);
            return instance;
        }

        //нямаме съществуващ обект -> instance == null
        Database database = new Database(type);
        instance = database;
        return database;
    }
}
