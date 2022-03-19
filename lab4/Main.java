import java.util.*;

/**
 * this class showcases the basic flow of this assignment
 */
public class Main {
    public static void main(String[] args) {
        List<Street> streets = Builder.createStreets();
        Set<Intersection> intersections = Builder.createIntersections();
        Builder.buildIntersections(streets, intersections);

        Display.displayStreets(streets);

        streets.sort(Street::compareByLength);

        Display.displayStreets(streets);

        Display.displayIntersections(intersections);
    }
}
