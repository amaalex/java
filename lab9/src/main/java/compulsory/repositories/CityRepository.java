package compulsory.repositories;

import compulsory.items.City;
import compulsory.management.GlobalManagement;
import compulsory.items.Country;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * City Repository
 */
public class CityRepository {
    private EntityManager em;

    CityRepository() {
        this.em = GlobalManagement.getEntityManagerFactory().createEntityManager();
    }

    /**
     * this method returns a list of cities based on a specified country
     *
     * @param country country specified
     * @return list of cities from that country
     */
    public List<City> findByCountry(Country country) {
        return em.createNamedQuery("City.findByCountry").setParameter("country", country).getResultList();
    }
}
