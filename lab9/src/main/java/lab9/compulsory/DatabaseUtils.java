package lab9.compulsory;

import java.sql.*;
public class DatabaseUtils {
    private static final String URL =
            "jdbc:postgresql://127.0.0.1:5432/postgres";
    private static final String USER = "postgres";
    private static final String PASSWORD = "stefana2002";
    private static Connection connection = null;
    private DatabaseUtils() {}
    public static Connection getConnection() {
        return connection;
    }
    static void createConnection() {
        try {
            Connection connect = DriverManager.getConnection(URL, USER, PASSWORD);
            connect.setAutoCommit(false);
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
    public static void closeConnection() {
        //TODO
    }

    public static void rollback(){

    }
}
