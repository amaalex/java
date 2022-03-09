package lab3.compulsory;

/**
 * Node abstract class, containing the common attributes and actions
 * It contains getters and setters for attributes and toString Override.
 */
public abstract class Node {
    private String name;
    private String macAddress;
    private String location;

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

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                ", macAddress='" + macAddress + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
