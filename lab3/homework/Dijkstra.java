package lab3.homework;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Note: M-am inspirat de pe internet pentru clasa asta, insa stiu ce face fiecare linie de cod.
 * Note2: Am avut nevoie si de cateva video-uri dela indieni ca sa-mi aduc aminte Dijkstra
 * <p>
 * This methods implements the Dijkstra algorithm for determining the lowest cost from a Source to all nodes present in
 * a Network.
 */
public class Dijkstra {
    public static Network calculateShortestPathFromSource(Network graph, Node source) {
        source.setDistance(0);

        Set<Node> visitedNodes = new HashSet<>();
        Set<Node> unvisitedNodes = new HashSet<>();

        unvisitedNodes.add(source);

        while (unvisitedNodes.size() != 0) {
            Node currentNode = getLowestDistanceNode(unvisitedNodes);
            unvisitedNodes.remove(currentNode);
            for (Map.Entry<Node, Integer> neighbour :
                    currentNode.getCosts().entrySet()) {
                Node adjacentNode = neighbour.getKey();
                Integer distanceValue = neighbour.getValue();
                if (!visitedNodes.contains(adjacentNode)) {
                    calculateMinimumDistance(adjacentNode, distanceValue, currentNode);
                    unvisitedNodes.add(adjacentNode);
                }
            }
            visitedNodes.add(currentNode);
        }
        return graph;
    }

    /**
     * From a Set of unvisitedNodes, this method takes the node with the lowest distance value and returns it.
     *
     * @param unvisitedNodes a Set containing Nodes
     * @return one Node with lowest distance value
     */
    private static Node getLowestDistanceNode(Set<Node> unvisitedNodes) {
        Node lowestNode = null;
        int lowestDistance = Integer.MAX_VALUE;

        for (Node node : unvisitedNodes) {
            if (node.getDistance() < lowestDistance) {
                lowestDistance = node.getDistance();
                lowestNode = node;
            }
        }
        return lowestNode;
    }

    /**
     * Calculates the minimum distance between the current visited node and his adjacentNode
     *
     * @param adjacentNode  the neighbor of my currentNode
     * @param distanceValue the distance between the currentNode and the adjacentNode
     * @param currentNode   the Node which is visited atm
     */
    private static void calculateMinimumDistance(Node adjacentNode,
                                                 Integer distanceValue, Node currentNode) {
        Integer sourceDistance = currentNode.getDistance();
        if (sourceDistance + distanceValue < adjacentNode.getDistance()) {
            adjacentNode.setDistance(sourceDistance + distanceValue);
        }
    }
}
