package Creational.simplefactoryMethod;

import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.util.Properties;

public class PetStore {

    private AnimalFactory factory;

    public PetStore(AnimalFactory factory){
        this.factory = factory;

    }

    public static void main(String[] args) {
        PetStore petStore = new PetStore(getFactoryFromProperty() );
        Animal pet = petStore.orderPet();
        pet.makeSoud();
        pet.moveAround();

    }
    private static AnimalFactory getFactoryFromProperty() {
        String propertyFile = "/home/usertqi/Documentos/designPatterns/src/main/java/Creational/simplefactoryMethod/app.properties";
        try (FileReader reader = new FileReader(propertyFile))
        {
            Properties p = new Properties();
            p.load(reader);

            String factoryKey = "petstore.factory.type";
            Class<?> clazz = Class.forName(p.getProperty(factoryKey));
            Constructor<?> constructor = clazz.getConstructor();

            return (AnimalFactory) constructor.newInstance();
        } catch(Exception e){
            throw new IllegalArgumentException("Factory with provided name could not be instanciated");
        }


    }
    private Animal orderPet()
    {
        return factory.createAnimal("Dollar", "Dog");
    }
}
