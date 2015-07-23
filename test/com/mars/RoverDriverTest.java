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
    public void onlyChangeInOrientationOfRover() {
        RoverDriver driver = new RoverDriver("0 0 N");

        String actualPosition = driver.doThis("LL");

        assertEquals("0 0 S", actualPosition);
    }
}