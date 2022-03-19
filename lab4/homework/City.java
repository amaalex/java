package homework;

import java.util.List;
import java.util.Set;

public class City {
    private final String name;
    private final List<Street> streets;
    private final Set<Intersection> intersections;

    City(String name, List<Street> streets, Set<Intersection> intersections){
        this.name = name;
        this.streets = streets;
        this.intersections = intersections;
    }

    public List<Street> getStreets() {
        return streets;
    }

    public Set<Intersection> getIntersections() {
        return intersections;
    }
}
