package com.test.MarsRoverApp.MarsRover.service;

import com.test.MarsRoverApp.MarsRover.Entity.Direction;
import com.test.MarsRoverApp.MarsRover.Entity.MarsRover;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class MarsRoverRunner implements CommandLineRunner {

    @Autowired
    MarsRoverService marsRoverService;

    private static Logger LOG = LoggerFactory.getLogger(MarsRoverRunner.class);

    @Override
    public void run(String... args) throws Exception {
        LOG.info("STARTING THE ROVER APPLICATION");
        LOG.info(args[0]);
        LOG.info(args[1]);
        String[] initialState = args[0].split(",");
        int x = Integer.parseInt(initialState[0]);
        int y = Integer.parseInt(initialState[1]);
        Direction direction = Direction.valueOf(initialState[2].toUpperCase());

        MarsRover marsRover = new MarsRover(x, y, direction);
        marsRoverService.processCommands(marsRover, args[1].toCharArray());

        System.out.println(marsRover.getStatus());

        LOG.info("STOPING THE ROVER APPLICATION");

    }

}
