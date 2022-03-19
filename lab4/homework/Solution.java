package homework;

/**
 * Mindset:
 * Setez primul nod ca fiind vizitat, si pornesc de la el.
 * Fac lista cu toti vecinii nodurilor vizitate, care sa nu faca parte din lista nodurilor vizitate.
 * Iau toate nodurile vizitate si calculez distanta la toate nodurile vecine nevizitate
 * Iau distanta minima si nodul la care se ajunge cu distanta minima
 * Adaug nodul in lista nodurilor vizitate ca sa-l iau in considerare la iteratia urmatoare.
 * Adaug la suma totala a lungimilor distanta calculata adineauri.
 * <p>
 * Repet procedeul, acum avand o lista mai mare de noduri vizitate.
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    private final List<Intersection> intersections;

    public Solution(City city) {
        this.intersections = city.getIntersections().stream().toList();
    }

    public void makeSomething() {
        int totalLength = 0;
        List<Intersection> visitedIntersections = new ArrayList<>();
        // adaug prima intersectie ca fiind vizitata, pentru ca de la ea pornesc.
        // prima intersectie este random, pentru ca am plecat de la un Set transformat in List
        visitedIntersections.add(intersections.get(0));
        // We have to do this until all Intersections are visited.
        while (visitedIntersections.size() != intersections.size()) {
            // neighbors for all visited/marked Intersections
            Set<Intersection> neighborsForIteration = new HashSet<>();
            // generating all neighbors for all corresponding visited Intersections
            for (Intersection intersection : visitedIntersections) {
                Set<Intersection> temp = getNeighborsForIntersection(intersection);
                // adding the neighbors which are not in visitedIntersections
                for (Intersection tempIntersection : temp) {
                    int checker = 1;
                    for (Intersection visitedNode : visitedIntersections) {
                        if (tempIntersection.equals(visitedNode)) {
                            checker = 0;
                            break;
                        }
                    }
                    if (checker == 1) {
                        neighborsForIteration.add(tempIntersection);
                    }
                }
            }

            // computing the minimum distance between VisitedIntersections and Neighbors
            int minLength = Integer.MAX_VALUE;
            Intersection nextIntersectionToAdd = null;
            for (Intersection intersection : visitedIntersections) {
                int distance = getMinimumDistanceBetweenIntersections(intersection, neighborsForIteration);
                if (distance < minLength) {
                    minLength = distance;
                    nextIntersectionToAdd = getClosestIntersection(intersection, neighborsForIteration);
                }
            }

            visitedIntersections.add(nextIntersectionToAdd);
            totalLength += minLength;
        }

        // returnez solutia
        System.out.println(totalLength);
        for (Intersection intersectionasdasd : visitedIntersections) {
            System.out.print(intersectionasdasd.getName() + " ");
        }
    }

    /**
     * for a given intersection, return all neighbors (connected with a common street)
     * @param intersection an intersection
     * @return a Set of intersections containing the neighbors for a given Intersection
     */
    public Set<Intersection> getNeighborsForIntersection(Intersection intersection) {
        Set<Intersection> neighbors = new HashSet<>();
        Set<Street> streets = intersection.getStreets();
        for (Street street : streets) {
            String intersectionOne = street.getIntersectionOne();
            String intersectionTwo = street.getIntersectionTwo();
            for (Intersection neighborIntersection : intersections) {
                if (neighborIntersection.getName().equals(intersectionOne)) {
                    neighbors.add(neighborIntersection);
                } else if (neighborIntersection.getName().equals(intersectionTwo)) {
                    neighbors.add(neighborIntersection);
                }
            }
        }

        return neighbors;
    }

    /**
     * this methods gets two intersections and returns the distance between them based on an existing street
     * if no street is available, Integer.MAX_VALUE will be returned.
     * @param A an intersection
     * @param B an intersection
     * @return the length between them, based on existing street
     */
    public int getDistanceBetweenTwoIntersections(Intersection A, Intersection B) {
        Set<Street> streetsA = A.getStreets();
        for (Street street : streetsA) {
            if (street.getIntersectionTwo().equals(B.getName()) && street.getIntersectionOne().equals(A.getName())) {
                return street.getLength();
            }
            if (street.getIntersectionOne().equals(B.getName()) && street.getIntersectionTwo().equals(A.getName())) {
                return street.getLength();
            }
        }
        return Integer.MAX_VALUE;
    }

    /**
     * this method returns the minimum distance between an intersections and all neighbors.
     * @param base the intersection as a starting point
     * @param neighbors a Set of neighbors
     * @return minimum distance, but minimum distance only, not along with the corresponding neighbor.
     */
    public int getMinimumDistanceBetweenIntersections(Intersection base, Set<Intersection> neighbors) {
        int minDistance = Integer.MAX_VALUE;
        for (Intersection intersection : neighbors) {
            if (getDistanceBetweenTwoIntersections(base, intersection) < minDistance) {
                minDistance = getDistanceBetweenTwoIntersections(base, intersection);
            }
        }
        return minDistance;
    }

    /**
     * this method return the nearest neighbor for a specific Intersection
     * @param base the intersection as a starting point
     * @param neighbors a Set of neighbors for that base
     * @return the nearest neighbor of the given Intersection
     */
    public Intersection getClosestIntersection(Intersection base, Set<Intersection> neighbors) {
        int minDistance = Integer.MAX_VALUE;
        Intersection nodeWithMinimalDistance = null;
        for (Intersection intersection : neighbors) {
            if (getDistanceBetweenTwoIntersections(base, intersection) < minDistance) {
                minDistance = getDistanceBetweenTwoIntersections(base, intersection);
                nodeWithMinimalDistance = intersection;
            }
        }

        return nodeWithMinimalDistance;
    }
}
