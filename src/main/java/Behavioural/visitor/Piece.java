package Behavioural.visitor;

public class Piece extends ChessComponent {
    private String color;

    public Piece(String name, String color) {
        super(name);
        this.color = color;
    }

    public String getColor() {

        return color;
    }

    @Override
    void accept(Visitor v) {
        v.visitPiece(this);
    }
}
