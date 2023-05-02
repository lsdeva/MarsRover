package com.rover.MarsRoverApp.MarsRover;

import com.rover.MarsRoverApp.MarsRover.Entity.Direction;
import com.rover.MarsRoverApp.MarsRover.Entity.MarsRover;
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


import static org.mockito.Mockito.verify;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
@ActiveProfiles("test")
class MarsRoverAppApplicationTests {

	@InjectMocks
	private MarsRoverRunner marsRoverRunner;

	@Mock
	private MarsRoverService marsRoverService;

	private MarsRover marsRover;

	@BeforeEach
	public void setUp() {
		marsRover = new MarsRover(3, 4, Direction.N);
	}

	@Test
	public void testValidCommands() {
		marsRoverService.processCommands(marsRover, "f,f,r,f,f".toCharArray());
//		System.out.println(marsRover.getStatus());
		//marsRoverRunner.run("3,4,N", "ffrff");

		//verify(marsRoverService).processCommands(marsRover, new char[]{'f', 'f', 'r', 'f', 'f'});
	}

}
