package Creational.abstractFactory;

import java.util.function.Function;

public abstract class Furniture {
    private String waterMark;

    public Furniture(String waterMark){
        this.waterMark = waterMark;
    }

    public abstract void use();

}
