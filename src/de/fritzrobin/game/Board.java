package de.fritzrobin.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Robin Fritz
 * @version 1.0
 * 28.08.2017
 */
public class Board implements InitializeArrays {

    private Token[] board;

    public Board() {
        board = new Token[40];
        initializeBoard();
    }

    private void initializeBoard() {
        initializeArray(board, Colour.EMPTY);
    }

    public void calculateMoves(int currentRoll, Player currentPlayer) {
        ArrayList<Integer> boardPositions = new ArrayList<>();
        ArrayList<String> calculatedPositions = new ArrayList<>();

        for (int boardPosition = 0; boardPosition < board.length; boardPosition++) {
            if (board[boardPosition].getColour().equals(currentPlayer.getColour())) {
                boardPositions.add(boardPosition);
                calculatedPositions.add(boardPosition + "->" + ((boardPosition + currentRoll) - currentPlayer.getStartingPoint()));
            }
        }


    }

    public void moveToken(int tokenPosition, int currentRoll, Player currentPlayer) {

        int newPosition = ((tokenPosition + currentRoll));

        //das in calculateMoves
        if (tokenPosition <= currentPlayer.getEndingPoint() & newPosition >= currentPlayer.getStartingPoint()) {

        }


        board[tokenPosition].resetColour();
        board[newPosition].setNewColour(currentPlayer.getColour());
    }

    public void x() {

    }

    @Override
    public void initializeArray(Token[] arrayToFill, Colour colour) {
        Arrays.fill(arrayToFill, new Token(colour));
    }
}
