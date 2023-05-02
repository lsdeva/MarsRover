package com.rover.MarsRoverApp.MarsRover;

import com.rover.MarsRoverApp.MarsRover.Entity.Direction;
import com.rover.MarsRoverApp.MarsRover.Entity.MarsRover;
import com.rover.MarsRoverApp.MarsRover.Exceptions.InvalidCommandException;
import com.rover.MarsRoverApp.MarsRover.service.MarsRoverRunner;
import com.rover.MarsRoverApp.MarsRover.service.MarsRoverService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;


import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
@ActiveProfiles("test")
class MarsRoverAppApplicationTests {

	@InjectMocks
	private MarsRoverRunner marsRoverRunner;

	private MarsRover marsRover;

	@BeforeEach
	public void setUp() {
		marsRover = new MarsRover(3, 4, Direction.N);
	}

	@Test
	public void testRunWithInvalidNumberOfArguments() {
		assertThrows(InvalidCommandException.class, () -> marsRoverRunner.run("3,4,N"));
	}


	@Test
	public void testRunWithInvalidInitialState() {
		assertThrows(InvalidCommandException.class, () -> marsRoverRunner.run("3,4", "f,f,r,f,f"));
	}

	@Test
	public void testRunWithInvalidDirection() {
		assertThrows(IllegalArgumentException.class, () -> marsRoverRunner.run("3,4,Z", "f,f,r,f,f"));
	}
}
