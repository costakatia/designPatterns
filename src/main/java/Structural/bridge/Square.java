package Structural.bridge;

public class Square extends Shape {
    private int sideLenght;

    public Square(int sideLenght, Color colorType){
        super(colorType);
        this.sideLenght = sideLenght;
        this.shapeType = "square";
    }

    @Override
    public void computeArea() {
        this.area = sideLenght * sideLenght;

    }
}
