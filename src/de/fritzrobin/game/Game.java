package de.fritzrobin.game;

/**
 * @author Robin Fritz
 * @version 1.0
 * 19.10.2017
 */
public class Game {

    private int currentRoll = 0;
    private Player red;
    private Player blue;
    private Player green;
    private Player yellow;
    private Player currentPlayer;
    private Board board;
    private Player[] players;

    public Game() {
        initializeBoard();
        generatePlayers();
    }

    private void initializeBoard() {
        board = new Board();
    }

    public void generatePlayers() {
        players = new Player[4];
        players[0] = red = new Player(Colour.RED, 0, 39);
        players[1] = blue = new Player(Colour.BLUE, 10, 9);
        players[2] = green = new Player(Colour.GREEN, 20, 19);
        players[3] = yellow = new Player(Colour.YELLOW, 30, 29);
        currentPlayer = red;
    }

    public void nextPlayer() {
        for (int i = 0; i < players.length; i++) {
            if (currentPlayer.equals(players[i])) {
                currentPlayer = players[(i + 1) % players.length];
            }
        }
    }

    public void roll() {
        currentRoll = (int) (Math.random() * 6) + 1;
    }

}
