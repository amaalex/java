package lab2.homework;

import java.util.Objects;

public class Lab extends Room {

    String OS;

    Lab(String name, int capacity, String OS) {
        super.name = name;
        super.capacity = capacity;
        this.OS = OS;
    }

    @Override
    public int getCapacity() {
        return super.getCapacity();
    }

    @Override
    public void setCapacity(int capacity) {
        super.setCapacity(capacity);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    @Override
    public String toString() {
        return "Lab{" +
                "OS='" + OS + '\'' +
                ", name='" + name + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
