package lab2.homework;

import java.util.Objects;

/**
 * this class builds how an Event should look like, based on specific attributes
 */
public class Event {
    private String name;
    private int size;
    private int startTime;
    private int endTime;

    // constructors
    Event(String name) {
        this.name = name;
    }

    Event(String name, int size, int startTime, int endTime) {
        this.name = name;
        this.size = size;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    // getters and setters for attributes
    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Event)) return false;
        Event event = (Event) o;
        return getSize() == event.getSize() && getStartTime() == event.getStartTime() && getEndTime() == event.getEndTime() && getName().equals(event.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSize(), getStartTime(), getEndTime());
    }

    //overriding toString method from Object class
    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
