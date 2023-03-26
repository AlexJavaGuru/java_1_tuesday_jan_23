package student_vladislav_romanov.lesson_9.level_7;

import student_vladislav_romanov.TestUtil;

class TemperatureConverterTest extends TestUtil {

    public static void main(String[] args) {
        TemperatureConverterTest temperatureConverterTest = new TemperatureConverterTest();
        temperatureConverterTest.celsiusToFahrenheitConverterTestSucceed(Converter.CELSIUS_TO_FAHRENHEIT);
        temperatureConverterTest.celsiusToFahrenheitConverterTestFailed(Converter.CELSIUS_TO_FAHRENHEIT);
        temperatureConverterTest.celsiusToKelvinConverterTestSucceed(Converter.CELSIUS_TO_KELVIN);
        temperatureConverterTest.celsiusToKelvinConverterTestFailed(Converter.CELSIUS_TO_KELVIN);
        temperatureConverterTest.kelvinToFahrenheitConverterTestSucceed(Converter.KELVIN_TO_FAHRENHEIT);
        temperatureConverterTest.kelvinToFahrenheitConverterTestFailed(Converter.KELVIN_TO_FAHRENHEIT);
        temperatureConverterTest.kelvinToCelsiusConverterTestSucceed(Converter.KELVIN_TO_CELSIUS);
        temperatureConverterTest.kelvinToCelsiusConverterTestFailed(Converter.KELVIN_TO_CELSIUS);
        temperatureConverterTest.fahrenheitToKelvinConverterTestSucceed(Converter.FAHRENHEIT_TO_KELVIN);
        temperatureConverterTest.fahrenheitToKelvinConverterTestFailed(Converter.FAHRENHEIT_TO_KELVIN);
        temperatureConverterTest.fahrenheitToCelsiusConverterTestSucceed(Converter.FAHRENHEIT_TO_CELSIUS);
        temperatureConverterTest.fahrenheitToCelsiusConverterTestFailed(Converter.FAHRENHEIT_TO_CELSIUS);
        temperatureConverterTest.printStat();
    }

    public void celsiusToFahrenheitConverterTestSucceed(TemperatureConverter temperatureConverter) {
        double expected = 32;
        double current = temperatureConverter.convert(0);
        printResult(current == expected, "celsiusToFahrenheitConverterTestSucceed");
    }

    public void celsiusToFahrenheitConverterTestFailed(TemperatureConverter temperatureConverter) {
        double expected = 0;
        double current = temperatureConverter.convert(0);
        printResult(current != expected, "celsiusToFahrenheitConverterTestFailed");
    }

    public void celsiusToKelvinConverterTestSucceed(TemperatureConverter temperatureConverter) {
        double expected = 273.15;
        double current = temperatureConverter.convert(0);
        printResult(current == expected, "celsiusToKelvinConverterTestSucceed");
    }

    public void celsiusToKelvinConverterTestFailed(TemperatureConverter temperatureConverter) {
        double expected = 0;
        double current = temperatureConverter.convert(0);
        printResult(current != expected, "celsiusToKelvinConverterTestFailed");
    }

    public void kelvinToFahrenheitConverterTestSucceed(TemperatureConverter temperatureConverter) {
        double expected = -459.67;
        double current = temperatureConverter.convert(0);
        printResult(current == expected, "kelvinToFahrenheitConverterTestSucceed");
    }

    public void kelvinToFahrenheitConverterTestFailed(TemperatureConverter temperatureConverter) {
        double expected = 0;
        double current = temperatureConverter.convert(0);
        printResult(current != expected, "kelvinToFahrenheitConverterTestFailed");
    }

    public void kelvinToCelsiusConverterTestSucceed(TemperatureConverter temperatureConverter) {
        double expected = 0;
        double current = temperatureConverter.convert(273.15);
        printResult(current == expected, "kelvinToCelsiusConverterTestSucceed");
    }

    public void kelvinToCelsiusConverterTestFailed(TemperatureConverter temperatureConverter) {
        double expected = 0;
        double current = temperatureConverter.convert(0);
        printResult(current != expected, "kelvinToCelsiusConverterTestFailed");
    }

    public void fahrenheitToKelvinConverterTestSucceed(TemperatureConverter temperatureConverter) {
        double expected = 0;
        double current = temperatureConverter.convert(-459.67);
        printResult(current == expected, "fahrenheitToKelvinConverterTestSucceed");
    }

    public void fahrenheitToKelvinConverterTestFailed(TemperatureConverter temperatureConverter) {
        double expected = 0;
        double current = temperatureConverter.convert(0);
        printResult(current != expected, "fahrenheitToKelvinConverterTestFailed");
    }

    public void fahrenheitToCelsiusConverterTestSucceed(TemperatureConverter temperatureConverter) {
        double expected = 0;
        double current = temperatureConverter.convert(32);
        printResult(current == expected, "fahrenheitToCelsiusConverterTestSucceed");
    }

    public void fahrenheitToCelsiusConverterTestFailed(TemperatureConverter temperatureConverter) {
        double expected = 0;
        double current = temperatureConverter.convert(0);
        printResult(current != expected, "fahrenheitToCelsiusConverterTestFailed");
    }

}
