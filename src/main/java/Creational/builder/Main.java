package Creational.builder;

public class Main {
    public static void main(String[] args) {
        RobotBuilder builder = new HumonoidRobotBuilder();
        builder.init();
        builder.assembleHead();
        builder.assembleArms();
        builder.assembleLegs();
        builder.assembleSensors();

        Robot sofia = builder.build();


    }
}
