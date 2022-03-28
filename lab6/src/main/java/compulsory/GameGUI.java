package compulsory;

import javax.swing.*;
import java.awt.*;

public class GameGUI extends JFrame{
    private JPanel mainPanel;
    private JPanel ConfigurationPanel;
    private JLabel Label;
    private JFormattedTextField formattedTextField1;
    private JButton setButton;
    private JButton loadButton;
    private JButton exitButton;
    private JButton saveButton;

    public GameGUI(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

    }

    public void paint(Graphics g){
        int rows = 5;
        int cols = 7;
        int originX = 23;
        int originY = 37;
        int cellSide = 59;
        Graphics2D graphics2D = (Graphics2D) g;
        for (int i = 0; i < rows; i++){
            g.drawLine(originX, originY + i * cellSide, originX + cols * cellSide, originY + i * cellSide);
        }

        for (int i = 0; i < 1; i++){
            g.drawLine(originX, originY, originX, originY + rows);
        }
    }

    private void createUIComponents() {
        mainPanel = new JPanel();
    }

    public static void main(String[] args) {
        JFrame frame = new GameGUI("Title");
        frame.setVisible(true);
    }
}
