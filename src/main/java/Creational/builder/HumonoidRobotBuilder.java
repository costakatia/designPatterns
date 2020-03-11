package Creational.builder;

public class HumonoidRobotBuilder implements RobotBuilder {
    private Robot robot;
    public HumonoidRobotBuilder(){}


    @Override
    public void init() {
        this.robot = new Robot();

    }

    @Override
    public void assembleArms() {
        this.robot.setArms("Assembling arms ");
    }

    @Override
    public void assembleLegs() {
        this.robot.setLegs("Assembling legs");

    }

    @Override
    public void assembleWheels() {
        this.robot.setWheels("Assembling wheels");

    }

    @Override
    public void assembleHead() {
        this.robot.setHead("Assembling head");

    }

    @Override
    public void assembleDoors() {
       this.robot.setDoor("Assembling doors");

    }

    @Override
    public void assembleSensors() {
        this.robot.setSensors("Assembling sensors");

    }

    @Override
    public void assembleFireArms() {
        this.robot.setFireArms("Assembling FireArms");

    }

    @Override
    public Robot build() {
        return this.robot;

    }

}
