package homework;

import java.util.HashMap;
import java.util.Map;

/**
 * this class defines how a Street should look like - name, length and the connections with intersections
 */
public class Street implements Comparable<Street> {
    private final String name;
    private final int length;
    Map<String, String> join = new HashMap<>();

    Street(String name, int length, String intersectionOne, String intersectionTwo) {
        this.name = name;
        this.length = length;
        join.put("I1", intersectionOne);
        join.put("I2", intersectionTwo);
    }

    /**
     * used for comparing two objects of type Street by length attribute
     *
     * @param o1 type Street
     * @param o2 type Street
     * @return the difference between o1.length and o2.length
     */
    public static int compareByLength(Street o1, Street o2) {
        return o1.getLength() - o2.getLength();
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    public String getIntersectionOne() {
        return join.get("I1");
    }

    public String getIntersectionTwo() {
        return join.get("I2");
    }

    @Override
    public String toString() {
        return "Street{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", join=" + join +
                '}';
    }

    /**
     * compereTo used for Comparable implementation
     *
     * @param o is an object of type Street which our current object will be compared with
     * @return the difference between lengths, in such way that a sorting algorithm can be applied.
     */
    @Override
    public int compareTo(Street o) {
        return this.length - o.getLength();
    }
}
