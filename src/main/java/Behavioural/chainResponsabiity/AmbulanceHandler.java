package Behavioural.chainResponsabiity;

public class AmbulanceHandler extends AbstractHandler {


    @Override
    public void handle(String incomingSuspect) {
        if ("Ambulance".equals(incomingSuspect)) {
            System.out.println("Validate id for : " + incomingSuspect);
            System.out.println("Do exhaustive search.");
            System.out.println("Do minor interrogation.");
            System.out.println("Check patient.");
            return;
        }
        this.nextHandler.handle(incomingSuspect);
    }
}
