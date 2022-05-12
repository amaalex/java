package bonus;

import homework.repositories.AbstractRepositoryJPA;

/**
 * Abstract class for modeling the JDBC factory
 * and the JPA factory
 */
public abstract class AbstractFactory {
     public abstract AbstractRepository getCityRepository();
     public abstract AbstractRepository getCountryRepository();
     public abstract AbstractRepository getContinentRepository();
}
