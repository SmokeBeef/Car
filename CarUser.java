package car;


public class CarUser {
    
    private Car car;
    
    public CarUser (Car car){
        this.car = car;
    }
    void turnOnEngine(){
        this.car.engineOn();
    }
    void turnOffEngine(){
        this.car.engineOff();
    }
    void increaseSpeed(){
        this.car.increaseSpd();
    }
    void decreaseSpeed(){
        this.car.decreaseSpd();
    }
    
}
