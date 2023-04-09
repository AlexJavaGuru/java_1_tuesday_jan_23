package student_oksana_tarasova.lesson_8.level_4;

public class CircleTest {

    public static void main(String[] args) {
        CircleTest test = new CircleTest();
        test.calculateAreaTest();
        test.calculatePerimeterTest();
    }

   public void calculateAreaTest () {
        Circle circle = new Circle("circle", 3);
        double expectedResult = 28.26;
        double realResult = circle.calculateArea();
        check(expectedResult == realResult, "circle area");
   }

    public void calculatePerimeterTest () {
        Circle circle = new Circle("circle", 3);
        double expectedResult = 18.84;
        double realResult = circle.calculatePerimeter();
        check(expectedResult == realResult, " circle perimeter");
    }

    public void check(boolean state, String nameTest) {
        if (state) {
            System.out.println(nameTest + " = ok");
        } else {
            System.out.println(nameTest + " = fail");
        }
    }


}
