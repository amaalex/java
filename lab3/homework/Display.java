package lab3.homework;

import java.util.List;

/**
 * This class is used to display at the terminal the output of the problem
 */
public class Display {

    /**
     * this methods displays Nodes from a specific Network.
     *
     * @param nodes - nodes from a specific network
     */
    public static void displayNodes(List<Node> nodes) {
        System.out.println("Nodes from network: ");
        for (Node node : nodes) {
            System.out.println(node);
        }
        System.out.println();
    }

    /**
     * this methods displays Nodes from a specific Network.
     *
     * @param nodes - nodes from a specific network
     */
    public static void displayNodesWithCosts(List<Node> nodes) {
        System.out.println("Nodes from network with neighbors and costs: \n");
        for (Node node : nodes) {
            System.out.println(node);
            System.out.println(node.getCosts());
            System.out.println();
        }
        System.out.println();
    }

    /**
     * this methods displays only Identifiable Nodes from a specific Network.
     *
     * @param identifiableNodes Nodes that implements Indetifiable Interface
     */
    public static void displayIdentifiableNodes(List<Node> identifiableNodes) {
        System.out.println("Identifiable nodes from network: ");
        for (Node node : identifiableNodes) {
            System.out.println(node);
        }
        System.out.println();
    }

    /**
     * this methods displays the distance between the Identifiable Nodes from a Network.
     *
     * @param network is a network already made, containing Nodes.
     */
    public static void displayDistanceIdentifiableToIdentifiable(Network network) {
        for (Node node : network.getNodes()) {
            if (node instanceof Identifiable) {
                System.out.print(node.getDistance() + " ");
            }
        }
        System.out.println();
    }

}
