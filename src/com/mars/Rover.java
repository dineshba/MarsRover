package com.mars;

//Job of Rover is get position of rover and do operation based on instruction
public class Rover {
    private final String position;

    public Rover(String initialPosition) {
        this.position = initialPosition;
    }

    public String getPosition() {
        return this.position;
    }
}
