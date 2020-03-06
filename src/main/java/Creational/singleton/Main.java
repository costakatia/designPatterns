package Creational.singleton;

public class Main{
    public static void main(String[] args) {
        MyInstance singleton = MyInstance.INSTANCE;
        singleton.setValue(4);
        System.out.println(singleton.getValue());

        MyInstance sMyInstance = MyInstance.INSTANCE;
        System.out.println(sMyInstance.getValue());

        singleton.setValue(8);

        System.out.println(singleton.getValue());
        System.out.println(sMyInstance.getValue());
    }

}
