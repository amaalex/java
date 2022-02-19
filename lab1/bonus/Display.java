package lab1.bonus;

import java.util.List;

public class Display {

    public void printWords(List<String> words){
        //display generated Array
        for (String value : words){
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println();
    }

    public void displaySubWords(List<String> subWords){
        // afisez substring-urile formate
        for(String word : subWords){
            System.out.print(word + " ");
        }
        System.out.print("("+subWords.size()+")");
    }

    public void printValues(int maxValue, Character character){
        System.out.println("K maxim: " + maxValue + ", caracter predominant: "+character);
    }

}
