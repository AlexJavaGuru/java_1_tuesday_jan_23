package student_nikita_visnakovs.lesson_3.level_7;

public class CarDemo {

    public static void main(String[] args) {

        Car myCar = new Car("Black", "Audi", "Petrol");

        myCar.start();
        myCar.stop();
        myCar.setColour("Black");
        myCar.setNewColour("Gray");
        myCar.fillTheCar();

    }
}
