package homework;

import homework.DAO.CitiesDAO;
import homework.DAO.CountryDAO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

public class Tool {

    public void addCountriesIntoDatabase(String fileName) throws IOException, SQLException {
        BufferedReader reader =new BufferedReader(new FileReader(fileName));
        String line = "";
        var country = new CountryDAO();
        while((line=reader.readLine())!=null){
            String [] splitData =line.trim().split(",");
            country.createWithoutContinent(splitData[0]);
        }
    }

    public void addCitiesIntoDatabase(String fileName) throws IOException, SQLException {
        BufferedReader reader =new BufferedReader(new FileReader(fileName));
        String line = "";
        var country = new CountryDAO();
        var city = new CitiesDAO();
        while((line=reader.readLine())!=null){
            String [] splitData =line.trim().split(",");
            int countryID = country.findByName(splitData[0]);
            city.create(splitData[1], Float.parseFloat(splitData[2]), Float.parseFloat(splitData[3]), countryID);
        }
    }
}
