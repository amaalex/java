package homework;

import homework.DAO.CitiesDAO;
import homework.DAO.CountryDAO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

public class Tool {

    /**
     * this method creates countries from an external source of data
     *
     * @param fileName fileName where the data is stored
     * @throws IOException  exception
     * @throws SQLException exception
     */
    public void addCountriesIntoDatabase(String fileName) throws IOException, SQLException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line = "";
        var country = new CountryDAO();
        while ((line = reader.readLine()) != null) {
            String[] splitData = line.trim().split(",");
            country.createWithoutContinent(splitData[0]);
        }
    }

    /**
     * this method creates cities from an external source of data
     *
     * @param fileName fileName where the data is stored
     * @throws IOException  exception
     * @throws SQLException exception
     */
    public void addCitiesIntoDatabase(String fileName) throws IOException, SQLException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line = "";
        var country = new CountryDAO();
        var city = new CitiesDAO();
        while ((line = reader.readLine()) != null) {
            String[] splitData = line.trim().split(",");
            int countryID = country.findByName(splitData[0]);
            city.create(splitData[1], Float.parseFloat(splitData[2]), Float.parseFloat(splitData[3]), countryID);
        }
    }
}
