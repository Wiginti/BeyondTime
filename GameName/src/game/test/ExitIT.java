package game.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ExitTest {

    @Test
    public void testConstructorAndGetName() {
        
        String expectedName = "North";
        Location mockLocation = new Location("Room A");

        Exit exit = new Exit(expectedName, mockLocation);
        String actualName = exit.getName();

        assertEquals(expectedName, actualName, "The name should match the expected value.");
    }

    @Test
    public void testConstructorAndGetDestination() {
        
        String exitName = "South";
        Location expectedDestination = new Location("Room B");

        Exit exit = new Exit(exitName, expectedDestination);
        Location actualDestination = exit.getDestination();

        assertEquals(expectedDestination, actualDestination, "The destination should match the expected value.");
    }
}