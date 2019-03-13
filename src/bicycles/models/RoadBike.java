package bicycles.models;

//import bicycles.Bicycle;

public class RoadBike extends BicycleBase { //Inherits all methods and properties for BicycleBase
    @Override
    public void accelerate() {
        this.changeSpeed(11);
    }

    @Override
    public void brake() {
        this.changeSpeed(-4);
    }
}
