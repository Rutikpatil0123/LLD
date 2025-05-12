package org.example.WithStrategyPattern;

import org.example.WithStrategyPattern.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveObject;

    Vehicle(DriveStrategy driveobj){
        this.driveObject = driveobj;
    }

    public void drive(){
        driveObject.drive();
    }
}
