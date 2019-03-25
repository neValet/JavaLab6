package ua.lviv.iot.gym;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.gym.enums.MusclesGroup;
import ua.lviv.iot.gym.managers.Trainer;
import ua.lviv.iot.gym.managers.TrainerWriter;
import ua.lviv.iot.gym.models.Simulators;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class TrainerWriterTest {

    private Simulators object1;
    private Simulators object2;
    private Simulators object3;
    private Simulators object4;
    private List<Simulators> input;
    private Trainer manager;

    @BeforeEach
    void setup() {
        this.object1 = new Simulators(
                "Barbell", 1000, 600, "Red",
                "BarbellLifting", MusclesGroup.CHEST
        );
        this.object2 = new Simulators(
                "Dumbbells", 1200, 1200, "White",
                "DumbbellLifting", MusclesGroup.HANDS
        );
        this.object3 = new Simulators(
                "PressTrainingSimulator", 300, 120,
                "White", "PressLifting", MusclesGroup.PRESS
        );
        this.object4 = new Simulators(
                "Racetrack", 5000, 2400,
                "Black", "Running", MusclesGroup.LEGS
        );

        input = new ArrayList<>();
        input.add(object3);
        input.add(object2);
        input.add(object1);
        input.add(object4);
    }

    @Test
    void testWriteToFile() throws IOException {
        TrainerWriter writer = new TrainerWriter();
        writer.writeToFile(this.input);

        File testFile = new File("Simulators.csv");
        writer.writeToFile(this.input);
        assertTrue(testFile.exists() && testFile.isFile(),
                "File wasn't created");

        try (FileInputStream fis = new FileInputStream(testFile);
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader bufReader = new BufferedReader(isr)) {

            for (Simulators simulators : input) {
                assertEquals(simulators.getHeaders(), bufReader.readLine());
                assertEquals(simulators.toCSV(), bufReader.readLine());
            }
            assertNull(bufReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

