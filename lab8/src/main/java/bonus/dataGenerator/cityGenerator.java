package bonus.dataGenerator;

import bonus.Database;
import com.github.javafaker.Faker;

import java.sql.*;

class cityGenerator implements Runnable {

    private Faker randomString = null;

    public cityGenerator() {
        this.randomString = new Faker();
    }

    /**
     * this method will generate cities with random names
     */
    public void generateCities() {
        try {
            Connection con = Database.getConnection();
            String cityName = randomString.address().cityName();
            PreparedStatement pstmt = con.prepareStatement("INSERT INTO fake_cities(name) VALUES (?)");
            pstmt.setString(1, cityName);
            pstmt.executeUpdate();
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * this method will be executed by threads
     */
    @Override
    public void run() {
        for (int times = 0; times < 1100; times++) {
            this.generateCities();
            times++;
        }
    }
}
