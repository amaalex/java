package lab2.compulsory;

import java.util.Arrays;
import java.util.List;

public class Main {
    /**
     * creating the objects and displaying the objects
     *
     * @param args array of String - parameters from console
     */
    public static void main(String[] args) {

        // creating the events
        List<Event> events = Arrays.asList(new Event("C1", 100, 8, 8),
                new Event("C2", 100, 10, 12),
                new Event("l1", 30, 8, 10),
                new Event("l2", 30, 8, 10),
                new Event("l3", 30, 10, 12));

        // creating the rooms
        List<Room> rooms = Arrays.asList(new Room("401", 30, Type.lab),
                new Room("403", 30, Type.lab),
                new Room("405", 30, Type.lab),
                new Room("309", 100, Type.lecture_hall));

        // displaying the objects
        System.out.println(events + "\n" + rooms);
    }
}
