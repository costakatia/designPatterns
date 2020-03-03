package Behavioural.state;

public class OnState implements State {

    LightBulb bulb;

    public OnState(LightBulb bulb){
        this.bulb = bulb;
    }

    @Override
    public void trasitionTo(State nextState) {
        this.bulb.setCurrentState(nextState);

    }

    @Override
    public void displayState() {
        System.out.println("Ligth bulb is turn on");
    }
}
