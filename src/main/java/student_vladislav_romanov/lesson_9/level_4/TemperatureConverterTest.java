package student_vladislav_romanov.lesson_9.level_4;

import student_vladislav_romanov.TestUtil;

class TemperatureConverterTest extends TestUtil {

    public static void main(String[] args) {
        TemperatureConverterTest temperatureConverterTest = new TemperatureConverterTest();
        temperatureConverterTest.celsiusConverterTestSucceed();
        temperatureConverterTest.celsiusConverterTestFailed();
        temperatureConverterTest.fahrenheitConverterTestSucceed();
        temperatureConverterTest.fahrenheitConverterTestFailed();
        temperatureConverterTest.kelvinConverterTestSucceed();
        temperatureConverterTest.kelvinConverterTestFailed();
        temperatureConverterTest.printStat();
    }
    public void celsiusConverterTestSucceed() {
        TemperatureConverter temperatureConverter = new CelsiusConverter();
        double expected = 0;
        double current = temperatureConverter.convert(0);
        printResult(current == expected, "celsiusConverterTestSucceed");
    }

    public void celsiusConverterTestFailed() {
        TemperatureConverter temperatureConverter = new CelsiusConverter();
        double expected = 10;
        double current = temperatureConverter.convert(0);
        printResult(current != expected, "celsiusConverterTestFailed");
    }

    public void fahrenheitConverterTestSucceed() {
        TemperatureConverter temperatureConverter = new FahrenheitConverter();
        double expected = 32;
        double current = temperatureConverter.convert(0);
        printResult(current == expected, "fahrenheitConverterTestSucceed");
    }

    public void fahrenheitConverterTestFailed() {
        TemperatureConverter temperatureConverter = new FahrenheitConverter();
        double expected = 20;
        double current = temperatureConverter.convert(0);
        printResult(current != expected, "fahrenheitConverterTestFailed");
    }

    public void kelvinConverterTestSucceed() {
        TemperatureConverter temperatureConverter = new KelvinConverter();
        double expected = 273.15;
        double current = temperatureConverter.convert(0);
        printResult(current == expected, "kelvinConverterTestSucceed");
    }

    public void kelvinConverterTestFailed() {
        TemperatureConverter temperatureConverter = new KelvinConverter();
        double expected = 100;
        double current = temperatureConverter.convert(0);
        printResult(current != expected, "kelvinConverterTestFailed");
    }

}
