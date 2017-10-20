package de.fritzrobin.game;

import java.util.Arrays;

/**
 * @author Robin Fritz
 * @version 1.0
 * 28.08.2017
 */
public class Player implements InitializeArrays {
    private Colour colour;
    private int startingPoint;
    private int endingPoint;
    private Token[] startingFields;
    private Token[] destinationFields;

    public Player(Colour colour, int startingPoint, int endingPoint) {
        this.colour = colour;
        this.startingPoint = startingPoint;
        this.endingPoint = endingPoint;
        this.startingFields = new Token[4];
        fillStartingFields(colour);
        this.destinationFields = new Token[4];
        fillDestinationFields();
    }

    private void fillStartingFields(Colour colour) {
        initializeArray(startingFields, colour);
    }

    private void fillDestinationFields() {
        initializeArray(destinationFields, Colour.EMPTY);
    }

    public Colour getColour() {
        return colour;
    }

    public int getStartingPoint() {
        return startingPoint;
    }

    public int getEndingPoint() {
        return endingPoint;
    }

    public Token[] getStartingFields() {
        return startingFields;
    }

    public Token[] getDestinationFields() {
        return destinationFields;
    }

    @Override
    public void initializeArray(Token[] arrayToFill, Colour colour) {
        Arrays.fill(arrayToFill, new Token(colour));
    }
}
