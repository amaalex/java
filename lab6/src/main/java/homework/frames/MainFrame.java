package homework.frames;

import homework.panels.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * this class is used as a Main Frame which all panels are initialized from
 */
public class MainFrame extends JFrame {
    DrawingPanel canvas;
    ConfigPanel configPanel;
    ControlPanel controlPanel;

    public MainFrame() {
        super("MyGame");
        init();
    }

    /**
     * initializing and adding panels in frame.
     */
    private void init() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        canvas = new DrawingPanel(this);
        configPanel = new ConfigPanel(this);
        controlPanel = new ControlPanel(this);

        add(canvas, BorderLayout.CENTER);
        add(configPanel, BorderLayout.NORTH);
        add(controlPanel, BorderLayout.SOUTH);
        // add(paintButton, BorderLayout.AFTER_LAST_LINE);

        pack();
    }
}
