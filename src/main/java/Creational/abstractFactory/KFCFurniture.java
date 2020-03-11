package Creational.abstractFactory;

public class KFCFurniture extends Furniture {
    public KFCFurniture(String waterMark) {
        super(waterMark);
    }

    @Override
    public void use() {
        System.out.println("KFC style furniture");

    }
}
