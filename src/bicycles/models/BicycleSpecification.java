package bicycles.models;

public class BicycleSpecification {


    //Define two properties for acceleration and Breaks
    private int accelerationSpeed;
    private int brake;

    //define a constructor to be able to call instance of BicycleSpecs
   public BicycleSpecification(int accelerationSpeed, int brake){
       this.accelerationSpeed = accelerationSpeed;
       this.brake = brake;
    }

    //Define two getter method for acceleration and bake
    public int getAccelerationSpeed() {
        return accelerationSpeed;
    }

    public int getBrake() {
        return brake;
    }
}
