package org.example.WithStrategyPattern.Strategy;

public class SportsDriveStrategy implements DriveStrategy {
    @Override
    public void drive(){
        System.out.print("Sports drive capability");
    }
}
