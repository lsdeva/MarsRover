package com.rover.MarsRoverApp.MarsRover.service;

import com.rover.MarsRoverApp.MarsRover.Entity.MarsRover;
import org.springframework.stereotype.Service;

@Service
public class MarsRoverService {
    public MarsRover processCommands(MarsRover marsRover, char[] commands) {
        for (char command : commands) {
            switch (command) {
                case 'f': marsRover.getPosition().moveForward(marsRover.getDirection()); break;
                case 'b': marsRover.getPosition().moveBackward(marsRover.getDirection()); break;
                case 'r': marsRover.setDirection(marsRover.getDirection().rotateClockwise()); break;
                case 'l': marsRover.setDirection(marsRover.getDirection().rotateAntiClockwise()); break;
            }
        }
        return marsRover;
    }
}
