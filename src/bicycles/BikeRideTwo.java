package bicycles;

public class BikeRideTwo implements BikeRide  {

    //Define an instance of Bicycle interface
    private final Bicycle bicycle;
    //Define a constructor that will take Bicycle interface and a parameter

    public BikeRideTwo(Bicycle bicycle){
        this.bicycle = bicycle;
    }

    @Override
    public void ride() {
        this.bicycle.accelerate();
    }

    @Override
    public int getCurrentSpeed() {
        return 0;
    }
}
