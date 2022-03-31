package compulsory.panels;

import compulsory.frames.MainFrame;

import javax.swing.*;

/**
 * class used for designing the configuration panel
 */
public class ConfigPanel extends JPanel {
    final MainFrame frame;
    JLabel label;
    JSpinner spinner1;
    JSpinner spinner2;
    JButton button;

    public ConfigPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }

    /**
     * creates and adds the components needed for Configuration.
     */
    private void init() {
        label = new JLabel("Grid size");
        spinner1 = new JSpinner(new SpinnerNumberModel(10, 2, 100, 1));
        spinner2 = new JSpinner(new SpinnerNumberModel(10, 2, 100, 1));
        button = new JButton("Set");
        add(label);
        add(spinner1);
        add(spinner2);
        add(button);
    }
}
