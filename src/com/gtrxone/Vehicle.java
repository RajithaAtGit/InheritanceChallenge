package com.gtrxone;

public class Vehicle {
    private String name;
    private int speed; // Kph
    private int direction;

    public Vehicle(String name, int speed, int direction) {
        this.name = name;
        this.speed = speed;
        this.direction = direction;
    }

    public void moving(int speed) {
        this.speed = speed;
        if (this.speed <=0){
            System.out.println("Vehicle stop moving");
        }else
        System.out.println("Vehicle moving at " + speed + "kph speed");

    }

    public void moving(int speed, int direction) {
        this.direction = direction;
        this.speed = speed;
        if (this.speed > 0){
            System.out.println("Vehicle stop moving");
        }
        System.out.println("Vehicle moving at " + speed + " speed to ward " + direction + " degree angle");

    }

    //acceleration in Km/h^2
    public void accelerate(int acceleration, int time) {
        int speedBeforeAcceleration = speed;
        int currentSpeed = speed + (acceleration * time);
        System.out.println(speedBeforeAcceleration + " kph to " + currentSpeed + " kph in " + time + " min");
        this.speed = currentSpeed;
    }


    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDirection() {
        return direction;
    }
}