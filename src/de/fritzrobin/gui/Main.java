package de.fritzrobin.gui;

import de.fritzrobin.game.Game;

/**
 * @author Robin Fritz
 * @version 1.0
 * 28.08.2017
 */
public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        new GUI(game);
    }


}
