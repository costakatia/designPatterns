package Structural.bridge;

public class Client {
    public static void main(String[] args) {
        RedColor red = new RedColor();
        GreenColor greenColor = new GreenColor();


        Shape square = new Square(4, red);
        square.paintShape();

        square.setColor(greenColor);
        square.paintShape();


        Rectangle rectangle = new Rectangle(6,6,greenColor);
        rectangle.paintShape();


    }
}
