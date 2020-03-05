package Behavioural.observer;

import java.awt.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Subject radio = new RadioStation();

        Observer ob1 = new Person("ob1");
        Observer ob2 = new Person("ob2");
        Observer ob3 = new Person("ob3");
        Observer ob4 = new Person("ob4");


        radio.register(ob1);
        radio.register(ob2);
        radio.notifyObserver();

        radio.register(ob3);
        ((RadioStation) radio).updateGoldenNumber(4);
        radio.unregister(ob1);
        radio.unregister(ob2);
        radio.register(ob4);

        ((RadioStation) radio).updateGoldenNumber(10);
    }
}

