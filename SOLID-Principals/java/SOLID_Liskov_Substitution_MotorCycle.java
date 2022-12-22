package java;
interface Bike{
    void turnOnEngine();
    void accelerate();
}

public class SOLID_Liskov_Substitution_MotorCycle implements Bike {

    boolean isEngineOn;
    int speed;
    @Override
    public void turnOnEngine() {
      // turn on engine
      isEngineOn = true;
        
    }

    @Override
    public void accelerate() {
        // increase speed 
        speed = speed + 10;
        
    }
        
}
// this is violating the Liskove _ substitiution 
// According to LS every subclass should extend the capability of the parent class not narrow down 
class Cycle extends SOLID_Liskov_Substitution_MotorCycle{

    @Override
    public void turnOnEngine() {
       throw new AssertionError("there is no engine");
        
    }

    @Override
    public void accelerate() {
       // do something
        
    }
    
}

