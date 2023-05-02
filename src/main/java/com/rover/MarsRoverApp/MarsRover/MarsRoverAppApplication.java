package com.rover.MarsRoverApp.MarsRover;

import com.rover.MarsRoverApp.MarsRover.service.MarsRoverRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class MarsRoverAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarsRoverAppApplication.class, args);
	}
/*
This application only focus on processing the rover initialization and command process via CLR.
roverProcess boostrap the Spring Application initiation with provided command line arguments.
 */
	@Bean
	@Profile("!test")
	public MarsRoverRunner roverProcess(){
		return new MarsRoverRunner();
	}
}
