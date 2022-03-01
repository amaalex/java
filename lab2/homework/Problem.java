package lab2.homework;

import java.util.ArrayList;
import java.util.List;

/**
 * this class describes a problem (name, a list of rooms and a list of events)
 */
public class Problem {
    private final String name;
    private final List<Event> events = new ArrayList<>();
    private final List<Room> rooms = new ArrayList<>();

    Problem(String name) {
        this.name = name;
    }

    // getters and setters for attributes
    public String getName() {
        return name;
    }

    public List<Event> getEvents() {
        return events;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    /**
     * this function will add a new Event if is not already in the events list.
     *
     * @param newEvent new created event for this problem.
     * @return 0 if the element is already in the events list, 1 if the event has been added in the list.
     */
    public int addEvent(Event newEvent) {
        for (Event event : events) {
            if (event.equals(newEvent)) {
                return 0;
            }
        }
        events.add(newEvent);
        return 1;
    }

    /**
     * this function will add a new Room in the rooms list if is not already there
     *
     * @param newRoom new created room for this problem
     * @return 0 if the element is already in the rooms list, 1 if the room has beed added in the list.
     */
    public int addRoom(Room newRoom) {
        for (Room room : rooms) {
            if (room.equals(newRoom)) {
                return 0;
            }
        }
        rooms.add(newRoom);
        return 1;
    }
}
