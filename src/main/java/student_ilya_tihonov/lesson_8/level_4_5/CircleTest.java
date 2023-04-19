package student_ilya_tihonov.lesson_8.level_4_5;

public class CircleTest {

    public static void main(String[] args) {
        CircleTest test = new CircleTest();
            test.testCalculateArea();
            test.testPerimeterCount();
    }

    void testCalculateArea() {
        Circle circle = new Circle(3.0, "Circle");
        double expected = Math.PI * Math.pow(3.0, 2);
        double actual = circle.calculateArea();
        if (expected == actual) {
            System.out.println("testCalculateArea passed");
        } else {
            System.out.println("testCalculateArea failed");
        }
    }

    void testPerimeterCount() {
        Circle circle = new Circle(3.0, "Circle");
        double expected = 2 * Math.PI * 3.0;
        double actual = circle.perimeterCount();
        if (expected == actual) {
            System.out.println("testPerimeterCount passed");
        } else {
            System.out.println("testPerimeterCount failed");
        }
    }



}
