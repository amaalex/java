package homework;

import homework.components.threads.Player;
import homework.components.threads.gameTimer;
import homework.exceptions.BuildException;

import java.io.FileNotFoundException;
import java.util.List;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import org.apache.log4j.BasicConfigurator;

public class Main {
    /**
     * Main method using for starting the game
     */
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) throws FileNotFoundException, BuildException, InterruptedException {
        BasicConfigurator.configure();
        Game game = new Game();
        game.addPlayer(new Player("Player 1"));
        game.addPlayer(new Player("Player 2"));
        game.addPlayer(new Player("Player 3"));
        new gameTimer(10);
        game.play();

        List<Thread> generatedThreads = game.play();
        for (Thread thread : generatedThreads) {
            thread.join();
        }

        Player winner = game.getWinner();
        logger.info(winner);
    }
}
