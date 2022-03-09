package lab3.homework;

import lab3.compulsory.Identifiable;
import lab3.compulsory.Storage;

import java.util.Arrays;
import java.util.List;

/**
 * Within Main class I create a Network and nodes for it.
 */
public class Main {
    public static void main(String[] args) {
        Network network = new Network();
        network.addNote(new Computer("Computer A", "MAC1", "v1"));
        network.addNote(new Router("Router A", "MAC2", "v2"));
        network.addNote(new Switch("Switch A", "MAC3", "v3"));
        network.addNote(new Switch("Switch B", "MAC4", "v4"));
        network.addNote(new Router("Router B", "MAC5", "v5"));
        network.addNote(new Computer("Computer B", "MAC6", "v6"));

        for(Node node : network.getNodes()){
            System.out.println(node);
        }

        List<Node> nodes = network.getNodes();
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

        System.out.println(nodes.get(0).getCosts().values());
    }
}
