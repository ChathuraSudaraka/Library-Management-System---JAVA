package modal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;

public class Mysql2 {

    private static Connection connection;
    private static final String USER = "root";
    private static final String PASSWORD = "Same2u";
    private static final String DATABASE_NAME = "library-management-system";

    public static Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + DATABASE_NAME, USER, PASSWORD);
            }
            return connection;
        } catch (SQLException | ClassNotFoundException ex) {
            throw new ExceptionInInitializerError("Oops! MySQL Connection Failed: " + ex.getMessage());
        }
    }

    public static void iud(String query) {
        try {
            getConnection().createStatement().executeUpdate(query);
        } catch (SQLException ex) {
            throw new RuntimeException("Failed to execute update: " + ex.getMessage(), ex);
        }
    }

    public static ResultSet search(String query) throws SQLException {
        return getConnection().createStatement().executeQuery(query);
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException ex) {
                throw new RuntimeException("Failed to close connection: " + ex.getMessage(), ex);
            }
        }
    }
}
