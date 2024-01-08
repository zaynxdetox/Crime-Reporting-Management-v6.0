import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DatabaseConnectivity {
private static DatabaseConnectivity instance;
private Connection connection;

private DatabaseConnectivity() {
try {
Class.forName("com.mysql.jdbc.Driver");
connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_db", "root", "");
} catch (Exception e) {
JOptionPane.showMessageDialog(null, "Database Connection Failed!");
    }
}

public static synchronized DatabaseConnectivity getInstance() {
if (instance == null) {
instance = new DatabaseConnectivity();
    }
return instance;
}

public Connection getConnection() {
Thread connectionThread = new Thread(() -> {
try {
Class.forName("com.mysql.jdbc.Driver");
connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_db", "root", "");
} catch (Exception e) {
JOptionPane.showMessageDialog(null, "Database Connection Failed!");
    }
});
connectionThread.start();
// Wait for the connection thread to finish before returning the connection
try {
connectionThread.join();
} catch (InterruptedException e) {
JOptionPane.showMessageDialog(null, "Thread interrupted!");
Thread.currentThread().interrupt();
    }
return connection;
}

public void closeConnection() {
try {
if (connection != null && !connection.isClosed()) {
connection.close();
    }
} catch (Exception e) {
JOptionPane.showMessageDialog(null, "Error while closing connection!");
    }
  }
}

