package ua.lviv.iot.gym.managers;

import ua.lviv.iot.gym.models.Simulators;

import java.util.List;

public interface Trainer {

    List<Simulators> sortByExerciseDuration(List<Simulators> simulators, boolean reverse);

    List<Simulators> sortByPrice(List<Simulators> simulators, boolean reverse);

}
