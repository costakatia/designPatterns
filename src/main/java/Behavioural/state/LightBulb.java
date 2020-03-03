package Behavioural.state;

import java.util.HashMap;
import java.util.Map;

public class LightBulb {
    private Map<State, State> lightBulbuStateMap =
            new HashMap<>();

    State curranteState;

    public LightBulb(){
        State onState = new OnState(this);
        State offState= new OffState(this);
        this.lightBulbuStateMap.put(onState,offState);
        this.lightBulbuStateMap.put(offState,onState);
        curranteState = offState;
    }


    public void setCurrentState(State currentStatente) {
        this.curranteState = currentStatente;
    }
    public void displayState(){
        this.curranteState.displayState();
    }
    public void toggle(){
        this.curranteState.trasitionTo(
                lightBulbuStateMap.get(curranteState));
    }

}
