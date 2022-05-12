package bonus.daos;


import bonus.AbstractRepositoryJDBC;
import bonus.db.DatabaseJDBC;
import bonus.model.CountryJDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CountryDao extends AbstractRepositoryJDBC<CountryJDBC> {

    public CountryJDBC findById(int id){
        Connection con = DatabaseJDBC.getInstance("jdbc:postgresql://localhost:5432/postgres", "postgres", "student").getCon();
        CountryJDBC country = new CountryJDBC();
        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(
                     "select name from countries where id='" + id + "'")) {
            rs.next();
            country.setId(id);
            country.setName(rs.getString(1));
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally {
            return country;
        }
    }
}
