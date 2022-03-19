import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * this class is used for building the instance of the problem, as it is presented in the description / example.
 */
public class Builder {
    /**
     * this method builds a list of streets, along with the intersections which are connected to
     *
     * @return a list of streets
     */
    public static List<Street> createStreets() {
        List<Street> streetList = new LinkedList<>();
        streetList.add(new Street("Street1", 2, "I1", "I2"));
        streetList.add(new Street("Street2", 2, "I1", "I3"));
        streetList.add(new Street("Street3", 2, "I1", "I4"));
        streetList.add(new Street("Street4", 2, "I2", "I3"));
        streetList.add(new Street("Street5", 3, "I2", "I5"));
        streetList.add(new Street("Street6", 1, "I3", "I4"));
        streetList.add(new Street("Street7", 2, "I3", "I6"));
        streetList.add(new Street("Street8", 2, "I3", "I7"));
        streetList.add(new Street("Street9", 3, "I4", "I6"));
        streetList.add(new Street("Street10", 1, "I5", "I6"));
        streetList.add(new Street("Street11", 1, "I5", "I8"));
        streetList.add(new Street("Street12", 2, "I5", "I9"));
        streetList.add(new Street("Street13", 3, "I6", "I9"));
        streetList.add(new Street("Street14", 1, "I7", "I8"));
        streetList.add(new Street("Street15", 1, "I7", "I9"));
        streetList.add(new Street("Street16", 1, "I8", "I9"));

        return streetList;
    }

    /**
     * this methods builds a Set of intersections which does not have a street assigned.
     *
     * @return a Set of intersections
     */
    public static Set<Intersection> createIntersections() {
        Set<Intersection> intersections = new HashSet<>();
        intersections.add(new Intersection("I1"));
        intersections.add(new Intersection("I2"));
        intersections.add(new Intersection("I3"));
        intersections.add(new Intersection("I3")); // duplicate
        intersections.add(new Intersection("I3")); // duplicate
        intersections.add(new Intersection("I4"));
        intersections.add(new Intersection("I5"));
        intersections.add(new Intersection("I5")); // duplicate
        intersections.add(new Intersection("I6"));
        intersections.add(new Intersection("I7"));
        intersections.add(new Intersection("I8")); // duplicate
        intersections.add(new Intersection("I8")); // duplicate

        return intersections;
    }

    /**
     * this method assigns a list of streets with the corresponded intersections
     *
     * @param streets       a list of streets already made
     * @param intersections a list of intersections already made
     */
    public static void buildIntersections(List<Street> streets, Set<Intersection> intersections) {
        for (Intersection intersection : intersections) {
            streets.stream()
                    .filter(street -> street.getIntersectionOne().equals(intersection.getName()) ||
                            street.getIntersectionTwo().equals(intersection.getName()))
                    .forEach(intersection::addStreet);
        }
    }
}
