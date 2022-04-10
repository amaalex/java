package homework.components.threads;

import homework.Game;
import homework.components.Tile;

import java.util.List;

/**
 * describes how a Player should look like
 */
public class Player implements Runnable {
    private final String name;
    private Game game;
    private int points = 0;

    public Player(String name) {
        this.name = name;
    }

    /**
     * this method will extract a number of Tiles from Bag and will try to add the word on the table if it is valid
     */
    private void submitWord() {
        while (game.getBag().getBagSize() > 0) {
            List<Tile> extracted = game.getBag().extractTiles(7);
            if (extracted.isEmpty()) {
                break;
            }
            StringBuilder generateWord = new StringBuilder();
            for (Tile tile : extracted) {
                generateWord.append(tile.getLetter());
            }
//            if(this.name.equals("Player 2") && this.points == 0){
//                game.getBoard().getPoints(this, extracted);
//            }
            String word = String.valueOf(generateWord);
            if (game.getDictionary().isWord(word)) {
                game.getBoard().addWord(this, word);
                game.getBoard().getPoints(this, extracted);
            }
        }
    }

    public static int sortByPoints(Player p1, Player p2) {
        return p1.getPoints() - p2.getPoints();
    }

    /**
     * this game sets the reference for the current game
     *
     * @param game the current game
     */
    public void setGame(Game game) {
        this.game = game;
    }

    /**
     * this method uddates the points for a player based on submitted word to the table
     *
     * @param points number of points earned for a single word.
     */
    public void updatePoints(int points) {
        this.points += points;
    }

    public int getPoints() {
        return points;
    }

    /**
     * the method used for Threading
     */
    @Override
    public void run() {
        submitWord();
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                "points='" + points + '\'' +
                '}';
    }
}