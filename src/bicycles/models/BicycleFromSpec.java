package bicycles.models;

public class BicycleFromSpec extends BicycleBase {


    private final BicycleSpecification bikeSpecs;

    //Define BicycleFromSpec constructor and pass BicycleSpecification and an Argument
    public BicycleFromSpec(BicycleSpecification bikeSpecs){

        this.bikeSpecs = bikeSpecs;
    }

    @Override
    public void accelerate() {
        this.bikeSpecs.getAccelerationSpeed();
    }

    @Override
    public void brake() {
        this.bikeSpecs.getBrake();

    }
}
