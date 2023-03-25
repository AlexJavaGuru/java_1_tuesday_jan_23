package student_andrejs_cekalins.lesson_10.level_1.Task_2;

import java.util.ArrayList;
import java.util.List;

class Car {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        String bmw = "BMW";
        String toyota = "Toyota";
        String honda = "Honda";
        cars.add(bmw);
        cars.remove(toyota);
        cars.add(honda);
    }
}
