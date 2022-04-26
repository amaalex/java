package homework.DAO;

import homework.Database;

import java.sql.*;

public class CitiesDAO {
    /**
     * this method creates a city for a specific country ID
     *
     * @param name      name of the city
     * @param countryID country id where the country should belong to
     * @throws SQLException exception
     */
    public void create(String name, float latitude, float longitude, int countryID) throws SQLException {
        Connection con = Database.getConnection();
        try (PreparedStatement pstmt = con.prepareStatement("INSERT INTO cities (name, countryID, latitude, longitude) values (?, ?, ?, ?)")) {
            pstmt.setString(1, name);
            pstmt.setInt(2, countryID);
            pstmt.setFloat(3, latitude);
            pstmt.setFloat(4, longitude);
            pstmt.executeUpdate();
        }
        con.commit();
    }

    /**
     * this method finds a city only by his name
     *
     * @param name name of the city
     * @return id for that specific city
     * @throws SQLException exception
     */
    public Integer findByName(String name) throws SQLException {
        Connection con = Database.getConnection();
        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("select id from cities where name='" + name + "'")) {
            return rs.next() ? rs.getInt(1) : null;
        }
    }

    /**
     * this methods finds a city only by his ID
     *
     * @param id id for that country
     * @return the name for that city based on how it is stored in the database
     * @throws SQLException exception
     */
    public String findById(Integer id) throws SQLException {
        Connection con = Database.getConnection();
        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("select id from cities where id='" + id + "'")) {
            return rs.next() ? rs.getString(1) : null;
        }
    }

    /**
     * this method returns the latitude value for a specific city
     *
     * @param name name of the City
     * @return the corresponding latitude
     * @throws SQLException exception
     */
    public float getLatitudeFromCity(String name) throws SQLException {
        Connection con = Database.getConnection();
        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("select latitude from cities where name='" + name + "'")) {
            return rs.next() ? rs.getFloat(1) : null;
        }
    }

    /**
     * this method returns the longitude value for a specific city
     *
     * @param name name of the City
     * @return the specific longitude
     * @throws SQLException exception
     */
    public float getLongitudeFromCity(String name) throws SQLException {
        Connection con = Database.getConnection();
        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("select latitude from cities where name='" + name + "'")) {
            return rs.next() ? rs.getFloat(1) : null;
        }
    }
}
