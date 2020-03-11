package Creational.abstractFactory;

public class KFCFoodChainFactory implements FoodChainFactory {
    @Override
    public FoodMenu createFoodMenu() {
        return new KFCFoodMenu("KFC food style menu");
    }

    @Override
    public Furniture createFurniture() {
        return new KFCFurniture("KFC furniture style Menu");
    }
}
