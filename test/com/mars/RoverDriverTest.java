package com.mars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoverDriverTest {

    @Test
    public void noInstructionsToDriver() {
        RoverDriver driver = new RoverDriver("5 5 N");

        String actualPosition = driver.doThis("");

        assertEquals("5 5 N", actualPosition);
    }

    @Test
    public void onlyChangeInOrientationOfRoverOneTime() {
        RoverDriver driver = new RoverDriver("0 0 N");

        String actualPosition = driver.doThis("LR");

        assertEquals("0 0 N", actualPosition);
    }

    @Test
    public void onlyChangeInOrientationOfRoverMultipleTimes() {
        RoverDriver driver = new RoverDriver("0 0 S");

        String actualPosition = driver.doThis("L");

        assertEquals("0 0 E", actualPosition);
    }
}