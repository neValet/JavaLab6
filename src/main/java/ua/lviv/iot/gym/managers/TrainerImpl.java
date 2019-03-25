package ua.lviv.iot.gym.managers;

import ua.lviv.iot.gym.models.*;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class TrainerImpl implements Trainer {


    public TrainerImpl() {
    }

    @Override
    public final List<Simulators> sortByPrice(List<Simulators> simulators, final boolean reverse) {

        return getSimulators(simulators, reverse, Comparator.comparing(Simulators::getPrice));
    }

    @Override
    public final List<Simulators> sortByExerciseDuration(List<Simulators> simulators, final boolean reverse) {

        return getSimulators(simulators, reverse, Comparator.comparing(Simulators::getExerciseDuration));
    }

    private List<Simulators> getSimulators(List<Simulators> simulators, boolean reverse, Comparator<Simulators> comparing) {
        if (reverse) {
            Collections.sort(simulators, comparing.reversed());
        } else {
            Collections.sort(simulators, comparing);
        }
        return simulators;
    }
}



