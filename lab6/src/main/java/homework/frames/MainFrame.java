package homework.frames;

import homework.panels.*;

import javax.swing.*;
import java.awt.*;

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

        pack();
    }
}
