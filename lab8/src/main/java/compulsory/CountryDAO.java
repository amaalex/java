package compulsory;

import java.sql.*;

public class CountryDAO {
    public void create (String name, int continentID) throws SQLException {
        Connection con = Database.getConnection();
        try (PreparedStatement pstmt = con.prepareStatement("insert into countries (name), (continentID) values (?), (?)")){
            pstmt.setString(1, name);
            pstmt.setInt(2, continentID);
            pstmt.executeUpdate();
        }
    }

    public Integer findByName(String name) throws SQLException{
        Connection con = Database.getConnection();
        try(Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select id from countries where name='" + name + "'")){
            return rs.next() ? rs.getInt(1) : null;
        }
    }

    public Integer findById(Integer id) throws SQLException{
        Connection con = Database.getConnection();
        try(Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select id from countries where id='" + id + "'")){
            return rs.next() ? rs.getInt(1) : null;
        }
    }
}
