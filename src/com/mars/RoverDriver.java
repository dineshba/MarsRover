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
                position = doThisSingleInstruction(seriousOfInstructions.charAt(travelThroughSeriousOfInstructions));
            }
        }
        return position;
    }

    private String doThisSingleInstruction(char instruction) {
        if(instruction == 'L' || instruction == 'R') {
            return oldPosition() + getNewOrientation(instruction);
        }
        else if(instruction == 'M')
            return getNewLocation(instruction) + oldOrientation();
        return "";
    }

    private String getNewLocation(char instruction) {
        int xLocation = getLocation(0);
        int yLocation = getLocation(2);
        switch(oldOrientation()){
            case 'N':
                yLocation++;
                break;
            case 'E':
                xLocation++;
                break;
            case 'S':
                yLocation--;
                break;
            case 'W':
                xLocation--;
                break;
        }
        return xLocation +" " + yLocation + " ";
    }

    private char getNewOrientation(char instruction) {
        int referencePosition = "NESW".indexOf(oldOrientation());
        if(instruction == 'L') {
            if(--referencePosition < 0)
                referencePosition +=4;
        }
        else if(++referencePosition > 3)
            referencePosition -=4;
        return "NESW".charAt(referencePosition);
    }

    private String oldPosition() {
        return position.substring(0, 4);
    }

    private int getLocation(int i) {
        return Integer.parseInt("" + this.position.charAt(i));
    }

    private char oldOrientation() {
        return this.position.charAt(4);
    }

}