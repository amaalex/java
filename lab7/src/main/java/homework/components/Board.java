package homework.components;

import homework.components.threads.Player;

import java.util.HashMap;
import java.util.List;
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

    public void getPoints(Player player, List<Tile> tiles) {
        int totalWordPoints = 0;
        for (Tile tile : tiles) {
            totalWordPoints += tile.getPoints();
        }
        player.updatePoints(totalWordPoints);
    }

}
