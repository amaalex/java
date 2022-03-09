package lab3.compulsory;

/**
 * Router class which extends Node, with specific attribures, constructor, getters and setters
 * Router class implements Identifiable because can be identified by IP.
 */
public class Router extends Node implements Identifiable{
    private String ip;

    Router(String name, String macAddress, String location){
        setName(name);
        setMacAddress(macAddress);
        setLocation(location);
    }

    @Override
    public String getIP() {
        return this.ip;
    }

    @Override
    public void setIP(String ip) {
        this.ip = ip;
    }
}
