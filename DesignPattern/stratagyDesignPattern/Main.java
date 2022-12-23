package DesignPattern.stratagyDesignPattern;

import DesignPattern.stratagyDesignPattern.strategy.SportMotorStrategy;

public class Main {
   public static void main(String[] args) {
       Vehicle v = new NormalVehicle();
       v.drive();
   } 
}
