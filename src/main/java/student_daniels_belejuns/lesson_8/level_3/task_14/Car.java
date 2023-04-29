package student_daniels_belejuns.lesson_8.level_3.task_14;

abstract class Car {

    abstract void accelerate();

}

class ElectricCar extends Car {

    private int batteryCharge;

    public void accelerate() {

    }
}

class PetrolCar extends Car {

    private double petrolTankCapacity;

    public void accelerate() {

    }
}
