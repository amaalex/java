package compulsory;

import compulsory.builders.Builder;
import compulsory.components.*;
import compulsory.exceptions.BuildException;
import compulsory.exceptions.GameException;

import java.util.ArrayList;
import java.util.List;

/**
 * this class describes the game
 */
public class Game {
    private final Bag bag;
    private final Board board;
    private final Dictionary dictionary;
    private final List<Player> players;

    Game() {
        this.players = new ArrayList<>();
        this.board = new Board();

        this.dictionary = new Dictionary();
        try {
            Builder.buildDictionary(dictionary);
        } catch (BuildException e) {
            System.out.println(e);
        }
        this.bag = new Bag();
        try {
            Builder.buildUniqueTiles().forEach(tile -> bag.addTileMultipleTimes(tile, 10));
        } catch (BuildException e) {
            System.out.println(e);
        }
    }

    /**
     * adds a player to the game
     *
     * @param player an existing player
     */
    public void addPlayer(Player player) {
        this.players.add(player);
        player.setGame(this);
    }

    /**
     * starts the game for Players using Threads
     */
    public void play() {
        for (Player player : players) {
            new Thread(player).start();
        }
    }

    public Bag getBag() {
        return bag;
    }

    public Board getBoard() {
        return board;
    }

    public Dictionary getDictionary() {
        return dictionary;
    }

    /**
     * Main method using for initialization
     */
    public static void main(String[] args) throws GameException {
        Game game = new Game();
        game.addPlayer(new Player("Player 1"));
        game.addPlayer(new Player("Player 2"));
        game.addPlayer(new Player("Player 3"));
        game.play();
    }
}
