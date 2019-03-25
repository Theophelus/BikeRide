package bicycles.rides;

import bicycles.Bicycle;
import bicycles.BikeRide;

public class SlowRide implements BikeRide {
    //Define an instance of Bicycle interface

    private final Bicycle bicycle;

    //Define an constructor for SlowRide
    public SlowRide(Bicycle bicycle){
        this.bicycle = bicycle;

    }

    @Override
    public void ride() {
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
    }

    @Override
    public int getCurrentSpeed() {
        return this.bicycle.currentSpeed();
    }
}
