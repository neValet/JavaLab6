package ua.lviv.iot.gym.models;

import ua.lviv.iot.gym.enums.MusclesGroup;

public class Racetrack extends Simulators {

    private int speed;

    public Racetrack() {

    }

    public Racetrack(String name, double price, int exerciseDuration,
                     String colour, String exercise,
                     MusclesGroup musclesGroup, int speed) {
        super(name, price, exerciseDuration, colour, exercise, musclesGroup);
        this.speed = speed;
    }

    @Override
    public String getHeaders() {

        return super.getHeaders() + ", speed";
    }

    @Override
    public String toCSV() {

        return super.toCSV() + ", " + getSpeed();
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}


