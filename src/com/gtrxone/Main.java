package com.gtrxone;

public class Main {

    public static void main(String[] args) {
        Car car = new Car(0, 45, 5, 5, "5 speed manual transmission");
        NissanGTRNismo nissanGTRNismo = new NissanGTRNismo(0,true,"",329);

        car.moving(55,56);
        car.accelerate(100,10);
        car.stopMoving();

        nissanGTRNismo.accelerate(200,12);
    }
}
