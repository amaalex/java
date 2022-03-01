package lab2.homework;

import java.util.List;
import java.util.Map;

public class Main {
    /**
     * creating the problem and its objects
     * creating an instance of the problem and generating a solution
     */
    public static void main(String[] args) {

        Problem p1 = new Problem("P1");

        p1.addEvent(new Event("C1", 100, 8, 10));
        p1.addEvent(new Event("C2", 100, 10, 12));
        p1.addEvent(new Event("l1", 30, 8, 10));
        p1.addEvent(new Event("l2", 30, 8, 10));
        p1.addEvent(new Event("l3", 30, 10, 12));
        p1.addEvent(new Event("l3", 30, 10, 12)); // duplicate

        p1.addRoom(new Lab("401", 30, "Windows"));
        p1.addRoom(new Lab("401", 30, "Windows")); // duplicate
        p1.addRoom(new Lab("403", 30, "Ubuntu"));
        p1.addRoom(new Lab("405", 30, "MacOS"));
        p1.addRoom(new LectureHall("309", 100, Boolean.TRUE));
        p1.addRoom(new LectureHall("309", 100, Boolean.TRUE)); // duplicate

        Solution solution = new Solution(p1);
        Map<String, String> result = solution.computeGreedyMethod();

        System.out.println(List.of(result));

    }
}
