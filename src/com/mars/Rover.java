package com.mars;

//Job of Rover is get position of rover and do operation based on instruction
public class Rover {
    private String position;

    public Rover(String initialPosition) {
        this.position = initialPosition;
    }

    public String getPosition() {
        return this.position;
    }

    public Rover instructions(String instruction) {
        RoverDriver driver = new RoverDriver(this.getPosition());
        this.position = driver.doThis(instruction);
        return this;
    }
}
