package Behavioural.observer;

public class Person implements Observer {

    private String name;
    Person(String name){
        this.name = name;
    }
    @Override
    public void notifyMe(int i) {
        System.out.println(name
                + " got notified"
                + ". Golden number is : "
                + i);
    }
}
