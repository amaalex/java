package homework.components;

/**
 * shows how a Tile should look like
 */
public class Tile {
    private final char letter;
    private final int points;
    private final int timesToBeAdded;

    public Tile(char letter, int points, int timesToBeAdded) {
        this.letter = letter;
        this.points = points;
        this.timesToBeAdded = timesToBeAdded;
    }

    public int getPoints() {
        return points;
    }

    public char getLetter() {
        return letter;
    }

    public int getTimesToBeAdded() {
        return timesToBeAdded;
    }

    @Override
    public String toString() {
        return "Tile{" + "letter=" + letter + ", points=" + points + '}';
    }
}
