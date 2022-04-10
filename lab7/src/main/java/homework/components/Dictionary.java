package homework.components;

import java.util.ArrayList;
import java.util.List;

/**
 * describes the dictionary used as a reference for the game
 */
public class Dictionary {
    private final List<String> words;

    public Dictionary() {
        this.words = new ArrayList<>();
    }

    /**
     * verifies if a word exists in the dictionary
     *
     * @param word string, a word built by a player
     * @return true or false if the word exists in the dictionary
     */
    public boolean isWord(String word) {
        return this.words.contains(word);
    }

    /**
     * adds a word in the dictionary, usually this method is used by Builder to create the dictionary
     *
     * @param word string containing a word for the dictionary
     */
    public void addWord(String word) {
        this.words.add(word);
    }

    @Override
    public String toString() {
        return "Dictionary{" + "words=" + words + '}';
    }
}
