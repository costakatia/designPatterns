package Behavioural.chainResponsabiity;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Handler vehicleHandler = main.getValidationHandlers();
        String vehicleType = "PoliceSUV";
        vehicleHandler.handle(vehicleType);
    }

    public Handler getValidationHandlers(){
        Handler civilianHandler = new CivilianVehicalHandler();
        Handler fireTruckHandler = new FireTruckHandler();
        Handler ambulanceHandler = new AmbulanceHandler();
        Handler policeSUVHandler = new PoliceSUVHandler();

        civilianHandler.setNextHandler(fireTruckHandler);
        fireTruckHandler.setNextHandler(ambulanceHandler);
        ambulanceHandler.setNextHandler(policeSUVHandler);
        return civilianHandler;
    }

}
