package org.lab6.compulsory;

import javax.swing.*;
import java.awt.*;

import static javax.swing.SwingConstants.CENTER;

public class MainFrame extends JFrame {
    ConfigPanel configPanel;
    ControlPanel controlPanel;
    DrawingPanel canvas;
    public MainFrame() {
        super("My Drawing Application");
        init();
    }
    private void init() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
//create the components
        canvas = new DrawingPanel(this);
//arrange the components in the container (frame)
//JFrame uses a BorderLayout by default
        add(canvas, CENTER); //this is BorderLayout.CENTER

//invoke the layout manager
        pack();
    }
}
