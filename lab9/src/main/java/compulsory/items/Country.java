package compulsory.items;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Queries and database mapping
 */
@Getter
@Setter

@Entity
@Table(name = "countries")
@NamedQueries({
        @NamedQuery(name = "Country.findAll", query = "select e from Country e order by e.name"),

        @NamedQuery(name = "Country.findByName", query = "select e from Country e where e.name = :name"),


        @NamedQuery(name = "Country.findByNamePattern", query = "select e from Country e where e.name like :pattern"),

        @NamedQuery(name = "Country.findById", query = "select e from Country e where e.id = :id")
})

/**
 * this class describes a country and its relations
 */
public class Country implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "continent_id", nullable=false)
    private Continent continent;

    @OneToMany(mappedBy="country", cascade=CascadeType.MERGE)
    private Set<City> cities;

    public Country() {

    }

    public Country(String name, Continent continent) {
        this.name = name;
        this.continent = continent;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", continent=" + continent +
                '}';
    }
}

