package student_natalja_semitseva.Lesson_9_Task_11_12;

public class TemperatureConverterTest {
    public static void main(String[] args) {
        TemperatureConverterTest test = new TemperatureConverterTest();
        test.testCelsiusConverter();
        test.testCelsiusConverterFailed();
        test.testFahrenheitConverter();
        test.testFahrenheitConverterFailed();
        test.testKelvinConverter();
        test.testKelvinConverterFailed();


    }

    public void testCelsiusConverter() {
        TemperatureConverter temperatureConverter = new CelsiusConverter();
        double expected = 0;
        double current = temperatureConverter.convert(0);
        checkResults(current == expected, "Test CelsiusConverter");
    }

    public void testCelsiusConverterFailed() {
        TemperatureConverter temperatureConverter = new CelsiusConverter();
        double expected = 10;
        double current = temperatureConverter.convert(0);
        checkResults(current != expected, "Test CelsiusConverterFailed");
    }

    public void testFahrenheitConverter() {
        TemperatureConverter temperatureConverter = new FahrenheitConverter();
        double expected = 50;
        double current = temperatureConverter.convert(10);
        checkResults(current == expected, "Test FahrenheitConverter");
    }

    public void testFahrenheitConverterFailed() {
        TemperatureConverter temperatureConverter = new FahrenheitConverter();
        double expected = 40;
        double current = temperatureConverter.convert(10);
        checkResults(current != expected, "Test FahrenheitConverterFailed");
    }

    public void testKelvinConverter() {
        TemperatureConverter temperatureConverter = new KelvinConverter();
        double expected = 300;
        double current = temperatureConverter.convert(26.85);
        checkResults(current == expected, "Test KelvinConverter");
    }

    public void testKelvinConverterFailed() {
        TemperatureConverter temperatureConverter = new KelvinConverter();
        double expected = 300;
        double current = temperatureConverter.convert(25);
        checkResults(current != expected, "Test KelvinConverterFailed");
    }

    private void checkResults(boolean number, String testName) {
        if (number) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
