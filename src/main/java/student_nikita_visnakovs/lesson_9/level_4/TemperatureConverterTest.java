package student_nikita_visnakovs.lesson_9.level_4;

public class TemperatureConverterTest {

    public static void main(String[] args) {
        TemperatureConverterTest tester = new TemperatureConverterTest();
        tester.kelvinTemperatureTest();
        tester.testFahrenheitConverter();
    }

    public void kelvinTemperatureTest() {
        TemperatureConverter converter = new KelvinConverter();
        double celsius = 10;
        double expectedResult = 283.15;
        double actualResult = converter.convert(celsius);
        checkResult(expectedResult, actualResult,"Kelvin temperature test");
    }

    public void testFahrenheitConverter() {
        TemperatureConverter converter = new FahrenheitConverter();
        double celsius = 10;
        double expectedResult = 50;
        double actualResult = converter.convert(celsius);
        checkResult(expectedResult, actualResult,"Fahrenheit temperature test");
    }
    private void checkResult(double expectedResult, double actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed!!!");
        } else {
            System.out.println(testName + " failed!!!");
        }
    }
}
