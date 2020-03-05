package Behavioural.template;

public class SimpleCheeseCornPizza extends PizzaMaker {


    @Override
    public void selectBrad() {
        System.out.println("Choosing bread...");
    }

    @Override
    public void chooseIngredients() {
        System.out.println("Choosing Ingredients...");
    }

    @Override
    public void bakeATemp() {
        System.out.println("Baking at 180...");
    }

    @Override
    public void addToppings() {
        System.out.println("Adding Toppings...");
    }

    @Override
    public void addCheese() {
        System.out.println("Adding Cheese...");
    }
}
