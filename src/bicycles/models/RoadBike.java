package bicycles.models;

//import bicycles.Bicycle;

import bicycles.Bicycle;

public class RoadBike extends BicycleBase implements Bicycle {


    @Override
    public void accelerate() {
        speed += 11;
    }

    @Override
    public void brake() {
        speed -=  4;
    }

    
}
