package Creational.factoryMethod;

public class AnimalFactory {
    public static  Animal createAnimal(String petName, String petType){
        Animal pet;
        if(petType.equals("Dog")){
            pet = new Dog(petName);
        } else  if (petType.equals("Cat")){
            pet = new Cat(petName);
        }else {
            throw new IllegalArgumentException((petType + " Is not a valid pet category"));
        }
        return pet;
    }
}
