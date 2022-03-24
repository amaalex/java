package lab3.homework;

import java.util.List;

/**
 * Building the network, the edges + cost, generating the Identifiables Nodes and the shortest cost between them.
 */
public class Main {
    public static void main(String[] args) {

        Network network = new Network();
        Builder.buildNetwork(network);
        Display.displayNodes(network.getNodes());

        List<Node> nodes = network.getNodes();
        Builder.buildNodesConnections(nodes);
        Display.displayNodesWithCosts(nodes);

        List<Node> identifiableNodes = network.generateIdentifiableNodes();
        Display.displayIdentifiableNodes(identifiableNodes);

        for (Node identifiableNode : identifiableNodes) {
            Network networkWithDistances = Dijkstra.calculateShortestPathFromSource(network, identifiableNode);
            Display.displayDistanceIdentifiableToIdentifiable(networkWithDistances);
            network.resetDistances();
        }
    }
}
