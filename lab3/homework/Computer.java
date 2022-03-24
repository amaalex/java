package lab3.homework;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

/**
 * Computer class which extends Node, with specific attribures, constructor, getters and setters
 * Computer class implements Identifiable because can be identified by IP.
 */
public class Computer extends Node implements Identifiable, Storage {
    private int storageCapacity;
    private String ip;

    Computer(String name, String macAddress, String location, String ip) {
        setName(name);
        setMacAddress(macAddress);
        setLocation(location);
        this.ip = ip;
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

    @Override
    public String toString() {
        return "Node{" +
                "name='" + this.getName() + '\'' +
                ", macAddress='" + this.getMacAddress() + '\'' +
                ", location='" + this.getLocation() + '\'' +
                ", storageCapacity=" + storageCapacity + '\'' +
                ", ip='" + ip + '\'' +
                '}';
    }
}
