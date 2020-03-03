package Structural.bridge;

public class Rectangle extends Shape {
    private int length;
    private  int breadth;

    public Rectangle(int length, int breadth, Color colorType) {
        super(colorType);
        this.length = length;
        this.breadth = breadth;
        this.shapeType = "Rectangle";
    }

    @Override
    public void computeArea() {
        this.area = length *breadth;

    }
}
