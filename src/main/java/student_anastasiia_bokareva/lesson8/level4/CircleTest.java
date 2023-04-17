package student_anastasiia_bokareva.lesson8.level4;

public class CircleTest {
    public static void main(String[] args) {
        CircleTest test = new CircleTest();
        test.calculateArea();
        test.calculatePerimetr();
    }
    public  void calculateArea(){
        Circle circle = new Circle(3);
        double realResult = circle.calculateArea();
        double expectedResult =28.274333882308138;
        check(realResult,expectedResult,"Area ");
    }
    public  void calculatePerimetr(){
        Circle circle = new Circle(3);
        double realResult = circle.calculatePerimetr();
        double expectedResult =18.84955592153876;
        check(realResult,expectedResult,"Perimetr ");
    }

    public void check(double realResult, double expectedResult, String testName){
        if (realResult==expectedResult){
            System.out.println("Test "+ testName + "is ok");
        } else {
            System.out.println("Test "+ testName+ " is fail");
        }
    }

}
