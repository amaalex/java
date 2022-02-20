package lab1.bonus;

import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Display display = new Display();
        Builder builder = new Builder();

        List<String > words = builder.wordsBuilder();

        //Display Words
        display.printWords(words);

        // determin care caracter este cel mai comun dintre toate cuvintele (cel mai mare numar de aparitii)
        Map<Character,Integer> wordsStatistics = builder.wordStatisticsBuilder(words);

        // imi memorez caracterul predominant si numarul de apartii (aproximez ca asta va fi numarul maxim de
        // subcuvinte pe care le pot forma ca sa fie vecini)
        int maxValue = 0;
        Character character = null;
        for(Map.Entry m : wordsStatistics.entrySet()){
            if(maxValue < (int) m.getValue()){
                maxValue = (int) m.getValue();
                character = (Character) m.getKey();
            }
        }

        // display maxim values
        display.printValues(maxValue, character);

        // fac o lista pentru cuvintele mele
        List<String> subWords = builder.subWordsBuilder(words, character);

        // display subWords
        display.displaySubWords(subWords);

    }
}
