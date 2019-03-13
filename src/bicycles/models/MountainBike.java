package bicycles.models;


public class MountainBike extends BicycleBase { //Inherits all methods and properties for BicycleBase

//    int speed = 0;

    @Override
    public void accelerate() {
        this.changeSpeed(5);
    }

    @Override
    public void brake() {
        this.changeSpeed(-3);
    }
}
