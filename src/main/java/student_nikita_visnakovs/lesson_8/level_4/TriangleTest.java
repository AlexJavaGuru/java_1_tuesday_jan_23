package student_nikita_visnakovs.lesson_8.level_4;

public class TriangleTest {

    public static void main(String[] args) {
        TriangleTest tester = new TriangleTest();
        tester.calculateAreaTest();
        tester.calculatePerimeterTest();
    }

    public void calculateAreaTest(){
        Triangle triangle = new Triangle("Triangle" , 4);
        double expectedResult = 6.928203230275509;
        double actualResult = triangle.calculateArea();
        checkResult(expectedResult, actualResult, "Calculate area test");


    }
    public void calculatePerimeterTest(){
        Triangle triangle = new Triangle("Triangle" , 5);
        double expectedResult = 15;
        double actualResult = triangle.calculatePerimeter();
        checkResult(expectedResult , actualResult, "Calculate perimeter test");
    }
    public void checkResult (double expectedResult, double actualResult , String testName){
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed!!!");
        } else {
            System.out.println(testName + " filed!!!");
        }
    }
}
