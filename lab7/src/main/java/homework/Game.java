package homework;

import homework.builders.Builder;
import homework.components.*;
import homework.components.threads.Player;
import homework.exceptions.BuildException;

import java.io.FileNotFoundException;
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

    Game() throws FileNotFoundException, BuildException {
        this.players = new ArrayList<>();
        this.board = new Board();

        this.dictionary = new Dictionary();
        try {
            Builder.buildDictionary(dictionary);
        } catch (BuildException e) {
            System.out.println(e);
        }
        this.bag = new Bag();
        List<Tile> uniqueTiles = Builder.buildUniqueTiles();
        for (Tile tile : uniqueTiles) {
            bag.addTileMultipleTimes(tile, tile.getTimesToBeAdded());
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
    public List<Thread> play() throws InterruptedException {
        List<Thread> threadList = new ArrayList<>();
        for (Player player : players) {
            Thread a1 = new Thread(player);
            a1.start();
            threadList.add(a1);
        }
        return threadList;
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
     * this method will create a sorted list of players based on their scores / points
     *
     * @return the player with the biggest score.
     */
    public Player getWinner() {
        List<Player> players = this.players.stream().sorted(Player::sortByPoints).toList();
        return players.get(players.size() - 1);
    }
}
