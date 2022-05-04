package bonus;

import bonus.dataGenerator.generalGenerator;
import bonus.dataGenerator.graphGenerator;
import org.jgrapht.Graph;

public class Main {
    public static void main(String[] args) {

        new generalGenerator();

        Graph graph = new graphGenerator().generate();
    }
}
