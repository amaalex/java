package homework.builders;

import com.thedeanda.lorem.Lorem;
import com.thedeanda.lorem.LoremIpsum;
import homework.components.Dictionary;
import homework.components.Tile;
import homework.exceptions.BuildException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * this class builds the data necessary for running the code.
 */
public class Builder{
    /**
     * builds unique tiles, one of each character from A - Z
     *
     * @return a list of Tiles.
     */
    public static List<Tile> buildUniqueTiles() throws BuildException, FileNotFoundException {
        List<Tile> tempTiles = new ArrayList<>();

        File file = new File("/Users/alexandruamarghioalei/IdeaProjects/java/lab7/src/main/java/homework/files/tiles.txt");
        Scanner input = new Scanner(file);
        List<String> list = new ArrayList<>();

        while(input.hasNextLine()){
            list.add(input.nextLine());
        }

        for(int index = 0; index < list.size(); index+=3){
            tempTiles.add(new Tile(list.get(index).charAt(0), Integer.parseInt(list.get(index+1)),
                    Integer.parseInt(list.get(index+2))));
        }

        return tempTiles;
    }

    /**
     * builds the dictionary which will be used for comparisons in the game
     *
     * @param dictionary an instance of empty dictionary
     */
    public static void buildDictionary(Dictionary dictionary) throws BuildException {
        Lorem lorem = LoremIpsum.getInstance();
        dictionary.addWord(lorem.getWords(100000));
    }
}
