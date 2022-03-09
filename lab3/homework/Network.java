package lab3.homework;

import java.util.ArrayList;
import java.util.List;

/**
 * Network class containing nodes.
 * Methods for adding nodes and getting the list of nodes.
 */
public class Network {
    private List<Node> nodes;

    Network(){
        nodes = new ArrayList<>();
    }

    public void addNote(Node node){
        this.nodes.add(node);
    }

    public List<Node> getNodes() {
        return nodes;
    }

    /**
     * Gets the actual nodes, and if they are instance of Idenfitiable, I change the reference type
     * After changing the reference, for that nodes I make the sorting based on the IPs
     * And casting again to their actual form.
     */
    public void displayIdentifiableNodes(){
        List<Identifiable> identifiableNodes = new ArrayList<>();
        for (Node node : nodes){
            if (node instanceof Identifiable){
                identifiableNodes.add((Identifiable) node);
            }
        }
        identifiableNodes.sort((a,b) -> {
            return a.getIP().compareTo(b.getIP());
        });

        for(Identifiable node : identifiableNodes){
            Node myNode = (Node) node;
            System.out.println(node);
        }
    }
}
