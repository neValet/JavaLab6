package ua.lviv.iot.gym.models;

import ua.lviv.iot.gym.enums.MusclesGroup;
import ua.lviv.iot.gym.enums.PressParts;

public class PressTrainingSimulator extends Simulators {

    private PressParts pressParts;

    public PressTrainingSimulator() {

    }

    public PressTrainingSimulator(String name, double price,
                                  int exerciseDuration, String colour,
                                  String exercise,
                                  MusclesGroup musclesGroup,
                                  PressParts pressParts) {
        super(name, price, exerciseDuration, colour, exercise, musclesGroup);
        this.pressParts = pressParts;
    }

    @Override
    public String getHeaders() {

        return super.getHeaders() + ", pressParts";
    }

    @Override
    public String toCSV() {

        return super.toCSV() + ", " + getPressParts();
    }

    public PressParts getPressParts() {
        return pressParts;
    }

    public void setPressParts(PressParts pressParts) {
        this.pressParts = pressParts;
    }
}
