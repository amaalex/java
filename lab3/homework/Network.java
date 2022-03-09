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
}
