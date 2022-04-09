package compulsory.components;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * represents the bag of letters which a player takes from
 */
public class Bag {
    private final List<Tile> tiles;

    public Bag() {
        this.tiles = new ArrayList<>();
    }

    /**
     * this method adds an existing Tile multiple times in a bag (ex: 10 Tiles for Tile Letter A already
     * created by Builder)
     *
     * @param tile          a tile already created by a Builder
     * @param numberOfTimes number of same tiles desired in Bag.
     */
    public void addTileMultipleTimes(Tile tile, int numberOfTimes) {
        while (numberOfTimes > 0) {
            this.tiles.add(tile);
            numberOfTimes -= 1;
        }
    }

    /**
     * this methods extracts a specific number of random tiles from existing Bag
     *
     * @param howMany int value specifying the number of tiles desired for extraction
     * @return a list of random extracted tiles
     */
    public synchronized List<Tile> extractTiles(int howMany) {
        List<Tile> extracted = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < howMany; i++) {
            if (tiles.isEmpty()) {
                break;
            }
            extracted.add(this.tiles.get(random.nextInt(this.tiles.size())));
        }
        return extracted;
    }

    @Override
    public String toString() {
        return "Bag{" + "tiles=" + tiles + '}';
    }
}
