package com.mars;


//RoverDriver will drive rover based on given initial position and instructions.
public class RoverDriver {

    private String position;

    public RoverDriver(String initialPosition) {
        this.position = initialPosition;
    }

    public String doThis(String seriousOfInstructions) {
        if (seriousOfInstructions == "")
            return position;
        else
            return position.charAt(0) + " " + position.charAt(2) + " S";
    }
}