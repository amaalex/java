package homework;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * this class defines how an Intersection should look like - name and the corresponding Streets.
 */
public class Intersection {
    private final String name;
    private final Set<Street> streets = new HashSet<>();

    Intersection(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Street> getStreets() {
        return streets;
    }

    public void addStreet(Street street) {
        streets.add(street);
    }

    @Override
    public String toString() {
        return "Intersection{" +
                "name='" + name + '\'' +
                ", streets=" + streets +
                '}';
    }

    /**
     * equals and hashcode are needed because we are using Set for grouping, and HashSet needs a clear implementation
     * for not allowing duplicates.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Intersection)) return false;
        Intersection that = (Intersection) o;
        return getName().equals(that.getName()) && getStreets().equals(that.getStreets());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getStreets());
    }
}
