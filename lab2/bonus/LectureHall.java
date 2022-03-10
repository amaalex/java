package lab2.bonus;

/**
 * this class is an extension from Room class, which has specific attributes
 */
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
