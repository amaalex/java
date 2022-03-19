package homework;

import java.util.List;
import java.util.Set;

/**
 * this class is used for displaying in the terminal different types of objects
 */
public class Display {
    /**
     * method used for displaying the current streets
     *
     * @param streetList is a list of streets already given / already built
     */
    public static void displayStreets(List<Street> streetList) {
        System.out.println("===================");
        for (Street street : streetList) {
            System.out.println(street);
        }
    }

    /**
     * method used for displaying the current intersections
     *
     * @param intersections is a list of intersections already given / already built
     */
    public static void displayIntersections(Set<Intersection> intersections) {
        System.out.println("===================");
        for (Intersection intersection : intersections) {
            System.out.println(intersection);
        }
    }

    /**
     * method used to display the solution of the problem
     *
     * @param solution the solution already made
     */
    public static void displaySolution(Solution solution) {
        System.out.println("Total Length: " + solution.getTotalLengthFinal());
        System.out.println("Visited Intersections: " + solution.getVisitedNodes());
    }
}
