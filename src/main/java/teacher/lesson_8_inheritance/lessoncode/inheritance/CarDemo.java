package teacher.lesson_8_inheritance.lessoncode.inheritance;

import java.util.Arrays;

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

        int[] numbers = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        System.out.println(electricCar.getCurrentSpeed());
        System.out.println(petrolCar.getCurrentSpeed());
    }
}
