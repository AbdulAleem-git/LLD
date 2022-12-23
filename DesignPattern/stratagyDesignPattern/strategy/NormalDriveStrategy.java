package DesignPattern.stratagyDesignPattern.strategy;

public class NormalDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
       System.out.println("this is a normal drive strategy");
    }
    
}
