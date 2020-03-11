package Creational.abstractFactory;

public class KFCFoodMenu extends FoodMenu{

    public KFCFoodMenu(String menuStyle) {
        super(menuStyle);
    }

    @Override
    public void render() {
        System.out.println("KFC style Food Menu");

    }
}
