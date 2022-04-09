package homework.components;

import java.util.HashMap;
import java.util.Map;

/**
 * describes how a Board Game should look like
 */
public class Board {

    Map<Player, String> words = new HashMap<>();
    Map<Player, Integer> totalPoints = new HashMap<>();

    /**
     * adds a word on the table
     *
     * @param player a player which exists in the game
     * @param word   word built during the game
     */
    public void addWord(Player player, String word) {
        this.words.put(player, word);
    }

    public void calculatePoints(){
        words.entrySet().stream().forEach(input -> System.out.println(input.getKey() + input.getValue()));
    }
}
