package ua.lviv.iot.gym;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.gym.enums.MusclesGroup;
import ua.lviv.iot.gym.models.Racetrack;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RacetrackTest {

    @Test
    void testSetAndGetSpeed() {
        Racetrack racetrack = new Racetrack();
        racetrack.setSpeed(20);
        assertEquals(20, racetrack.getSpeed(), "Error in setSpeed of getSpeed");
    }

    @Test
    void testGetHeaders() {
        Racetrack racetrack = new Racetrack();
        assertEquals("name, price, exerciseDuration, colour, exercise, musclesGroup, speed",
                racetrack.getHeaders(), "Parameter names are not correct, error in getHeaders");
    }

    @Test
    void testToCSV() {
        Racetrack racetrack = new Racetrack("racetrack", 400, 1800, "white",
                "jogging", MusclesGroup.LEGS, 15);
        assertEquals("racetrack, 400.0, 1800, white, jogging, LEGS, 15", racetrack.toCSV(),
                "Parameters are not correct, error in getHeaders");
    }

}
