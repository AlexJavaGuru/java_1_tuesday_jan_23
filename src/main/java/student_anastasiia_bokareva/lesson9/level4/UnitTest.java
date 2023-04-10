package student_anastasiia_bokareva.lesson9.level4;

public class UnitTest {
    public static void main(String[] args) {
        UnitTest test = new UnitTest();
        test.checkFahrenheitDegrees();
        test.checkKelvinDegrees();

    }

    public void checkFahrenheitDegrees(){
        FahrenheitConverter converter = new FahrenheitConverter();
        double fahrenheitDegree = converter.convert(23);
        double expectedResult = 73.4;
        check(fahrenheitDegree,expectedResult,"Fahrenheit");

    }
    public void checkKelvinDegrees(){
        KelvinConverter converter = new KelvinConverter();
        double realResult = converter.convert(23);
        double expectedResult = 296.15;
        check(realResult,expectedResult,"Kelvin");
    }

    public void check (double expectedResult, double realResult, String testName){
        if (expectedResult==realResult){
            System.out.println("Test "+ testName + " is ok!");
        } else {
            System.out.println("Test "+ testName+ " is fail!");
        }
    }
}
