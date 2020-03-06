package Creational.factoryMethod;

public class PetStore {
    public static void main(String[] args) {
        PetStore petStore = new PetStore();
        Animal pet = petStore.orderPet("Dollar", "Dog");
        pet.makeSoud();
        pet.moveAround();

    }

    private Animal orderPet(String petName, String petType) {
        return AnimalFactory.createAnimal(petName,petType );
    }
}
