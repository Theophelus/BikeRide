package bicycles.models;

import bicycles.Bicycle;

abstract class BicycleBase implements Bicycle {
    private int speed = 0;

    protected void changeSpeed(int speed){
        this.speed += speed;

    }

    @Override
    public int currentSpeed() {
        return speed;
    }

    @Override
    public void stop() {
        speed = 0;
    }
}
