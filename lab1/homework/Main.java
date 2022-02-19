package lab1.homework;

import java.util.*;

public class Main {

    static boolean check(String s1, String s2){
        Map<Character,Integer> map = new HashMap<>();

        for(int i = 0; i < s1.length(); i++){
            map.put(s1.charAt(i), 1);
        }

        for(int i = 0; i < s2.length(); i++){
            if (map.get(s2.charAt(i)) == null){
                System.out.print("");
            }
            else if (map.get(s2.charAt(i)) > 0){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        // declaration
        int n = 0, p = 0;
        List<String> alphabet = new ArrayList<>();

        // value assignation
        try{
            n = Integer.parseInt(args[0]);
            p = Integer.parseInt(args[1]);
            for(int length = 2; length < args.length; length++){
                alphabet.add(args[length]);
            }
        }catch (Exception e){
            System.out.println("Something went wrong during assignation");
        }

        // building words
        Random random = new Random();
        List<String> words = new ArrayList<>();
        int tempN = n;
        while(tempN > 0){
            String word = ""; // De ce faca am String word = null imi face append la null+letter? Ex word: nullABCDE

            int tempP = p;
            while(tempP > 0){
                int tempPosition = random.nextInt(alphabet.size());
                word += alphabet.get(tempPosition);

                tempP--;
            }

            words.add(word);

            tempN--;
        }

        //display generated Array
        for (String value : words){
            System.out.print(value + ", ");
        }
        System.out.println();

        //create the alrogithm for creating the matrix, checking common letters from 2 words.

        // adjacency matrix
        Boolean[][] adjMatrix = new Boolean[n][n];
        for (Boolean[] row: adjMatrix)
            Arrays.fill(row, false);

        // daca "vecini" inseamna oricare doua cuvinte indiferent unde sunt asezate in vector
        // atunci compar fiecare cu fiecare
        for (String word : words){
            for (String secondWord : words){
                if (!word.equals(secondWord) && check(word, secondWord)){
                    adjMatrix[words.lastIndexOf(word)][words.lastIndexOf(secondWord)] = true;
                }
            }
        }

        // daca vecini inseamna doar +1 si -1 ca pozitie, atunci clasific in modul urmator vecinii
//        for(int poz = 0; poz < words.size()-1; poz ++){
//            String currentWord = words.get(poz);
//            String nextWord = words.get(poz+1);
//            if (check(currentWord,nextWord)){
//                adjMatrix[poz][poz+1] = true;
//                adjMatrix[poz+1][poz] = true;
//            }
//        }

        // display the matrix
        for (Boolean[] line : adjMatrix){
            for (Boolean value : line){
                System.out.print(value + " ");
            }
            System.out.println();
        }

        // neighbors for each word
        Map<String,List<String>> dataStructure = new HashMap<>();

        for (int index = 0; index < words.size(); index++){
            String word = words.get(index);
            List<String> neighbors = new ArrayList<>();
            for(int tmp = 0; tmp < adjMatrix.length; tmp++){
                if(adjMatrix[index][tmp] == true){
                    neighbors.add(words.get(tmp));
                }
            }

            dataStructure.put(word, neighbors);
        }

        // display neighbors (javapoint inspiration)
        System.out.println("Iterating Hashmap...");
        for(Map.Entry m : dataStructure.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
