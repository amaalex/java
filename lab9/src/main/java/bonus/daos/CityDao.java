package bonus.daos;

import bonus.AbstractRepositoryJDBC;
import bonus.db.DatabaseJDBC;
import bonus.model.CityJDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CityDao extends AbstractRepositoryJDBC<CityJDBC> {

    public CityJDBC findById(int id) {
        Connection con = DatabaseJDBC.getInstance("jdbc:postgresql://localhost:5432/postgres","postgres","student").getCon();
        CityJDBC city = new CityJDBC();
        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(
                     "select name from cities where id='" + id + "'")) {
            if (rs.next() == true) {
                city.setName(rs.getString(1));
            } else return null;
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally {
            return city;
        }
    }

}
