# Mars Rover App

This project is a simple implementation of a Mars Rover application in Java using Spring Boot. The application simulates the movement of a Mars Rover based on provided commands.

## Table of Contents

- [Getting Started](#getting-started)
- [Application Structure](#application-structure)
- [Usage](#usage)
- [Testing](#testing)
- [To-Do List](#to-do-list)

## Getting Started

To run the Mars Rover application, you need to have Java and Maven installed on your machine. Clone the repository and navigate to the project root directory.

## Application Structure

- `src/main/java/com/rover/MarsRoverApp/MarsRover`
  - `MarsRoverAppApplication.java`: The main class to run the Spring Boot application.
  - `Entity`
    - `Direction.java`: Enum representing the direction of the Mars Rover (N, E, S, W).
    - `MarsRover.java`: Class representing the Mars Rover entity.
    - `Position.java`: Class representing the position of the Mars Rover on the grid.
  - `Exceptions`
    - `InvalidCommandException.java`: Custom exception class for handling invalid commands.
  - `service`
    - `MarsRoverRunner.java`: Class implementing CommandLineRunner for processing rover initialization and commands.
    - `MarsRoverService.java`: Service class for processing rover movement commands.
- `src/test/java/com/rover/MarsRoverApp/MarsRover`
  - `MarsRoverAppApplicationTests.java`: Test class for the main application.
  - `MarsRoverServiceTest.java`: Test class for the MarsRoverService.

## Usage

To run the Mars Rover application, use either of the following commands:

```
mvn spring-boot:run -Dspring-boot.run.arguments="3,4,N f,f,r,f,f"
java -jar MarsRover-0.0.1-SNAPSHOT.jar "3,4,N" "f,f,r,f,f" 
```
Expected Output

```
Final Coordinate: 5, 6
Final Direction: EAST
```

## Testing

To run the test cases, use the following command:

```
mvn test
```

## To Do List
 - [ ] Extend the application to support multiple rovers with collision detection.
 
 - [ ] Package the application as a standalone executable for easier distribution and usage.
 
