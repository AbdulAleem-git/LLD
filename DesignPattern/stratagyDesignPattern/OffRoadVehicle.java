package DesignPattern.stratagyDesignPattern;

import DesignPattern.stratagyDesignPattern.strategy.SportMotorStrategy;

public class OffRoadVehicle extends Vehicle {
    OffRoadVehicle(){ super(new SportMotorStrategy());}
}
