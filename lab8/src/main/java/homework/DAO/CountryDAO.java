package homework.DAO;

import homework.Database;

import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class CountryDAO {
    /**
     * this method creates a country for a specific continent ID
     *
     * @param name        name of the country
     * @param continentID continent id where the country should belong to
     * @throws SQLException exception
     */
    public void create(String name, int continentID) throws SQLException {
        Connection con = Database.getConnection();
        try (PreparedStatement pstmt = con.prepareStatement("insert into countries values ((?), (?))")) {
            pstmt.setString(1, name);
            pstmt.setInt(2, continentID);
            pstmt.executeUpdate();
        }
    }

    /**
     * this method adds countries in databse only using the name
     *
     * @param name name of the country
     * @throws SQLException exception
     */
    public void createWithoutContinent(String name) throws SQLException {
        Connection con = Database.getConnection();
        try (PreparedStatement pstmt = con.prepareStatement("INSERT INTO countries (name) VALUES (?)")) {
            pstmt.setString(1, name);
            pstmt.execute();
        }
        con.commit();
    }

    /**
     * this method finds a country only by his name
     *
     * @param name name of the country
     * @return id for that specific country
     * @throws SQLException exception
     */
    public Integer findByName(String name) throws SQLException {
        Connection con = Database.getConnection();
        try (PreparedStatement pstmt = con.prepareStatement("select id from countries where name=(?)")) {
            pstmt.setString(1, name);
            ResultSet rs = pstmt.executeQuery();
            return rs.next() ? rs.getInt(1) : null;
        }
    }

    /**
     * this methods finds a country only by his ID
     *
     * @param id id for that country
     * @return the name for that country based on how it is stored in the database
     * @throws SQLException exception
     */
    public String findById(Integer id) throws SQLException {
        Connection con = Database.getConnection();
        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("select id from countries where id='" + id + "'")) {
            return rs.next() ? rs.getString(1) : null;
        }
    }
}
