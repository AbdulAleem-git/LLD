package DesignPattern.stratagyDesignPattern;

import DesignPattern.stratagyDesignPattern.strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy strategy;
    Vehicle(DriveStrategy strategy){
        this.strategy = strategy;
    }
    public void drive(){
        strategy.drive();
    }

}
