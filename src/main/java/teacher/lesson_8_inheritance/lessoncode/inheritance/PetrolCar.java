package teacher.lesson_8_inheritance.lessoncode.inheritance;

import teacher.lesson_8_inheritance.lessoncode.inheritance.Car;
import teacher.lesson_8_inheritance.lessoncode.inheritance.CarType;

public class PetrolCar extends Car {

    private int fuelLevel;

    public PetrolCar(String brand, int currentSpeed, int year, CarType carType, int fuelLevel) {
        super(brand, currentSpeed, year, carType);
        this.fuelLevel = fuelLevel;
    }

    @Override
    public void startEngine() {
        if (fuelLevel > 0) {
            System.out.println("We have some fuel left, let's have a ride!");
            setEngineOn(true);
        } else {
            System.out.println("Fuel tank is empty...");
        }
    }
}
