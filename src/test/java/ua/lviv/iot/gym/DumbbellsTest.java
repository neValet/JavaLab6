package ua.lviv.iot.gym;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.gym.enums.MusclesGroup;
import ua.lviv.iot.gym.models.Dumbbells;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DumbbellsTest {

    @Test
    void testSetAndGetWeight() {
        Dumbbells dumbbells = new Dumbbells();
        dumbbells.setWeight(20);
        assertEquals(20, dumbbells.getWeight(), "Error in setWeight or getWeight");
    }

    @Test
    void testGetHeaders() {
        Dumbbells dumbbells = new Dumbbells();
        assertEquals("name, price, exerciseDuration, colour, exercise, musclesGroup, weight",
                dumbbells.getHeaders(), "Parameter names list is not correct, error in getHeaders");
    }

    @Test
    void testToCSV() {
        Dumbbells dumbbells = new Dumbbells("dumbbells", 500, 120, "black",
                "dumbbellsLifting", MusclesGroup.HANDS, 20);
        assertEquals("dumbbells, 500.0, 120, black, dumbbellsLifting, HANDS, 20.0", dumbbells.toCSV(),
                "Parameters are not correct, error in toCSV");

    }
}
