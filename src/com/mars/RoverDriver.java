package com.mars;


//RoverDriver will drive rover based on given initial position and instructions.
public class RoverDriver {

    private final String position;

    public RoverDriver(String initialPosition) {
        this.position = initialPosition;
    }

    public String doThis(String instructions) {
        if(instructions == "")
            return position;
        return "";
    }
}
