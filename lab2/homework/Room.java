package lab2.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * this class builds how an Room should look like, based on specific attributes
 */
abstract class Room {
    protected String name;
    protected int capacity;
    protected List<ArrayList<Integer>> interval = new ArrayList<>();

    // getters and setters for attributes
    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Room)) return false;
        Room room = (Room) o;
        return getCapacity() == room.getCapacity() && getName().equals(room.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCapacity());
    }
}
