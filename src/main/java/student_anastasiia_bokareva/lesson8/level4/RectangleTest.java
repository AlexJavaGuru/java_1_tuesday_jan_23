package student_anastasiia_bokareva.lesson8.level4;

public class RectangleTest {
    public static void main(String[] args) {
        RectangleTest test = new RectangleTest();
        test.calculatePerimetr();
        test.calculateArea();
    }
    public void calculateArea(){
        Rectangle rectangle = new Rectangle(2,4);
        double area = rectangle.calculateArea();
        double expect = 8;
        check(expect,area,"Area ");

    }
    public void calculatePerimetr(){
        Rectangle rectangle = new Rectangle(2,4);
        double area = rectangle.calculatePerimetr();
        double expect = 12;
        check(expect,area,"Perimetr ");
    }
    public void check(double realResult, double expectedResult, String testName){
        if (realResult==expectedResult){
            System.out.println("Test "+ testName + "is ok");
        } else {
            System.out.println("Test "+ testName+ " is fail");
        }
    }
}
