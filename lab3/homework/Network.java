package lab3.homework;

import java.util.*;

/**
 * Network class containing nodes.
 * Methods for adding nodes and getting the list of nodes.
 */
public class Network {
    private List<Node> nodes;

    Network() {
        nodes = new ArrayList<>();
    }

    public void addNote(Node node) {
        this.nodes.add(node);
    }

    public List<Node> getNodes() {
        return nodes;
    }

    /**
     * Gets the actual nodes, and if they are instance of Idenfitiable, I change the reference type
     * After changing the reference, for that nodes I make the sorting based on the IPs
     * And casting again to their actual form.
     * <p>
     * This can be made more efficient I think
     */
    public List<Node> generateIdentifiableNodes() {
        List<Identifiable> identifiableNodes = new ArrayList<>();
        for (Node node : nodes) {
            if (node instanceof Identifiable) {
                identifiableNodes.add((Identifiable) node);
            }
        }
        identifiableNodes.sort((a, b) -> {
            return a.getIP().compareTo(b.getIP());
        });

        List<Node> identifiableNodesAsNode = new ArrayList<>();

        for (Identifiable node : identifiableNodes) {
            Node myNode = (Node) node;
            identifiableNodesAsNode.add(myNode);
        }

        return identifiableNodesAsNode;
    }

    /**
     * This method resets the distances calculated for a specific iteration
     * This is needed because the starting Node is changing and new values need to be calculated.
     */
    public void resetDistances() {
        for (Node nodes : nodes) {
            nodes.setDistance(Integer.MAX_VALUE);
        }
    }
}
