package bicycles;

public class BikeRideThree implements BikeRide {
    //Define an instance of Bicycle interface

    private final Bicycle bicycle;

    //Define an constructor for BikeRideThree
    public BikeRideThree(Bicycle bicycle){
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
