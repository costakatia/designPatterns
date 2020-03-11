package Creational.abstractFactory;

public abstract class FoodMenu {
    private String menuStyle;

    public FoodMenu(String menuStyle){
        this.menuStyle = menuStyle;
    }
    public String getMenuStyle(){
        return this.menuStyle;
    }

    public abstract void render();
}
