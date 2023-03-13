package teacher.lesson_8_inheritance.lessoncode.inheritance;

public abstract class Car {

    private String brand;
    private int currentSpeed;
    private int year;
    private CarType carType;
    private boolean isEngineOn;

    public Car(String brand, int currentSpeed, int year, CarType carType) {
        this.brand = brand;
        this.currentSpeed = currentSpeed;
        this.year = year;
        this.carType = carType;
    }

    abstract public void startEngine();

    public void accelerate() {
        this.currentSpeed++;
    }
    public void decelerate() {
        this.currentSpeed--;
    }

    public boolean isEngineOn() {
        return isEngineOn;
    }

    public void setEngineOn(boolean engineOn) {
        isEngineOn = engineOn;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }
}
