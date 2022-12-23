package DesignPattern.stratagyDesignPattern;

import DesignPattern.stratagyDesignPattern.strategy.NormalDriveStrategy;

public class NormalVehicle extends Vehicle{
    NormalVehicle(){
    super(new NormalDriveStrategy()) ;   
    }
}
