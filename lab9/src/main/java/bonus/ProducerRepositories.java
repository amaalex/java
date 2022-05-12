package bonus;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Class that helps at building the necessary specific repositories.
 */
public class ProducerRepositories {

    private AbstractFactory provider;

    public void chooseProvider(String fileName) {
        BufferedReader reader = null;
        String providerType;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line = reader.readLine();
            providerType = line;
            if (providerType.equals("JPA")) {
                provider = new RepositoryFactoryJPA();
            } else {
                provider = new RepositoryFactoryJDBC();
            }
        } catch (IOException e) {
            System.out.println("Error at handling file!");
        }
    }

    public AbstractRepository getCity() {
        return provider.getCityRepository();
    }

    public AbstractRepository getCountry() {
        return provider.getCountryRepository();
    }

    public AbstractRepository getContinent() {
        return provider.getContinentRepository();
    }
}
