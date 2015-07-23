package com.mars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RoverTest {

    @Test
    public void finalPositionOfRoverIsSameAsInitialWhenNoOperationPerformed() {
        Rover rover = new Rover("5 5 N");

        String actualPosition = rover.getPosition();

        assertEquals("5 5 N", actualPosition);
    }
}
