package de.fritzrobin.gui;

import de.fritzrobin.game.Game;

import javax.swing.*;
import java.awt.*;

/**
 * @author Robin Fritz
 * @version 1.0
 * 28.08.2017
 */
public class GUI extends JFrame {

    private final int WIDTH = 1366;
    private final int HEIGHT = 768;
    private Canvas canvas;
    private Game game;

    public GUI(Game game) {
        this.setTitle("Mensch ärgere dich nicht! - WIP");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        this.setBounds(50, 50, WIDTH, HEIGHT);
        this.setMaximumSize(new Dimension(WIDTH, HEIGHT));
        this.setMinimumSize(new Dimension(WIDTH, HEIGHT));
        
        this.pack();
        this.setVisible(true);
    }


}
