package Behavioural.chainResponsabiity;

public class CivilianVehicalHandler extends AbstractHandler{


    @Override
    public void handle(String incomingSuspect) {
        if("Civilian_SUV".equals(incomingSuspect)){
            System.out.println("Validate id for: " + incomingSuspect);
            System.out.println("Do exhaustive ");
            System.out.println("Do Minor interrogation");
            return;
        }
        this.nextHandler.handle(incomingSuspect);
    }
}
