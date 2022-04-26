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

    /**
     * this function calculates the distance between two cities based on their location on map
     *
     * @param city1 name of the city 1
     * @param city2 name of the city 2
     * @return the distance in KM
     * @throws SQLException exception
     *                      <p>
     *                      Note: the logic from this method is inspired from www.geeksforgeeks.org/
     */
    public double calculateDistancesBetweenTwoCities(String city1, String city2) throws SQLException {
        var cityDAO = new CitiesDAO();
        float latitudeOne = cityDAO.getLatitudeFromCity(city1);
        float longitudeOne = cityDAO.getLongitudeFromCity(city1);

        float latitudeTwo = cityDAO.getLatitudeFromCity(city2);
        float longitudeTwo = cityDAO.getLongitudeFromCity(city2);

        // The math module contains a function
        // named toRadians which converts from
        // degrees to radians.
        double lon1 = Math.toRadians(longitudeOne);
        double lon2 = Math.toRadians(longitudeTwo);
        double lat1 = Math.toRadians(latitudeOne);
        double lat2 = Math.toRadians(latitudeTwo);

        // Haversine formula
        double dlon = lon2 - lon1;
        double dlat = lat2 - lat1;
        double a = Math.pow(Math.sin(dlat / 2), 2)
                + Math.cos(lat1) * Math.cos(lat2)
                * Math.pow(Math.sin(dlon / 2), 2);

        double c = 2 * Math.asin(Math.sqrt(a));

        // Radius of earth in kilometers. Use 3956
        // for miles
        double r = 6371;

        // calculate the result
        return (c * r);
    }
}
