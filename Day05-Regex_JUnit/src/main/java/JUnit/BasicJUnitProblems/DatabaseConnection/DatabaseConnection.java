package JUnit.BasicJUnitProblems.DatabaseConnection;

public class DatabaseConnection {

    private static boolean isConnected;

    public static void connect() {
        isConnected = true;
        System.out.println("Database connected.");
    }

    public static void disconnect() {
        isConnected = false;
        System.out.println("Database disconnected.");
    }

    public static boolean isConnected() {
        return isConnected;
    }

    public static void main(String[] args) {
        DatabaseConnection db = new DatabaseConnection();

        db.connect();
        System.out.println("Is connected: " + db.isConnected());

        db.disconnect();
        System.out.println("Is connected: " + db.isConnected());
    }
}
