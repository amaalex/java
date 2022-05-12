package bonus.db;

import lombok.Getter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Getter
public class DatabaseJDBC {
    private static DatabaseJDBC singleInstance = null;

    String url;
    Connection con;

    private DatabaseJDBC(String url, String user, String password) {
        try {
            this.url = url;
            con = null;
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Successfully connected to the database");
        } catch (SQLException e) {
            System.err.println("Cannot connect to DB: " + e);
        }
    }

    public static DatabaseJDBC getInstance(String url, String user, String password) {

        if (singleInstance == null)
            singleInstance = new DatabaseJDBC(url, user, password);
        return singleInstance;
    }

    public void close(){
        try {
            if (con != null) con.close();
        }
        catch(SQLException e){
            System.err.println("Cannot close connection!");
        }
    }
}

