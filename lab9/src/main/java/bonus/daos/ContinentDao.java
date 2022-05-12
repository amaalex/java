package bonus.daos;

import bonus.AbstractRepositoryJDBC;
import bonus.db.DatabaseJDBC;
import bonus.model.ContinentJDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ContinentDao extends AbstractRepositoryJDBC<ContinentJDBC> {

    public ContinentJDBC findById(int id) {
        Connection con = DatabaseJDBC.getInstance("jdbc:postgresql://localhost:5432/postgres", "postgres", "student").getCon();
        ContinentJDBC continent = new ContinentJDBC();
        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(
                     "select name from continents where id='" + id + "'")) {
            rs.next();
            continent.setName(rs.getString(1));
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            return continent;
        }
    }
}
