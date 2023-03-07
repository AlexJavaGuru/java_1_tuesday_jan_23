package teacher.lesson_8_inheritance.lessoncode.inheritance;

import teacher.lesson_8_inheritance.lessoncode.inheritance.Car;
import teacher.lesson_8_inheritance.lessoncode.inheritance.CarType;

public class ElectricCar extends Car {

    private int batteryCapacity;

    public ElectricCar(String brand, int currentSpeed, int year, CarType carType, int batteryCapacity) {
        super(brand, currentSpeed, year, carType);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void startEngine() {
        if (batteryCapacity > 0) {
            System.out.println("I have a battery capacity! Let's goooo");
            setEngineOn(true);
        } else {
            System.out.println("Plug me in...");
        }
    }

}
