package Behavioural.mediator;

import java.util.HashMap;
import java.util.Map;

public class ConcreteMediator implements Mediator {

    private final String COMPONENT_A = "Component-A ";
    private final String COMPONENT_B = "Component-B ";

    private Map<String, Component> regCompMap =
            new HashMap<>();
    @Override
    public void notify(Component sender, String message) {
        String sendetName = sender.getName();
        if(COMPONENT_A.equals(sendetName)){
            reactOnA(message);
        }else if(COMPONENT_B.equals(sendetName)){
            reactOnB(message);
        }

    }

    @Override
    public void register(Component component) {
        this.regCompMap.put(component.getName(), component);

    }
    private void reactOnA(String message){
        System.out.println("Mediator is in action");
        regCompMap.get(COMPONENT_B).receive(message);
    }
    private void reactOnB(String message){
        System.out.println("Mediator is in action");
        regCompMap.get(COMPONENT_A).receive(message);

    }
}
