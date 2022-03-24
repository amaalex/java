package lab3.homework;

import java.util.List;

/*
 * Class used for building the requirements for this problem.
 */
public class Builder {
    /**
     * this methds builds Nodes for an empty network.
     *
     * @param network is the new network containing nodes.
     */
    public static void buildNetwork(Network network) {
        network.addNote(new Computer("Computer A", "MAC1", "v1", "192.168.0.1"));
        network.addNote(new Router("Router A", "MAC2", "v2", "192.168.0.3"));
        network.addNote(new Switch("Switch A", "MAC3", "v3"));
        network.addNote(new Switch("Switch B", "MAC4", "v4"));
        network.addNote(new Router("Router B", "MAC5", "v5", "192.168.0.4"));
        network.addNote(new Computer("Computer B", "MAC6", "v6", "192.168.0.2"));
    }

    /**
     * this methods builds connections between nodes from a Network
     *
     * @param nodes the resulting connections
     */
    public static void buildNodesConnections(List<Node> nodes) {
        nodes.get(0).setCost(nodes.get(1), 10);
        nodes.get(0).setCost(nodes.get(2), 50);

        nodes.get(1).setCost(nodes.get(0), 10);
        nodes.get(1).setCost(nodes.get(2), 20);
        nodes.get(1).setCost(nodes.get(3), 20);
        nodes.get(1).setCost(nodes.get(4), 20);

        nodes.get(2).setCost(nodes.get(0), 50);
        nodes.get(2).setCost(nodes.get(1), 20);
        nodes.get(2).setCost(nodes.get(2), 10);

        nodes.get(3).setCost(nodes.get(1), 20);
        nodes.get(3).setCost(nodes.get(2), 10);
        nodes.get(3).setCost(nodes.get(4), 30);
        nodes.get(3).setCost(nodes.get(5), 10);

        nodes.get(4).setCost(nodes.get(1), 20);
        nodes.get(4).setCost(nodes.get(3), 30);
        nodes.get(4).setCost(nodes.get(5), 20);

        nodes.get(5).setCost(nodes.get(3), 10);
        nodes.get(5).setCost(nodes.get(4), 20);
    }
}
