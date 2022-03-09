package lab3.compulsory;

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

    }
}
