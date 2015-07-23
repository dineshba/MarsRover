package com.mars;

public class RoverDriver {

    private final String position;

    public RoverDriver(String initialPosition) {
        this.position = initialPosition;
    }

    public String doThis(String instructions) {
        return position;
    }
}
