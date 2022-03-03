// Alexandru Amarghioalei
package lab1.homework;

import java.util.List;
import java.util.Map;

public class Display {

    /**
     * This function displays a list of words in the terminal.
     *
     * @param words a list of word already created based on a specific alphabet
     */
    public void printWords(List<String> words) {
        //display generated Array
        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println();
        System.out.println();
    }

    /**
     * This function displays the Adjacency Matrix for words in the terminal.
     *
     * @param adjMatrix an Adjacency Matrix for words.
     */
    public void printAdjMatrix(Boolean[][] adjMatrix) {
        // display the matrix
        for (Boolean[] line : adjMatrix) {
            for (Boolean value : line) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * This function displays the neighbors for each word in the terminal.
     *
     * @param dataStructure a map containing the words and their neighbors (K - Word, V - list of neighbors)
     */
    public void printNeighbors(Map<String, List<String>> dataStructure) {
        // display neighbors (javapoint inspiration)
        for (Map.Entry m : dataStructure.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println();
    }

}
