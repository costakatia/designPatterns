package Creational.abstractFactory;

public class Customer {
    private RestaurantWithAbstraction restaurant;
    public Customer(RestaurantWithAbstraction restaurant){
        this.restaurant = restaurant;
    }
    public void  vistRestaurant(){
        this.restaurant.renderShop();
        this.restaurant.getMenu().render();
        this.restaurant.getFurniture().use();
    }
    public void setRestaurant(RestaurantWithAbstraction chain){
        this.restaurant = chain;
    }
}
