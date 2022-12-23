package DesignPattern.stratagyDesignPattern.strategy;

public class SportMotorStrategy implements DriveStrategy {

    @Override
    public void drive() {        
        System.out.println("This is sports motor strategy");
    }
    
}
