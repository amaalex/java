package homework.components;

import homework.Game;

import java.util.List;

/**
 * describes how a Player should look like
 */
public class Player implements Runnable {
    private final String name;
    private Game game;

    public Player(String name) {
        this.name = name;
    }

    /**
     * this method will extract a number of Tiles from Bag and will try to add the word on the table if it is valid
     *
     * @return true or false if the word has been uploaded on the table or not
     */
    private void submitWord() {
        while(game.getBag().getBagSize() > 0) {
            List<Tile> extracted = game.getBag().extractTiles(7);
            if (extracted.isEmpty()) {
                break;
            }
            StringBuilder generateWord = new StringBuilder();
            for (Tile tile : extracted) {
                generateWord.append(tile.getLetter());
            }
            String word = String.valueOf(generateWord);
            System.out.println(this.name + " " + word);
            if (game.getDictionary().isWord(word)) {
                game.getBoard().addWord(this, word);
            }
        }
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
     * the method used for Threading
     */
    @Override
    public void run() {
        submitWord();
    }
}