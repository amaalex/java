package homework.DAO;

import homework.Database;

import java.sql.*;

public class ContinentDAO {
    /**
     * this method creates a continent
     *
     * @param name name of the continent
     * @throws SQLException exception
     */
    public void create(String name) throws SQLException {
        Connection con = Database.getConnection();
        try (PreparedStatement pstmt = con.prepareStatement("insert into continents (name) values (?)")) {
            pstmt.setString(1, name);
            pstmt.executeUpdate();
        }
    }

    /**
     * this menthod return the id of a country searched by his name
     *
     * @param name name of the country we're searching for
     * @return the id for the country
     * @throws SQLException exception
     */

    public Integer findByName(String name) throws SQLException {
        Connection con = Database.getConnection();
        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("select id from continents where name='" + name + "'")) {
            return rs.next() ? rs.getInt(1) : null;
        }
    }

    /**
     * this method finds a country by its ID
     *
     * @param id id of the country we're searching for
     * @return return the name of the country from the database
     * @throws SQLException exception
     */
    public String findById(Integer id) throws SQLException {
        Connection con = Database.getConnection();
        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("select name from continents where id='" + id + "'")) {
            return rs.next() ? rs.getString(1) : null;
        }
    }
}
