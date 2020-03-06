package Behavioural.chainResponsabiity;

public class FireTruckHandler extends AbstractHandler {
    @Override
    public void handle(String incomingSuspect) {
        if ("FireTruck".equals(incomingSuspect)) {
            System.out.println("Validate id for : " + incomingSuspect);
            return;

        }
        this.nextHandler.handle(incomingSuspect);
    }
}
