package bicycles.models;

import bicycles.BicycleType;

public class BicycleFromSpec extends BicycleBase {


    private final BicycleSpecification bikeSpecs;

    //Define BicycleFromSpec constructor and pass BicycleSpecification and an Argument
    public BicycleFromSpec(BicycleSpecification bikeSpecs){

        this.bikeSpecs = bikeSpecs;
    }


    @Override
    public BicycleType bicycle() {
        return this.bikeSpecs.getBicycleType();
    }

    @Override
    public void accelerate() {
        changeSpeed(this.bikeSpecs.getAccelerationSpeed());
        //        bikeSpecs.getAccelerationSpeed();
    }

    @Override
    public void brake() {
        changeSpeed(this.bikeSpecs.getBrake());

    }


}
