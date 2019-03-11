package bicycles.models;

import bicycles.Bicycle;

public class MountainBike extends BicycleBase {

    int speed = 0;

    @Override
    public void accelerate() {
        this.changeSpeed(speed += 5);
    }

    @Override
    public void brake() {
        this.changeSpeed(speed -= 3);
    }
}
