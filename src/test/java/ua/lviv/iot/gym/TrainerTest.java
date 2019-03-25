package ua.lviv.iot.gym;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.gym.enums.BarbellTypes;
import ua.lviv.iot.gym.enums.MusclesGroup;
import ua.lviv.iot.gym.enums.PressParts;
import ua.lviv.iot.gym.managers.Trainer;
import ua.lviv.iot.gym.managers.TrainerImpl;
import ua.lviv.iot.gym.models.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class TrainerTest {

    private Simulators racetrack;
    private Simulators barbell;
    private Simulators pressTrainingSimulator;
    private Simulators dumbbells;
    private List<Simulators> input;
    private Trainer manager;


    @BeforeEach
    void setup() {
        this.racetrack = new Racetrack(
                "Racetrack", 2000,
                900, "White",
                "jogging", MusclesGroup.LEGS, 15
        );
        this.barbell = new Barbell(
                "Barbell", 250,
                1000, "Silver",
                "liftingFromChest", MusclesGroup.CHEST, BarbellTypes.OLYMPIC
        );
        this.pressTrainingSimulator = new PressTrainingSimulator(
                "PressTrainingSimulator", 200,
                600, "Black",
                "pressLifting", MusclesGroup.PRESS, PressParts.UPPER_STOMACH_PRESS
        );
        this.dumbbells = new Dumbbells(
                "Dumbbells", 80,
                1200, "Gray",
                "dumbbellsLifting", MusclesGroup.HANDS, 10
        );

        input = new ArrayList<>();
        input.add(pressTrainingSimulator);
        input.add(barbell);
        input.add(racetrack);
        input.add(dumbbells);
        manager = new TrainerImpl();
    }

    @AfterEach
    void cleanUp() {
        input.clear();
    }

    @Test
    void testSortByPrice() {
        List<Simulators> actual = this.manager.sortByPrice(input, false);
        for (int i = 1; i < actual.size(); i++) {
            assertTrue(actual.get(i - 1).getPrice() < actual.get(i).getPrice(),
                    "Sorting by price doesn't work correctly");
        }
    }

    @Test
    void testSortByPriceReversed() {
        List<Simulators> actual = this.manager.sortByPrice(input, true);
        for (int i = 1; i < actual.size(); i++) {
            assertTrue(actual.get(i - 1).getPrice() > actual.get(i).getPrice(),
                    "Sorting by price doesn't work correctly");
        }
    }

    @Test
    void testSortByExerciseDuration() {
        List<Simulators> actual = this.manager.sortByExerciseDuration(input, false);
        for (int i = 1; i < actual.size(); i++) {
            assertTrue(actual.get(i - 1).getExerciseDuration() < actual.get(i).getExerciseDuration(),
                    "Sorting by price doesn't work correctly");
        }
    }

    @Test
    void testSortByExerciseDurationReversed() {
        List<Simulators> actual = this.manager.sortByExerciseDuration(input, true);
        for (int i = 1; i < actual.size(); i++) {
            assertTrue(actual.get(i - 1).getExerciseDuration() > actual.get(i).getExerciseDuration(),
                    "Sorting by price doesn't work correctly");
        }
    }
}

