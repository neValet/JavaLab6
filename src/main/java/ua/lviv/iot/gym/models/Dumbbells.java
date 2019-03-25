package ua.lviv.iot.gym.models;

import ua.lviv.iot.gym.enums.MusclesGroup;

public class Dumbbells extends Simulators {
    private double weight;

    public Dumbbells() {

    }

    public Dumbbells(String name, double price, int exerciseDuration,
                     String colour, String exercise, MusclesGroup
                             musclesGroup, double weight) {
        super(name, price, exerciseDuration, colour, exercise, musclesGroup);
        this.weight = weight;
    }

    @Override
    public String getHeaders() {

        return super.getHeaders() + ", weight";
    }

    @Override
    public String toCSV() {

        return super.toCSV() + ", " + getWeight();
    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
