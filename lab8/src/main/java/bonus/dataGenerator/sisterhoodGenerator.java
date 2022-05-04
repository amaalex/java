package bonus.dataGenerator;

import bonus.Database;

import java.sql.*;
import java.util.Random;

class sisterhoodGenerator {

    /**
     * this method will generate connections between already existing cities in sisterhoods table
     */
    public void generate() {
        try {
            Connection con = Database.getConnection();
            Statement stmt = con.createStatement();
            ResultSet resultSet = stmt.executeQuery("SELECT count(*) FROM fake_cities");
            resultSet.next();
            int numberOfCities = resultSet.getInt(1);
            if (numberOfCities == 0) {
                return;
            }

            Random rand = new Random();
            int cityOne = rand.nextInt(numberOfCities - 1) + 1;
            int cityTwo = rand.nextInt(numberOfCities - 1) + 1;
            while (cityOne == cityTwo) {
                cityTwo = rand.nextInt(numberOfCities - 1) + 1;
            }
            PreparedStatement pstmt = con.prepareStatement(
                    "INSERT INTO sisterhoods(sister1, sister2) VALUES (?,?)");
            pstmt.setInt(1, cityOne);
            pstmt.setInt(2, cityTwo);
            pstmt.executeUpdate();

            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
