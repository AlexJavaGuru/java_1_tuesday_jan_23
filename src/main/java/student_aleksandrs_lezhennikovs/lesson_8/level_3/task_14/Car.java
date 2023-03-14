package student_aleksandrs_lezhennikovs.lesson_8.level_3.task_14;

abstract class Car {

    abstract void accelerate();

}

class ElectricCar extends Car {

    private int batteryCharge;

    @Override
    public void accelerate() {

    }
}

class PetrolCar extends Car {

    private double petrolTankCapacity;

    @Override
    public void accelerate() {

    }
}