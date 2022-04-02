package homework.panels;

import homework.frames.MainFrame;

import javax.swing.*;

/**
 * class used for creating the control buttons
 */
public class ControlPanel extends JPanel {
    final MainFrame frame;
    JButton exitButton = new JButton("Exit");
    JButton loadButton = new JButton("Load");
    JButton saveButton = new JButton("Save");

    public ControlPanel(MainFrame frame) {
        this.frame = frame;
        init();
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
