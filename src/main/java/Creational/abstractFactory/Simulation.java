package Creational.abstractFactory;

public class Simulation {
    public static void main(String[] args) {
        RestaurantWithAbstraction dominosChain = new RestaurantWithAbstraction(
                new DominosFoodChainFactory());
        Customer customer = new Customer(dominosChain);

        customer.vistRestaurant();
        System.out.println();

        RestaurantWithAbstraction KfcChain = new RestaurantWithAbstraction(
                new KFCFoodChainFactory());
        customer.setRestaurant(KfcChain);
        customer.vistRestaurant();

    }
}
