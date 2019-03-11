package bicycles.models;

//import bicycles.Bicycle;

public class RoadBike extends BicycleBase {
    int speed = 0;
    @Override
    public void accelerate() {
        this.changeSpeed(this.speed += 11);
    }

    @Override
    public void brake() {
        this.changeSpeed(this.speed -= 4);
    }


}
