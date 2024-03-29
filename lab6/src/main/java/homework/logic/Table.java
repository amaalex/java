package homework.logic;

import java.util.ArrayList;
import java.util.List;

/**
 * This class describes the table
 */
public class Table {
    List<List<Integer>> table;
    int totalMoves = 0;
    ArrayList<Integer> lastMove = new ArrayList<>();

    public Table(Integer rows, Integer columns) {
        this.table = new ArrayList<>();
        ArrayList<Integer> row = new ArrayList<>();
        while (columns > 0) {
            row.add(0);
            columns -= 1;
        }
        while (rows > 0) {
            table.add(row);
            rows -= 1;
        }
    }

    /**
     * adds the corresponding value for the color into the table.
     * with this current implementation, with no validations in place, there is no rule for where a player can place
     * his color.
     *
     * @param player an existing player
     * @param row    defined row for placing the color
     * @param column defined column for placing the color
     */
    void processMove(Player player, int row, int column) {
        this.table.get(row).add(column, player.getColor());
        player.setLastMove(true);

    }
}