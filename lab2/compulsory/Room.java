package lab2.compulsory;

/**
 * this class builds how an Room should look like, based on specific attributes
 */
public class Room {
    private String name;
    private Type type;
    private int capacity;

    // constructors
    Room(String name) {
        this.name = name;
    }

    Room(String name, int capacity, Type type) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
    }

    // getters and setters for attributes
    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    //overriding toString method from Object class
    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", capacity=" + capacity +
                '}';
    }
}
