package bicycles.models;

import bicycles.BicycleType;

public class Tandem extends BicycleBase {


    @Override
    public BicycleType bicycle() {
        return BicycleType.Tandem;
    }

    @Override
    public void accelerate() {
        changeSpeed(12);
    }

    @Override
    public void brake() {
    changeSpeed(-7);
    }
}
