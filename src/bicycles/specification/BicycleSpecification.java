package bicycles.specification;

import bicycles.BicycleType;

public class BicycleSpecification {

    //Define an instance of an enum
    private final BicycleType bicycleType;
    //Define two properties for acceleration and Breaks
    private int accelerationSpeed;
    private int brakeSpeed;

    //define a constructor to be able to call instance of BicycleSpecs
   public BicycleSpecification(int accelerationSpeed, int brakeSpeed, BicycleType bicycleType){
       this.accelerationSpeed = accelerationSpeed;
       this.brakeSpeed = brakeSpeed;
       this.bicycleType = bicycleType;
    }

    //defining a get method for enum.
    public BicycleType getBicycleType() {
        return bicycleType;
    }

    //Define two getter method for acceleration and bake
    public int getAccelerationSpeed() {
        return accelerationSpeed;
    }

    public int getBrake() {
        return brakeSpeed;
    }
}
