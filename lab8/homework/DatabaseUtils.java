package lab8.compulsory;

import java.sql.*;

import lib/c3p0-0.9.5.5.jar;
import lib/mchange-commons-java-0.2.19.jar;
public class DatabaseUtils {
    private static ComboPooledDataSource cpds = new;
    /*private static final String URL =
            "jdbc:postgresql://127.0.0.1:5432/postgres";
    private static final String USER = "postgres";
    private static final String PASSWORD = "stefana2002";*/
    private static Connection connection = null;
    private DatabaseUtils() {}

    public static Connection getConnection() {
        return cpds.getConnection();
    }
    static void createConnection() {
        try {
            cpds.setDriverClass("org.h2.Driver");
            cpds.setJdbcUrl("jdbc:postgresql://127.0.0.1:5432/postgres");
            cpds.setUser("postgres");
            cpds.setPassword("stefana2002");

            /*Connection connect = DriverManager.getConnection(URL, USER, PASSWORD);
            connect.setAutoCommit(false);*/
        } catch (PropertyVetoException e) {
            System.err.println(e);
        }
    }
    public static void closeConnection() {
        cpds.close();
    }

    public static void rollback(){

    }
}
