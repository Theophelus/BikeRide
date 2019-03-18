package bicycles.models;

import bicycles.BicycleType;

public class BicycleSpecification {

    //Define an instance of an enum
    private final BicycleType bicycleType;
    //Define two properties for acceleration and Breaks
    private int accelerationSpeed;
    private int brake;

    //define a constructor to be able to call instance of BicycleSpecs
   public BicycleSpecification(int accelerationSpeed, int brake, BicycleType bicycleType){
       this.accelerationSpeed = accelerationSpeed;
       this.brake = brake;
       this.bicycleType = bicycleType;
    }

    //defining a get method for enum.
    public BicycleType getBicycleType() { return bicycleType; }

    //Define two getter method for acceleration and bake
    public int getAccelerationSpeed() {
        return accelerationSpeed;
    }


    public int getBrake() {
        return brake;
    }
}
