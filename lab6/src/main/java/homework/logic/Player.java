package homework.logic;

import java.util.Objects;

/**
 * This class describes a Player
 */
public class Player {
    Boolean lastMove = false;
    private String name;
    private Integer color;

    public Player(String name, String color) {
        this.name = name;
        if (color.equals("Red")) {
            this.color = 1;
        } else if (color.equals("Blue")) {
            this.color = 2;
        } else {
            this.color = 0;
        }
    }

    public Boolean getLastMove() {
        return lastMove;
    }

    /**
     * marks that the player is making the last move (necessary for determing the winner)
     *
     * @param lastMove boolean value
     */
    public void setLastMove(Boolean lastMove) {
        this.lastMove = lastMove;
    }

    public Integer getColor() {
        return color;
    }

    /**
     * calls the processMove of the table which has default access restriction
     *
     * @param table  a table
     * @param row    row on which the player has placed his color
     * @param column column on which the player has placed his color
     */
    public void makeMove(Table table, int row, int column) {
        table.processMove(this, row, column);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;
        Player player = (Player) o;
        return name.equals(player.name) && color.equals(player.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color);
    }
}
