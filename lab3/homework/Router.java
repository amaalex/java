package lab3.homework;

import org.jetbrains.annotations.NotNull;

/**
 * Router class which extends Node, with specific attribures, constructor, getters and setters
 * Router class implements Identifiable because can be identified by IP.
 */
public class Router extends Node implements Identifiable {
    private String ip;

    Router(String name, String macAddress, String location, String ip) {
        setName(name);
        setMacAddress(macAddress);
        setLocation(location);
        this.ip = ip;
    }

    @Override
    public String getIP() {
        return this.ip;
    }

    @Override
    public void setIP(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "Node{" +
                "name='" + this.getName() + '\'' +
                ", macAddress='" + this.getMacAddress() + '\'' +
                ", location='" + this.getLocation() + '\'' +
                ", ip='" + ip + '\'' +
                '}';
    }
}
