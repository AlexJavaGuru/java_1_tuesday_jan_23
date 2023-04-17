package student_anastasiia_bokareva.lesson8.level4;

public class SquareTest {
    public static void main(String[] args) {
        SquareTest test = new SquareTest();
        test.calculateArea();
        test.calculatePerimetr();
    }

    public void calculateArea(){
        Square square = new Square(5);
        double area = square.calculateArea();
        double expect = 25;
        check(expect,area,"Area ");

    }
    public void calculatePerimetr(){
        Square square = new Square(5);
        double area = square.calculatePerimetr();
        double expect = 20 ;
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
