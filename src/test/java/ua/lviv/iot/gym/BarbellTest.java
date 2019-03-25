package ua.lviv.iot.gym;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.gym.enums.BarbellTypes;
import ua.lviv.iot.gym.enums.MusclesGroup;
import ua.lviv.iot.gym.models.Barbell;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BarbellTest {

    @Test
    void testBarbellTypes() {
        Barbell barbell = new Barbell();
        barbell.setBarbellTypes(BarbellTypes.OLYMPIC);
        assertEquals(BarbellTypes.OLYMPIC, barbell.getBarbellTypes(), "Error in setBarbellTypes or" +
                " getBarbellTypes");
    }

    @Test
    void testGetHeaders() {

        Barbell barbell = new Barbell();
        assertEquals("name, price, exerciseDuration, colour, exercise, musclesGroup, BarbellTypes",
                barbell.getHeaders(), "Parameter names list is not correct, error in getHeaders");
    }

    @Test
    void testToCSV() {
        Barbell barbell = new Barbell("barbell", 300, 20, "white",
                "barbellLifting", MusclesGroup.CHEST, BarbellTypes.OLYMPIC);
        assertEquals("barbell, 300.0, 20, white, barbellLifting, CHEST, OLYMPIC", barbell.toCSV(),
                "Parameters are not correct, error in toCSV");

    }
}

