package com.gtrxone;

public class Car extends Vehicle {
    private int wheels;
    private int doors;
    private int numberOfEngine;
    private String transmission;

    public Car(int speed, int direction, int wheels, int doors, String transmission) {
        super("Car", speed, direction);
        this.wheels = wheels;
        this.doors = doors;
        this.numberOfEngine = 1;
        this.transmission = transmission;
    }

    public void stopMoving() {
        System.out.println("Car->Stop called and car stop moving");
        super.moving(0);
    }

    @Override
    public void accelerate(int acceleration, int time) {

        int speedLimitCheck = getSpeed() + acceleration * time;
        if (speedLimitCheck <= 508) {
            super.accelerate(acceleration, time);
        } else {
            int oldSpeed = getSpeed();
            moving(508);
            System.out.println(oldSpeed + " kph " + getSpeed() + " kph  in " + time + " seconds");
            System.out.println("Warning !!!! Reach Max speed.");
        }
    }
}