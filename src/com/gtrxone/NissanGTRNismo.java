package com.gtrxone;

public class NissanGTRNismo extends Car {
    private boolean is4WD = true;
    private String engineName;
    private int maxSpeed;


    public NissanGTRNismo(int direction, boolean is4WD, String engineName, int maxSpeed) {
        super(0, direction, 5, 3, "six-speed dual-clutch automatic transmission");
        this.is4WD = is4WD;
        this.engineName = (engineName.isEmpty() ? "3.8-liter twin-turbocharged V6" : engineName);
        if (maxSpeed <= 508) {
            this.maxSpeed = maxSpeed;
        }

    }

    public void displayCurrentGear(int acceleration, int time) {
        accelerate(acceleration, time);
        if (getSpeed() > 0 && getSpeed() <= 60) {
            System.out.println("in second gear");
        } else if (getSpeed() > 60 && getSpeed() <= 90) {
            System.out.println("in third gear");
        } else if (getSpeed() > 90 && getSpeed() <= 120) {
            System.out.println("in forth gear");
        } else if (getSpeed() > 120 && getSpeed() <= 160) {
            System.out.println("in fifth gear");
        } else if (getSpeed() > 160 && getSpeed() <= 203) {
            System.out.println("in sixth gear");
        }
    }

    public void displaySpeed() {
        System.out.println(getSpeed());
    }

    @Override
    public void accelerate(int acceleration, int time) {
        int speedLimitCheck = getSpeed() + acceleration * time;
        if (speedLimitCheck < maxSpeed+1) {
            super.accelerate(acceleration, time);
        }else{
            moving(maxSpeed);
        }

    }

    public void stopMoving(int deceleration, int time) {
        if (getSpeed() - deceleration * time == 0) {
            super.stopMoving();
            System.out.println("GTR stop moving");
        }
    }

    public boolean isIs4WD() {
        return is4WD;
    }

    public String getEngineName() {
        return engineName;
    }
}