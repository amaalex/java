package homework.logic;

import java.util.Objects;

public class Player {
    private String name;
    private Integer color;
    Boolean lastMove = false;

    public Player(String name, String color){
        this.name = name;
        if(color.equals("Red")){
            this.color = 1;
        }
        else if (color.equals("Blue")){
            this.color = 2;
        }
        else{
            this.color = 0;
        }
    }

    public void setLastMove(Boolean lastMove) {
        this.lastMove = lastMove;
    }

    public Boolean getLastMove() {
        return lastMove;
    }

    public Integer getColor() {
        return color;
    }


    public void makeMove(Table table, int row, int column){
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
