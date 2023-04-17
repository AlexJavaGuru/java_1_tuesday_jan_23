package student_anastasiia_bokareva.lesson8.level3.task14;

abstract class Car {

    abstract void accelerate();

}

class ElectricCar extends Car {

    private int batteryCharge;

    public void accelerate(){

    }
}

class PetrolCar extends Car {

    private double petrolTankCapacity;

    public void accelerate(){

    }
}