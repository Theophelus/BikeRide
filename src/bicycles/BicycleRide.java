package bicycles;

//import bicycles.models.RoadBike;

public class BicycleRide
{
    //define a field/instance of Bicycle class
    private final Bicycle bicycle;
    /*
    Define a constructor to use ti be able to create an instance of Bicycle class.
    that take bicycle class and parameter and
    pass it an an argument inside Object of BicycleRide.
    call that class with ride method.
     */

    public BicycleRide(Bicycle bicycle){
        this.bicycle = bicycle;
//        BicycleRide bikeRide = new BicycleRide(bicycle);// pass bicycle instance as s argument in Bicycle constructor
//        bikeRide.ride();
    }

    //define a method ride to be able to access other methods in Bicycle class
    public void ride() {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
    }


    //define a method to get
    public int getCurrentSpeed (){
        return this.bicycle.currentSpeed();
    }
}



