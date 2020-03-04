package Behavioural.mediator;

public class ComponentA extends Component {

    public ComponentA( Mediator mediator) {
        super("Component A", mediator);
    }

    @Override
    public void send() {
        String message =" I am good.";
        System.out.println("Component A is sending: " + message);
        this.mediator.notify(this,message);

    }

    @Override
    public void receive(String message) {
    System.out.println("Component A got: " + message);

    }
}
