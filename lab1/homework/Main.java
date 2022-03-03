// Alexandru Amarghioalei
package lab1.homework;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Start timer
        Time time = new Time();
        time.startTime();

        //Initial
        Builder builder = new Builder();
        Display display = new Display();

        //Preparing data & Building the alphabet
        List<Object> objects = builder.buildAlphabet(args);
        int n = (int) objects.get(0);
        int p = (int) objects.get(1);
        List<String> alphabet = (ArrayList<String>) objects.get(2);

        //Building words & Display
        List<String> words;
        words = builder.buildWords(n, p, alphabet);
        display.printWords(words);

        //Bulding Adjacency Matrix & Display
        Boolean[][] adjMatrix;
        adjMatrix = builder.buildAdjacencyMatrix(words);
        display.printAdjMatrix(adjMatrix);

        //Building Neighbors and Display
        Map<String, List<String>> dataStructure;
        dataStructure = builder.buildNeighbors(words, adjMatrix);
        display.printNeighbors(dataStructure);

        //End timer
        time.endTime();
        time.showTime();

    }

}
