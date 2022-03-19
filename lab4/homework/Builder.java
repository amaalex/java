package homework;

import com.github.javafaker.Faker;

import java.util.*;

/**
 * this class is used for building the instance of the problem, as it is presented in the description / example.
 */
public class Builder {
    static Faker faker = new Faker();

    private static final List<String> intersectionNames = Arrays.asList(faker.name().username(),
            faker.name().username(), faker.name().username(), faker.name().username(), faker.name().username(),
            faker.name().username(), faker.name().username(), faker.name().username(), faker.name().username(),
            faker.name().username());
    /**
     * this method builds a list of streets, along with the intersections which are connected to
     *
     * @return a list of streets
     */
    public static List<Street> createStreets() {
        List<Street> streetList = new LinkedList<>();
        streetList.add(new Street(faker.name().username(), 2, intersectionNames.get(1), intersectionNames.get(2)));
        streetList.add(new Street(faker.name().username(), 2, intersectionNames.get(1), intersectionNames.get(3)));
        streetList.add(new Street(faker.name().username(), 2, intersectionNames.get(1), intersectionNames.get(4)));
        streetList.add(new Street(faker.name().username(), 2, intersectionNames.get(2), intersectionNames.get(3)));
        streetList.add(new Street(faker.name().username(), 3, intersectionNames.get(2), intersectionNames.get(5)));
        streetList.add(new Street(faker.name().username(), 1, intersectionNames.get(3), intersectionNames.get(4)));
        streetList.add(new Street(faker.name().username(), 2, intersectionNames.get(3), intersectionNames.get(6)));
        streetList.add(new Street(faker.name().username(), 2, intersectionNames.get(3), intersectionNames.get(7)));
        streetList.add(new Street(faker.name().username(), 3, intersectionNames.get(4), intersectionNames.get(6)));
        streetList.add(new Street(faker.name().username(), 1, intersectionNames.get(5), intersectionNames.get(6)));
        streetList.add(new Street(faker.name().username(), 1, intersectionNames.get(5), intersectionNames.get(8)));
        streetList.add(new Street(faker.name().username(), 2, intersectionNames.get(5), intersectionNames.get(9)));
        streetList.add(new Street(faker.name().username(), 3, intersectionNames.get(6), intersectionNames.get(9)));
        streetList.add(new Street(faker.name().username(), 1, intersectionNames.get(7), intersectionNames.get(8)));
        streetList.add(new Street(faker.name().username(), 1, intersectionNames.get(7), intersectionNames.get(9)));
        streetList.add(new Street(faker.name().username(), 1, intersectionNames.get(8), intersectionNames.get(9)));

        return streetList;
    }

    /**
     * this methods builds a Set of intersections which does not have a street assigned.
     *
     * @return a Set of intersections
     */
    public static Set<Intersection> createIntersections() {
        Set<Intersection> intersections = new HashSet<>();
        intersections.add(new Intersection(intersectionNames.get(1)));
        intersections.add(new Intersection(intersectionNames.get(2)));
        intersections.add(new Intersection(intersectionNames.get(3)));
        intersections.add(new Intersection(intersectionNames.get(3))); // duplicate
        intersections.add(new Intersection(intersectionNames.get(3))); // duplicate
        intersections.add(new Intersection(intersectionNames.get(4)));
        intersections.add(new Intersection(intersectionNames.get(5)));
        intersections.add(new Intersection(intersectionNames.get(5))); // duplicate
        intersections.add(new Intersection(intersectionNames.get(6)));
        intersections.add(new Intersection(intersectionNames.get(7)));
        intersections.add(new Intersection(intersectionNames.get(8)));
        intersections.add(new Intersection(intersectionNames.get(9)));

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
