package game.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import game.map.Exit;
import game.map.Location;

public class ExitIT {

    @Test
    public void testConstructorAndGetName() {
        
        String expectedName = "North";
        Location mockLocation = new Location("Room A", "description of the room");

        Exit exit = new Exit(expectedName, mockLocation);
        String actualName = exit.getName();

        assertEquals(expectedName, actualName, "The name should match the expected value.");
    }

    @Test
    public void testConstructorAndGetDestination() {
        
        String exitName = "South";
        Location expectedDestination = new Location("Room B", "description of room b");

        Exit exit = new Exit(exitName, expectedDestination);
        Location actualDestination = exit.getDestination();

        assertEquals(expectedDestination, actualDestination, "The destination should match the expected value.");
    }
}