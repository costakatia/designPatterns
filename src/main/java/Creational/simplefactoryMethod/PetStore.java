package Creational.simplefactoryMethod;

import java.beans.ConstructorProperties;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class PetStore {

    private static String propertyFile = "/home/usertqi/Documentos/designPatterns/src/main/java/Creational/simplefactoryMethod";
    private static String factoryKey = "petstore.factory.type";
    private AnimalFactory factory;

    public PetStore(AnimalFactory factory){
        this.factory = factory;

    }

    public static void main(String[] args) {
        PetStore petStore = new PetStore(new PetStoreFactory());
        Animal pet = petStore.orderPet("Dollar", "Dog");
        pet.makeSoud();
        pet.moveAround();

    }
    private static AnimalFactory getFactoryFromProperty() {
        try (FileReader reader = new FileReader(propertyFile)) {
            Properties p = new Properties();
            p.load(reader);
            Class<?> clazz = Class.forName(p.getProperty(factoryKey));
            Constructor<?> constructor = clazz.getConstructor();
            return (AnimalFactory) constructor.newInstance();
        } catch(Exception e){
            throw new IllegalArgumentException("Factory with provided name could not be instanciated");
        }


    }
    private Animal orderPet(String petName, String petType)
    {
        return factory.createAnimal(petName,petType );
    }
}
