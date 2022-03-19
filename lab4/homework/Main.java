package homework;

import java.util.List;
import java.util.Set;

/**
 * this class showcases the basic flow of this assignment
 */
public class Main {
    public static void main(String[] args) {
        List<Street> streets = Builder.createStreets();
        Set<Intersection> intersections = Builder.createIntersections();
        Builder.buildIntersections(streets, intersections);

        streets.sort(Street::compareByLength);

        City C1 = new City("C1", streets, intersections);

        // Intersctions with more than 3 Streets
        List<String> filteredIntersections = intersections.stream()
                .filter(intersection -> intersection.getStreets().size() > 3)
                .map(Intersection::getName)
                .toList();

        // Getting the Intersections needed
        List<Street> filteredStreets = streets.stream()
                .filter(street -> filteredIntersections.contains(street.getIntersectionOne()))
                .filter(street -> filteredIntersections.contains(street.getIntersectionTwo()))
                .toList();

        // Display.displayStreets(filteredStreets);

        City city = new City("MyCity", streets, intersections);
        Solution solution = new Solution(city);

        Display.displaySolution(solution);
    }
}
