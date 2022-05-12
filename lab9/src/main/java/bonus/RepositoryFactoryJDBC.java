package bonus;

import bonus.daos.CityDao;
import bonus.daos.ContinentDao;
import bonus.daos.CountryDao;
import bonus.db.DatabaseJDBC;
import compulsory.management.GlobalManagement;
import compulsory.repositories.CityRepositoryJPA;
import compulsory.repositories.ContinentRepositoryJPA;
import compulsory.repositories.CountryRepositoryJPA;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class RepositoryFactoryJDBC extends AbstractFactory {

    @Override
    public AbstractRepository getCityRepository(){
        return new CityDao();
    }

    @Override
    public AbstractRepository getCountryRepository() {
        return new CountryDao();
    }

    @Override
    public AbstractRepository getContinentRepository() {
        return new ContinentDao();
    }


    /*
    public Object create(String fileName) {
        BufferedReader reader = null;
        String repoType = null;
        String repoName = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line = reader.readLine();
            repoType = line;
            line = reader.readLine();
            repoName = line;
        } catch (FileNotFoundException e) {
            System.out.println("Error: file not found!");
        } catch (IOException ioException) {
            System.out.println("Error: at reading from file!");
        }
        return create(repoType,repoName);
    }
     */
}
