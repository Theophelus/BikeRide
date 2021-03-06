package bicycles.rides;

import bicycles.Bicycle;
import bicycles.BikeRide;

public class FastRide implements BikeRide {

    //Define an instance of Bicycle interface
    private final Bicycle bicycle;
    //Define a constructor that will take Bicycle interface and a parameter

    public FastRide(Bicycle bicycle){
        this.bicycle = bicycle;
    }

    @Override
    public void ride() {
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
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
