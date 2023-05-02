package com.rover.MarsRoverApp.MarsRover;

import com.rover.MarsRoverApp.MarsRover.Entity.Direction;
import com.rover.MarsRoverApp.MarsRover.Entity.MarsRover;
import com.rover.MarsRoverApp.MarsRover.service.MarsRoverService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@ActiveProfiles("test")
public class MarsRoverServiceTest {

    @Autowired
    MarsRoverService marsRoverService;

    // Test case for processing valid commands
    @Test
    public void testProcessCommands() {
        MarsRover marsRover = new MarsRover(3, 4, Direction.N);
        MarsRover result = marsRoverService.processCommands(marsRover, "f,f,r,f,f".toCharArray());
        assertEquals(5, result.getPosition().getX());
        assertEquals(6, result.getPosition().getY());
        assertEquals(Direction.E, result.getDirection());
    }

    // Test case for processing unknown commands (x and z in this case)
    @Test
    public void testProcessCommandsUnknownCommands() {
        MarsRover marsRover = new MarsRover(3, 4, Direction.N);
        MarsRover result = marsRoverService.processCommands(marsRover, "f,f,x,r,f,f,z".toCharArray());
        assertEquals(5, result.getPosition().getX());
        assertEquals(6, result.getPosition().getY());
        assertEquals(Direction.E, result.getDirection());
    }
}
