package bicycles.models;

import bicycles.Bicycle;

public abstract class BicycleBase implements Bicycle {
    protected int speed;

    protected void changeSpeed(int speed){ //This method it defined to control speed speed of a Bicycle coz they not run the same
        this.speed += speed;
    }

    @Override
    public int currentSpeed() { //return current speed of each Bike.
        return speed;
    }

    @Override
    public void stop() {
        speed = 0;
    }
}
