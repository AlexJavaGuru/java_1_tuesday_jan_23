package student_andrejs_cekalins.lesson_8.level_3.Task_14;

abstract class Car {
    abstract void accelerate();
}
class ElectricCar extends Car {

    private int batteryCharge;


    @Override
    void accelerate() {

    }
}

class PetrolCar extends Car {

    private double petrolTankCapacity;

    @Override
    void accelerate() {

    }
}


