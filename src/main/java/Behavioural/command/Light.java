package Behavioural.command;

public class Light extends Receiver {


    public Light(String name) {
        super(name);
    }

    @Override
    void on() {
        System.out.println("Light is on");
    }

    @Override
    void off() {
        System.out.println("Light is off");
    }
}
