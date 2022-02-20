package lab1.bonus;

import java.util.List;

public class Display {

    /**
     * Prints in the terminal a list of words
     * @param words list of words already made
     */
    public void printWords(List<String> words){
        //display generated Array
        for (String value : words){
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println();
    }

    /**
     * Prints in the terminal a list of subwords
     * @param subWords
     */
    public void displaySubWords(List<String> subWords){
        // afisez substring-urile formate
        for(String word : subWords){
            System.out.print(word + " ");
        }
        System.out.print("("+subWords.size()+")");
    }

    /**
     * This function prints in the terminal maxim values.
     * @param maxValue a value already provided
     * @param character the predominant character
     */
    public void printValues(int maxValue, Character character){
        System.out.println("K maxim: " + maxValue + ", caracter predominant: "+character);
    }

}
