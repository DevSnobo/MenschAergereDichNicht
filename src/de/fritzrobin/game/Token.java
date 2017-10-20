package de.fritzrobin.game;

/**
 * @author Robin Fritz
 * @version 1.0
 * 28.08.2017
 */
public class Token {

    private Colour colour;
    private String representation;

    public Token(Colour colour) {
        this.colour = colour;
        generateRepresentaion(colour);
    }

    private void generateRepresentaion(Colour colour) {
        this.representation = String.valueOf(colour.name().charAt(0));
    }

    public void setNewColour(Colour colour) {
        this.colour = colour;
        generateRepresentaion(colour);
    }

    public void resetColour() {
        this.colour = Colour.EMPTY;
    }

    public Colour getColour() {
        return colour;
    }

    public String getRepresentation() {
        return representation;
    }
}
