package Creational.builder;

public class RCCarBotBuilder implements RobotBuilder  {

    private Robot robot;

    public RCCarBotBuilder(){

    }

    @Override
    public void init() {
    this.robot = new Robot();
    }
    @Override
    public void assembleArms() {
        this.robot.setArms("Assembling RC arms ");
    }

    @Override
    public void assembleLegs() {
        this.robot.setLegs("Assembling RC legs");

    }

    @Override
    public void assembleWheels() {
        this.robot.setWheels("Assembling RC wheels");

    }

    @Override
    public void assembleHead() {
        this.robot.setHead("Assembling RC head");

    }

    @Override
    public void assembleDoors() {
        this.robot.setDoor("Assembling RC doors");

    }

    @Override
    public void assembleSensors() {
        this.robot.setSensors("Assembling RC sensors");

    }

    @Override
    public void assembleFireArms() {
        this.robot.setFireArms("Assembling RC FireArms");

    }

    @Override
    public Robot build() {
        return this.robot;
    }
}
