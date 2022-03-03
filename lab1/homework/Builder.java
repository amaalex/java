//Alexandru Amarghioalei
package lab1.homework;

import java.util.*;

public class Builder {


    /**
     * This function gets the information from the command line and prepares the necessary values for the app (ex:
     * n,p variables and the alphabet needed)
     *
     * @param args is an array with the values from command line
     * @return a list containing mapped values based on a specific order (n,p, and alphabet)
     */
    List<Object> buildAlphabet(String[] args) {
        int n = 0, p = 0;
        List<String> alphabet = new ArrayList<>();
        try {
            n = Integer.parseInt(args[0]);
            p = Integer.parseInt(args[1]);
            for (int length = 2; length < args.length; length++) {
                alphabet.add(args[length]);
            }
        } catch (Exception e) {
            System.out.println("Something went wrong during assignation");
        }

        List<Object> objects = new ArrayList<>();
        objects.add(n);
        objects.add(p);
        objects.add(alphabet);

        return objects;
    }

    /**
     * @param n        is the number of strings (words) which must be created
     * @param p        is the number of letters which every word must contain
     * @param alphabet is the given alphabet (from the command line)
     * @return a list of n words, each one containing p letters based on the alphabet
     */
    List<String> buildWords(int n, int p, List<String> alphabet) {
        Random random = new Random();
        List<String> words = new ArrayList<>();
        int tempN = n;
        while (tempN > 0) {
            String word = ""; // De ce faca am String word = null imi face append la null+letter? Ex word: nullABCDE
            // pot sa fac si cu StringBuilder pentru ca s-a spus azi pe Discord ca e mai rapid

            int tempP = p;
            while (tempP > 0) {
                int tempPosition = random.nextInt(alphabet.size());
                word += alphabet.get(tempPosition);

                tempP--;
            }

            words.add(word);

            tempN--;
        }

        return words;
    }

    /**
     * @param words a list of words already created
     * @return an Adjacency Matrix reflecting the neighbors for a word (2 words ar neighbors if they have at least 1
     * letter in common)
     */
    Boolean[][] buildAdjacencyMatrix(List<String> words) {
        Boolean[][] adjMatrix = new Boolean[words.size()][words.size()];
        for (Boolean[] row : adjMatrix)
            Arrays.fill(row, false);

        Checker checker = new Checker();
//        // daca "vecini" inseamna oricare doua cuvinte indiferent unde sunt asezate in vector
//        // atunci compar fiecare cu fiecare
//        for (String word : words) {
//            for (String secondWord : words) {
//                if (!word.equals(secondWord) && checker.commonLettersExist(word, secondWord)) {
//                    adjMatrix[words.lastIndexOf(word)][words.lastIndexOf(secondWord)] = true;
//                }
//            }
//        }
        // daca vecini inseamna doar +1 si -1 ca pozitie, atunci clasific in modul urmator vecinii
        for (int poz = 0; poz < words.size() - 1; poz++) {
            String currentWord = words.get(poz);
            String nextWord = words.get(poz + 1);
            if (checker.commonLettersExist(currentWord, nextWord)) {
                adjMatrix[poz][poz + 1] = true;
                adjMatrix[poz + 1][poz] = true;
            }
        }

        return adjMatrix;
    }

    /**
     * @param words     A list of words already created based on an alphabet
     * @param adjMatrix Adjacency Matrix reflecting if a specific word has a neighbor
     * @return a Map containing the neighbors for a specific word (word - Key, neighbors - list of String)
     */
    Map<String, List<String>> buildNeighbors(List<String> words, Boolean[][] adjMatrix) {
        // neighbors for each word
        Map<String, List<String>> dataStructure = new HashMap<>();

        for (int index = 0; index < words.size(); index++) {
            String word = words.get(index);
            List<String> neighbors = new ArrayList<>();
            for (int tmp = 0; tmp < adjMatrix.length; tmp++) {
                if (adjMatrix[index][tmp] == true) {
                    neighbors.add(words.get(tmp));
                }
            }

            dataStructure.put(word, neighbors);
        }

        return dataStructure;

    }
}
