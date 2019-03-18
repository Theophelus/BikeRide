package bicycles.models;

//import bicycles.Bicycle;

import bicycles.BicycleType;

public class RoadBike extends BicycleBase { //Inherits all methods and properties for BicycleBase

    @Override
    public void accelerate() {
        this.changeSpeed(11);
    }
    @Override
    public void brake() {
        this.changeSpeed(-4);
    }

    @Override
    public BicycleType getBicycleType() {
        return BicycleType.RoadBike;
    }
}
