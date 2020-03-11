package Creational.abstractFactory;

public class DominosFoodChainFactory implements FoodChainFactory {
    @Override
    public FoodMenu createFoodMenu() {
        return new DominosFoodMenu("Dominos Menu Style");
    }

    @Override
    public Furniture createFurniture() {
        return new DominosFurniture("Dominos furniture style");
    }
}
