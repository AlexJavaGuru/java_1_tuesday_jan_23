package student_anastasiia_bokareva.lesson8.level4;

public class TriangleTest {
    public static void main(String[] args) {
        TriangleTest test = new TriangleTest();
        test.calculateArea();

    }
    public void calculateArea(){
        Triangle triangle = new Triangle(5);
        double area = triangle.calculateArea();
        double expect = 10.82;
        check(expect,area,"Area");

    }
    public void check(double realResult, double expectedResult, String testName){
        if (realResult==expectedResult){
            System.out.println("Test "+ testName + "is ok");
        } else {
            System.out.println("Test "+ testName+ " is fail");
        }
    }
}
