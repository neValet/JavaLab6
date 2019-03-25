package ua.lviv.iot.gym;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.gym.enums.MusclesGroup;
import ua.lviv.iot.gym.enums.PressParts;
import ua.lviv.iot.gym.models.PressTrainingSimulator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PressTrainingSimulatorTest {

    @Test
    void testPressTrainingSimulator() {
        PressTrainingSimulator pressTrainingSimulator = new PressTrainingSimulator();
        pressTrainingSimulator.setPressParts(PressParts.UPPER_STOMACH_PRESS);
        assertEquals(PressParts.UPPER_STOMACH_PRESS, pressTrainingSimulator.getPressParts(), "Error in setPressParts or" +
                " getPressParts");
    }

    @Test
    void testGetHeaders() {
        PressTrainingSimulator pressTrainingSimulator = new PressTrainingSimulator();
        assertEquals("name, price, exerciseDuration, colour, exercise, musclesGroup, pressParts",
                pressTrainingSimulator.getHeaders(),
                "Parameter names list is not correct, error in getHeaders");
    }

    @Test
    void testToCSV() {
        PressTrainingSimulator pressTrainingSimulator = new PressTrainingSimulator("pressTrainingSimulator",
                1000, 1200, "blue", "pressLifting", MusclesGroup.PRESS,
                PressParts.UPPER_STOMACH_PRESS);
        assertEquals("pressTrainingSimulator, 1000.0, 1200, blue, pressLifting, PRESS, UPPER_STOMACH_PRESS",
                pressTrainingSimulator.toCSV(), "Parameters are not correct, error in toCSV");
    }
}
