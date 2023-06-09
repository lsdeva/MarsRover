package com.rover.MarsRoverApp.MarsRover.service;

import com.rover.MarsRoverApp.MarsRover.Entity.Direction;
import com.rover.MarsRoverApp.MarsRover.Entity.MarsRover;
import com.rover.MarsRoverApp.MarsRover.Exceptions.InvalidCommandException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;

import java.util.Arrays;

/*
Mars Rover creation and command processing via MarsRoverService
 */
public class MarsRoverRunner implements CommandLineRunner {

    @Autowired
    MarsRoverService marsRoverService;

    private static final Logger LOG = LoggerFactory.getLogger(MarsRoverRunner.class);

    @Value("${skip.code.execution:false}")
    private boolean skipCodeExecution;

    @Override
    public void run(String... args) {
        LOG.info("EXECUTING : command line runner");

        if((Arrays.stream(args).count() != 2) ) {
            LOG.info("Provided number of arguments miss matched");
            throw new InvalidCommandException("Provide accurate command \n Example Command “3,4,N” “f,f,r,f,f”");
        }

        String[] initialState = args[0].split(",");

        if ((Arrays.stream(initialState).count() != 3)){
            LOG.info("Provided initial state of the rover is not matching with number of required fields.");
            throw new InvalidCommandException("Provided initial state of the rover is not matching with number of required fields.");
        }

        int x = Integer.parseInt(initialState[0]);
        int y = Integer.parseInt(initialState[1]);
        Direction direction = Direction.valueOf(initialState[2].toUpperCase());


        MarsRover marsRover = new MarsRover(x, y, direction);
        LOG.info("Rover created with start location info");


        marsRoverService.processCommands(marsRover, args[1].toCharArray());

        System.out.println(marsRover.getStatus());

        LOG.info("STOPPING: command line runner");


    }

}
