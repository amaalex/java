package lab1.bonus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Builder {

    /**
     * This function simulates a list of Wods
     * @return a list of words.
     */
    List<String> wordsBuilder(){
        List<String> words = new ArrayList<>(){
            {
                add("TCCCGGG");
                add("GCACTAG");
                add("TGCTATA");
                add("CATGGGC");
                add("GCGACGC");
                add("TAGAAAT");
                add("CTTACTA");
                add("TCAGCCA");
                add("ACTACTC");
                add("AAAACAT");
                add("CTACCGT");
                add("GGCGAGC");
                add("GGTGATG");
                add("GTGCATG");
                add("ACATGTG");
                add("CCGTTGA");
                add("GCCCGTA");
                add("CACCAAA");
                add("AAAAGCC");
                add("GAGAACC");
            }
        };

        return words;
    }

    /**
     *
     * @param words is a list of words already built
     * @return a map containing the number of occurrences of each letter (but not duplicates)
     */
    Map<Character,Integer> wordStatisticsBuilder(List<String> words){
        Map<Character,Integer> myMap = new HashMap<>();
        for(String word : words){
            List<String> tempList = new ArrayList<>();
            for(int index = 0; index < word.length(); index++){
                boolean result = true;
                for(String string : tempList){
                    if(string.equals(word.substring(index,index+1))){
                        result = false;
                    }
                }
                if(result == true) {
                    if (myMap.get(word.charAt(index)) == null) {
                        myMap.put(word.charAt(index), 1);
                    } else {
                        myMap.put(word.charAt(index), myMap.get(word.charAt(index)) + 1);
                    }
                    tempList.add(word.substring(index, index + 1));
                }
            }
        }
        return myMap;
    }

    /**
     *
     * @param words a list of words already built
     * @param character the predominant letter from all words (maximum number of occurrences)
     * @return SubWords (3 letters) starting from Words already provided.
     */
    List<String> subWordsBuilder(List<String> words, Character character){
        List<String> subWords = new ArrayList<>();

        // pentru fiecare cuvant, verific daca contine caracterul predominant, si daca da, incerc sa formez cuvant
        // din 3 litere, astfel incat sa nu ies din array-ul cuvantului de baza.
        // Daca nu se poate, nu fac cuvant si merg mai departe (cu siguranta exista variante mai bune)
        for(String word : words){
            if(word.lastIndexOf(character.toString()) > 0 ){
                try{
                    if((word.lastIndexOf(character.toString())) + 4 < word.length()) {
                        subWords.add(word.substring(word.lastIndexOf(character.toString()), word.lastIndexOf(character.toString()) + 3));
                    }
                    else{
                        subWords.add(word.substring(word.lastIndexOf(character.toString())-2, word.lastIndexOf(character.toString())+1));
                    }
                }catch (Exception e){
                    continue;
                }
            }
        }

        return subWords;
    }
}
