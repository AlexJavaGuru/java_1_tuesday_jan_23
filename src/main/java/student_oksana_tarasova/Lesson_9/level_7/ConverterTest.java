package student_oksana_tarasova.Lesson_9.level_7;

public class ConverterTest {
    public static void main(String[] args) {
        ConverterTest test = new ConverterTest();
        test.kelvinToKelvinConverterTest();
        test.kelvinToCelsiusCalculateTest();
        test.kelvinToFahrenheitConverterTest();
        test.celsiusToCelsiusConverterTest();
        test.celsiusToFahrenheitConverterTest();
        test.celsiusToKelvinConverterTest();
        test.fahrenheitToFahrenheitConverterTest();
        test.fahrenheitToCelsiusConverterTest();
        test.fahrenheitToKelvinConverterTest();

    }

    public void kelvinToKelvinConverterTest() {
        ConverterTemperatureStrategy strategy = new ConverterTemperatureStrategy();
        double realResult = strategy.conversion(ConversionFromOneTemperatureScaleToAnother.KELVIN_KELVIN).convert(298.15);
        double expectedResult = 298.15;
        check(expectedResult == realResult, "kelvin to kelvin");
    }

    public void kelvinToCelsiusCalculateTest() {
        ConverterTemperatureStrategy strategy = new ConverterTemperatureStrategy();
        double realResult = strategy.conversion(ConversionFromOneTemperatureScaleToAnother.KELVIN_CELSIUS).convert(298.15);
        double expectedResult = 25.0;
        check(expectedResult == realResult, "kelvin to celsius");
    }

    public void kelvinToFahrenheitConverterTest() {
        ConverterTemperatureStrategy strategy = new ConverterTemperatureStrategy();
        double realResult = strategy.conversion(ConversionFromOneTemperatureScaleToAnother.KELVIN_FAHRENHEIT).convert(298.6);
        double expectedResult = 77.81;
        check(expectedResult == realResult, "kelvin to fahrenheit");
    }

    public void celsiusToCelsiusConverterTest() {
        ConverterTemperatureStrategy strategy = new ConverterTemperatureStrategy();
        double realResult = strategy.conversion(ConversionFromOneTemperatureScaleToAnother.CELSIUS_CELSIUS).convert(25.0);
        double expectedResult = 25.0;
        check(expectedResult == realResult, "celsius to celsius");
    }

    public void celsiusToKelvinConverterTest() {
        ConverterTemperatureStrategy strategy = new ConverterTemperatureStrategy();
        double realResult = strategy.conversion(ConversionFromOneTemperatureScaleToAnother.CELSIUS_KELVIN).convert(25.0);
        double expectedResult = 298.15;
        check(expectedResult == realResult, "celsius to kelvin");
    }

    public void celsiusToFahrenheitConverterTest() {
        ConverterTemperatureStrategy strategy = new ConverterTemperatureStrategy();
        double realResult = strategy.conversion(ConversionFromOneTemperatureScaleToAnother.CELSIUS_FAHRENHEIT).convert(15.1);
        double expectedResult = 59.18;
        check(expectedResult == realResult, "celsius to fahrenheit");
    }

    public void fahrenheitToFahrenheitConverterTest() {
        ConverterTemperatureStrategy strategy = new ConverterTemperatureStrategy();
        double realResult = strategy.conversion(ConversionFromOneTemperatureScaleToAnother.FAHRENHEIT_FAHRENHEIT).convert(59.18);
        double expectedResult = 59.18;
        check(expectedResult == realResult, "fahrenheit to fahrenheit");
    }

    public void fahrenheitToCelsiusConverterTest() {
        ConverterTemperatureStrategy strategy = new ConverterTemperatureStrategy();
        double realResult = strategy.conversion(ConversionFromOneTemperatureScaleToAnother.FAHRENHEIT_CELSIUS).convert(77.0);
        double expectedResult = 25.0;
        check(expectedResult == realResult, "fahrenheit to celsius");
    }

    public void fahrenheitToKelvinConverterTest() {
        ConverterTemperatureStrategy strategy = new ConverterTemperatureStrategy();
        double realResult = strategy.conversion(ConversionFromOneTemperatureScaleToAnother.FAHRENHEIT_KELVIN).convert(71.6);
        double expectedResult = 295.15;
        check(expectedResult == realResult, "fahrenheit to kelvin");
    }

    public void check(boolean state, String nameTest) {
        if (state) {
            System.out.println(nameTest + " = ok");
        } else {
            System.out.println(nameTest + " = fail");
        }
    }
}
