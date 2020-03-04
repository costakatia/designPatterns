package Behavioural.visitor;

public class main {
    public static void main(String[] args) {
        System.out.println("From good way!!");

        Piece rook = new Piece("Rook", "Black");
        BoardBlock block = new BoardBlock("block", "white", rook);

        Visitor v = new ConsoleVisitor();
        block.accept(v);


    }
}
