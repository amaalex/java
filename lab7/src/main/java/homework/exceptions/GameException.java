package homework.exceptions;

/**
 * Exception if something happens during the game
 */
public class GameException extends Exception {
    public GameException(String message) {
        super(message);
    }
}
