package bicycles;

public class Bicycle {

//  define a variable called speed
    private int speed = 0;

    //Define a method called acceleration
    public int accelerate(){
        speed += 5;
        return speed;
    }

    //Define a method called acceleration
    public void brake(){speed -= 3;}

    //Define a method called acceleration
    public int currentSpeed(){ return speed; }
    //Define a method called acceleration
    public void stop(){ speed = speed + 0; }
}
