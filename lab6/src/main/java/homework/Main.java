package homework;

import homework.frames.*;
import homework.logic.*;

public class Main {
    public static void main(String[] args) {
        new MainFrame().setVisible(true);

        int rows = 10;
        int columns = 10;

        Player player1 = new Player("Ionica", "Red");
        Player player2 = new Player("Gigel", "Blue");
        Table table = new Table(10, 10);

        player1.makeMove(table, 1, 2);
        player2.makeMove(table, 5, 8);
        player1.makeMove(table, 3, 2);
        player2.makeMove(table, 3, 5);

    }
}
