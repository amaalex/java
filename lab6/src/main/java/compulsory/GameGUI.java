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
        Graphics2D graphics2D = (Graphics2D) g;
        graphics2D.setColor(Color.BLUE);
        graphics2D.fillRect(100,50,60,80);
    }

    private void createUIComponents() {
        mainPanel = new JPanel();
    }

    public static void main(String[] args) {
        JFrame frame = new GameGUI("Title");
        frame.setVisible(true);
    }
}
