package Behavioural.command;

public class Motor  extends Receiver{
    public Motor(String name) {
        super(name);
    }

    @Override
    void on() {
        System.out.println("Motor ios on");

    }

    @Override
    void off() {
        System.out.println("Motor ios off");
    }
}
