package Creational.builder;

public interface RobotBuilder {
    void init();
    void assembleArms();
    void assembleLegs();
    void assembleWheels();
    void assembleHead();
    void assembleDoors();
    void assembleSensors();
    void assembleFireArms();
    Robot build();


}
