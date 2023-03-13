package teacher.lesson_8_inheritance.lessoncode.inheritance;

public class CarDemo {

    public static void main(String[] args) {
        Car[] cars = new Car[2];
        Car electricCar = new ElectricCar("Tesla", 0, 2023, CarType.HATCH_BACK, 0);

        Car petrolCar = new PetrolCar("BMW", 0, 2023, CarType.SEDAN, 0);

        cars[0] = electricCar;
        cars[1] = petrolCar;

        for (Car car : cars) {
            car.startEngine();
        }

        System.out.println(electricCar.getCurrentSpeed());
        System.out.println(petrolCar.getCurrentSpeed());
    }
}
