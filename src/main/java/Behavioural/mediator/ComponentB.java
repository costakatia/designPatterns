package Behavioural.mediator;

public class ComponentB extends Component {

    public ComponentB( Mediator mediator) {
        super("Component B", mediator);
    }

    @Override
    public void send() {
        String message =" Hey !! What's up.";
        System.out.println("Component B is sending: " + message);
        this.mediator.notify(this,message);

    }

    @Override
    public void receive(String message) {
        System.out.println("Component B got: " + message);

    }
}
