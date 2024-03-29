package compulsory.repositories;

import compulsory.items.Country;
import compulsory.management.GlobalManagement;
import homework.repositories.AbstractRepositoryJPA;

import javax.persistence.EntityManager;

public class CountryRepositoryJPA extends AbstractRepositoryJPA<Country> {

    private EntityManager em;

    public CountryRepositoryJPA() {
        this.em = GlobalManagement.getEntityManagerFactory().createEntityManager();
        setType("Country");
    }

    public Country findByName(String name){
        return (Country) em.createNamedQuery("Country.findByName").setParameter("name", name).getSingleResult();
    }
}
