package ua.lviv.iot.gym;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.gym.enums.MusclesGroup;
import ua.lviv.iot.gym.models.Simulators;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimulatorsTest {

    @Test
    void testGetAndSetName() {
        Simulators simulator = new Simulators();
        simulator.setName("TestSimulator");
        assertEquals("TestSimulator", simulator.getName(), "There is error in getName or setName");
    }

    @Test
    void testGetAndSetPrice() {
        Simulators simulator = new Simulators();
        simulator.setPrice(4599.99);
        assertEquals(4599.99, simulator.getPrice(), "There is error in getPrice or setPrice");
    }

    @Test
    void testGetAndSetExerciseDuration() {
        Simulators simulator = new Simulators();
        simulator.setExerciseDuration(600);
        assertEquals(600, simulator.getExerciseDuration(), "There is error in getExerciseDuration " +
                "or setExerciseDuration");
    }

    @Test
    void testGetAndSetColour() {
        Simulators simulator = new Simulators();
        simulator.setColour("White");
        assertEquals("White", simulator.getColour(), "There is error in getColour or setColour");
    }

    @Test
    void testGetAndSetExercise() {
        Simulators simulator = new Simulators();
        simulator.setExercise("PhysicalExercise");
        assertEquals("PhysicalExercise", simulator.getExercise(), "There is error in getExercise or " +
                "setExercise");
    }

    @Test
    void testGetAndSetMusclesGroup() {
        Simulators simulator = new Simulators();
        simulator.setMusclesGroup(MusclesGroup.CHEST);
        assertEquals(MusclesGroup.CHEST, simulator.getMusclesGroup(), "There is error in getMusclesGroup or " +
                "setMusclesGroup");
    }

    @Test
    void testGetHeaders() {

        Simulators simulator = new Simulators();
        assertEquals("name, price, exerciseDuration, colour, exercise, musclesGroup", simulator.getHeaders(),
                "Parameter names list is not correct");
    }

    @Test
    void testToCSV() {

        Simulators simulator = new Simulators("simulator", 999, 250, "gray",
                "exercise", MusclesGroup.CHEST);
        assertEquals("simulator, 999.0, 250, gray, exercise, CHEST", simulator.toCSV(),
                "Parameters are not correct, error in toCSV");
    }

}
