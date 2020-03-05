package Behavioural.template;

public abstract class PizzaMaker {

    public abstract void selectBrad();
    public abstract void chooseIngredients();
    public abstract void bakeATemp();
    public abstract void addToppings();
    public abstract void addCheese();

    public void make(){
        selectBrad();
        chooseIngredients();
        addToppings();
        addCheese();
        bakeATemp();

    }
}
