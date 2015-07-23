package com.mars;


//RoverDriver will drive rover based on given initial position and instructions.
public class RoverDriver {

    private String position;

    public RoverDriver(String initialPosition) {
        this.position = initialPosition;
    }

    public String doThis(String seriousOfInstructions) {
        if (seriousOfInstructions != "") {
            for (int travelThroughSeriousOfInstructions = 0; travelThroughSeriousOfInstructions < seriousOfInstructions.length(); travelThroughSeriousOfInstructions++) {
                char newOrientation = doThisSingleInstruction(seriousOfInstructions.charAt(travelThroughSeriousOfInstructions));
                position = position.substring(0, 4) + newOrientation;
            }
        }
        return position;
    }

    private char doThisSingleInstruction(char instruction) {
        if(instruction == 'L' || instruction == 'R') {
            return getNewOrientation(instruction);
        }
        return ' ';
    }

    private char getNewOrientation(char instruction) {
        char oldOrientation = this.position.charAt(4);
        int referencePosition = "NESW".indexOf(oldOrientation);
        if(instruction == 'L') {
            if(--referencePosition < 0)
                referencePosition +=4;
        }
        else if(++referencePosition > 3)
            referencePosition -=4;
        return "NESW".charAt(referencePosition);
    }
}