package com.rover.MarsRoverApp.MarsRover.service;

import com.rover.MarsRoverApp.MarsRover.Entity.MarsRover;
import org.springframework.stereotype.Service;

@Service
public class MarsRoverService {
    /*
    MarsRoverService process the movements command against a given rover. Any unknown move commands will be ignored.
     */
    public void processCommands(MarsRover marsRover, char[] commands) {
        for (char command : commands) {
            switch (command) {
                case 'f' -> marsRover.getPosition().moveForward(marsRover.getDirection());
                case 'b' -> marsRover.getPosition().moveBackward(marsRover.getDirection());
                case 'r' -> marsRover.setDirection(marsRover.getDirection().rotateClockwise());
                case 'l' -> marsRover.setDirection(marsRover.getDirection().rotateAntiClockwise());
            }
        }
    }
}
