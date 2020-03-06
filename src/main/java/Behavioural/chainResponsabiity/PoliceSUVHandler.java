package Behavioural.chainResponsabiity;

public class PoliceSUVHandler extends AbstractHandler {

    @Override
    public void handle(String incomingSuspect) {
        if("PoliceSUV".equals(incomingSuspect)){
            System.out.println(" Validate id for : " + incomingSuspect);
            System.out.println("Give access");
            return;
        }
        throw new IllegalArgumentException("Vehicle of type :"
                + incomingSuspect + "");

    }
}
