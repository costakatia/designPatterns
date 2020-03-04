package Behavioural.visitor;

public class ConsoleVisitor implements Visitor {
    @Override
    public void visitPiece(Piece p) {
        System.out.println("Visiting: " + p.getName()
                + ", color: "
                + p.getColor());
    }

    @Override
    public void visitBlock(BoardBlock b) {
        System.out.println(" Visiting,  "
                + b.getName()
                + " this board has: "
                + b.getBlockColor()
                + " and a piece with name: "
                + b.getPiece().getName()
                + " and color: "
                + b.getPiece().getColor());

    }
}
