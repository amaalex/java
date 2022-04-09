package compulsory.builders;

import compulsory.components.Dictionary;
import compulsory.components.Tile;
import compulsory.exceptions.BuildException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * this class builds the data necessary for running the code.
 */
public class Builder{
    /**
     * builds unique tiles, one of each character from A - Z
     *
     * @return a list of Tiles.
     */
    public static List<Tile> buildUniqueTiles() throws BuildException {
        List<Tile> tempTiles = new ArrayList<>();
        Random random = new Random();

        for (char letter = 'A'; letter <= 'Z'; letter++) {
            tempTiles.add(new Tile(letter, random.nextInt(1, 11)));
        }

        return tempTiles;
    }

    /**
     * builds the dictionary which will be used for comparisons in the game
     *
     * @param dictionary an instance of empty dictionary
     */
    public static void buildDictionary(Dictionary dictionary) throws BuildException{
        dictionary.addWord("word");
        dictionary.addWord("apple");
        dictionary.addWord("juice");
        dictionary.addWord("table");
        dictionary.addWord("desk");
        dictionary.addWord("lamp");
        dictionary.addWord("laptop");
        dictionary.addWord("discord");
        dictionary.addWord("programmer");
        dictionary.addWord("java");
        dictionary.addWord("exam");
    }
}
