package teacher.lesson_7_encapsulation.lessoncode.objectsequality;

public class CarDemo {

    public static void main(String[] args) {

        Car bmwOne = new Car("BMW", "X6", 2022);
        Car bmwTwo = new Car("BMW", "X6", 2022);
        Car kia = new Car("KIA", "Sportage", 2016);

        if (bmwOne.equals(bmwTwo)) {
            System.out.println("They Are Equal");
        }

        System.out.println(kia);
    }
}
