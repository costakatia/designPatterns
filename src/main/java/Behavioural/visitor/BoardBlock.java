package Behavioural.visitor;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;

public class BoardBlock  extends ChessComponent{
    private String blockColor;
    private Piece piece;

    public BoardBlock( String name, String blockColor, Piece piece){
        super(name);
        this.blockColor = blockColor;
        this.piece = piece;
    }

    public String getBlockColor() {
        return blockColor;
    }

    public void setBlockColor(String blockColor) {
        this.blockColor = blockColor;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
    @Override
    void accept(Visitor v) {
        v.visitBlock(this);

    }
}
