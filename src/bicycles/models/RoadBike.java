package bicycles.models;

import bicycles.Bicycle;

public abstract class RoadBike implements Bicycle {

     int speed = 0;

    public void accelerate() {
        speed += 11;
    }


    public void brake() {
        speed -=  4;
    }
}
