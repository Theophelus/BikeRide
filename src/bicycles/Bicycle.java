package bicycles;

public interface Bicycle {

    BicycleType getBicycleType();
    void accelerate();
    void brake();
    int currentSpeed();
    void stop();
}
