package student_konstantin_kudrjavtsev.lesson_3_oop_first_look.homework.level_4_junior;

public class CarDemo {
    public static void main(String[] args) {
        Car myCar = new Car("Nissan");
        String carModel = myCar.getModel();
        System.out.println("Car model = " + carModel);
    }
}
