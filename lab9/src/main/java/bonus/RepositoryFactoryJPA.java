package bonus;

import bonus.AbstractFactory;
import bonus.AbstractRepository;
import compulsory.repositories.CityRepositoryJPA;
import compulsory.repositories.CountryRepositoryJPA;

public class RepositoryFactoryJPA extends AbstractFactory {
    @Override
    public AbstractRepository getCityRepository() {
        return new CityRepositoryJPA();
    }

    @Override
    public AbstractRepository getCountryRepository() {
        return new CountryRepositoryJPA();
    }

    @Override
    public AbstractRepository getContinentRepository() {
        return new CountryRepositoryJPA();
    }
}
