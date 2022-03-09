package lab3.compulsory;

/**
 * Computer class which extends Node, with specific attribures, constructor, getters and setters
 * Computer class implements Identifiable because can be identified by IP.
 */
public class Computer extends Node implements Identifiable, Storage {
    private int storageCapacity;
    private String ip;

    Computer(String name, String macAddress, String location){
        setName(name);
        setMacAddress(macAddress);
        setLocation(location);
    }

    @Override
    public String getIP() {
        return ip;
    }

    @Override
    public void setIP(String ip) {
        this.ip = ip;
    }

    @Override
    public int getStorage() {
        return this.storageCapacity;
    }

    @Override
    public void setStorage(int capacity) {
        this.storageCapacity = capacity;
    }
}
