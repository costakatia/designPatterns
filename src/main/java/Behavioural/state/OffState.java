package Behavioural.state;

public class OffState implements State {
    LightBulb bulb;

    public OffState(LightBulb bulb){
        this.bulb = bulb;
    }

    @Override
    public void trasitionTo(State nextState) {
        this.bulb.setCurrentState(nextState);

    }

    @Override
    public void displayState() {
        System.out.println("Ligth bulb is turn off");
    }
}
