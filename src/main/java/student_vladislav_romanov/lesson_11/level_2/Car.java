package student_vladislav_romanov.lesson_11.level_2;

public class Car extends Vehicle {
    private String color;

    Car(String brand, String model, String color) {
        super(brand, model);
        this.color = color;
    }

    public void drive() {
        System.out.println("Driving a " + color + " " + brand + " " + model);
    }
}
