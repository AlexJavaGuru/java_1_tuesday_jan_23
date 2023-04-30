package student_julija_raudive.lesson_9.level_4;

class TemperatureConverterTest {


    public static void main(String[] args) {
        TemperatureConverterTest test = new TemperatureConverterTest();
        test.kelvinConverterTest();
        test.fahrenheitConverterTest();

    }

    void kelvinConverterTest() {
        KelvinConverter kelvin = new KelvinConverter();
        double result = kelvin.convert(67.8);
        double expectedResult = 340.95;
        checkResults(result == expectedResult, "Convert from Celsius to Kelvin");
    }

    void fahrenheitConverterTest() {
        FahrenheitConverter fahrenheit = new FahrenheitConverter();
        double result = fahrenheit.convert(18.4);
        double expectedResult = 65.12;
        checkResults(result == expectedResult, "Convert from Celsius to Fahrenheit");
    }

    private void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
