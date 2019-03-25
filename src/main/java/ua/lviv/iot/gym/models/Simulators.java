package ua.lviv.iot.gym.models;

import ua.lviv.iot.gym.enums.MusclesGroup;

public class Simulators {
    private String name;
    private double price;
    private int exerciseDuration;
    private String colour;
    private String exercise;
    private MusclesGroup musclesGroup;

    public Simulators() {

    }

    public Simulators(String name, double price, int exerciseDuration,
                      String colour, String exercise,
                      MusclesGroup musclesGroup) {
        this.name = name;
        this.price = price;
        this.exerciseDuration = exerciseDuration;
        this.colour = colour;
        this.exercise = exercise;
        this.musclesGroup = musclesGroup;
    }

    public String getHeaders() {
        return "name, price, exerciseDuration, colour, exercise, musclesGroup";
    }

    public String toCSV() {
        return getName() + ", " + getPrice() + ", " + getExerciseDuration() +
                ", " + getColour() + ", " +
                getExercise() + ", " + getMusclesGroup();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getExerciseDuration() {
        return exerciseDuration;
    }

    public void setExerciseDuration(int exerciseDuration) {
        this.exerciseDuration = exerciseDuration;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getExercise() {
        return exercise;
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
    }

    public MusclesGroup getMusclesGroup() {
        return musclesGroup;
    }

    public void setMusclesGroup(MusclesGroup musclesGroup) {
        this.musclesGroup = musclesGroup;
    }

}
