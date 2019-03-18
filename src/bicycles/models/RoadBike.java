package bicycles.models;

//import bicycles.Bicycle;

import bicycles.BicycleType;

public class RoadBike extends BicycleBase { //Inherits all methods and properties for BicycleBase

    @Override
    public BicycleType bicycle() {
        return BicycleType.RoadBike;
    }

    @Override
    public void accelerate() {
        this.changeSpeed(11);
    }
    @Override
    public void brake() {
        this.changeSpeed(-4);
    }

}