package lab2.homework;

import java.util.Objects;

public class LectureHall extends Room {

    Boolean hasVideoProhector;

    LectureHall(String name, int capacity, Boolean hasVideoProhector) {
        super.name = name;
        super.capacity = capacity;
        this.hasVideoProhector = hasVideoProhector;
    }

    @Override
    public String toString() {
        return "LectureHall{" +
                "hasVideoProhector=" + hasVideoProhector +
                ", name='" + name + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
