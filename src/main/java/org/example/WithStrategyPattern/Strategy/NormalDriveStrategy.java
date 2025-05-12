package org.example.WithStrategyPattern.Strategy;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive(){
        System.out.print("normal drive Strategy");
    }
}
