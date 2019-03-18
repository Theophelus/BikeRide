package bicycles;

public interface Bicycle {

    BicycleType bicycle();
    void accelerate();
    void brake();
    int currentSpeed();
    void stop();
}
