package homework.panels;

import homework.frames.MainFrame;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * class used for creating the control buttons
 */
public class ControlPanel extends JPanel implements ActionListener {
    final MainFrame frame;
    JButton exitButton = new JButton("Exit");
    JButton loadButton = new JButton("Load");
    JButton saveButton = new JButton("Save");

    public ControlPanel(MainFrame frame) {
        this.frame = frame;
        saveButton.addActionListener(this);
        init();
    }

    /**
     * wais for saveButton to be pressed in order to make a screenshot of the game and to save it on the disk
     *
     * @param e event based on the actionListener from the constructor
     */
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == saveButton) {
            BufferedImage image = new BufferedImage(frame.getWidth(), frame.getHeight(), BufferedImage.TYPE_INT_RGB);
            Graphics2D g = image.createGraphics();
            frame.printAll(g);
            g.dispose();
            try {
                ImageIO.write(image, "png", new File("C:\\Users\\alexa\\Desktop\\game.png"));
            } catch (IOException exp) {
                exp.printStackTrace();
            }
        }
    }

    /**
     * adds the existing buttons within the panel
     */
    private void init() {
        // setLayout(new GridLayout(1,4));
        add(loadButton, CENTER_ALIGNMENT);
        add(saveButton, CENTER_ALIGNMENT);
        add(exitButton, CENTER_ALIGNMENT);
    }
}
