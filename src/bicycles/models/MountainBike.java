package bicycles.models;


import bicycles.BicycleBase;
import bicycles.BicycleType;

public class MountainBike extends BicycleBase {

    @Override
    public BicycleType bicycle() {
        return BicycleType.MountainBike;
    }

    @Override
    public void accelerate() {
        this.changeSpeed(5);
    }

    @Override
    public void brake() {
        this.changeSpeed(-3);
    }

}
