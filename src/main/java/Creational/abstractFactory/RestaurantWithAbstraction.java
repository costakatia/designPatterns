package Creational.abstractFactory;

public class RestaurantWithAbstraction {
    private Furniture furniture;
    private FoodMenu menu;

    public RestaurantWithAbstraction(FoodChainFactory foodChainFactory){
        this.menu = foodChainFactory.createFoodMenu();
        this.furniture =foodChainFactory.createFurniture();

    }
    public Furniture getFurniture(){
        return furniture;
    }
    public FoodMenu getMenu(){
        return menu;
    }
    public void renderShop(){
        this.furniture.use();
        this.menu.render();
    }
}
