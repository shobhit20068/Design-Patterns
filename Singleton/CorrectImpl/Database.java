package Singleton.CorrectImpl;

public class Database {
    private static Database instance;

    private Database() {
        System.out.println("Connecting to the database...");
    }

    public static Database getInstance() {
        if(instance == null) {
            instance = new Database();
        }
        return instance;
    }
}
