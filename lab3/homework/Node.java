package lab3.homework;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Node abstract class, containing the common attributes and actions
 * It contains getters and setters for attributes and toString Override.
 */
public abstract class Node {
    private String name;
    private String macAddress;
    private String location;

    private Integer distance = Integer.MAX_VALUE;

    private Map<Node, Integer> costsMap = new HashMap<Node, Integer>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Map<Node, Integer> getCosts() {
        return costsMap;
    }

    public void setCost(Node destination, int cost) {
        this.costsMap.put(destination, cost);
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                ", macAddress='" + macAddress + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
