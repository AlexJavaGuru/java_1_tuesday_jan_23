package student_andrejs_cekalins.lesson_9.level_4;

class TemperatureConverterTest {
    public static void main(String[] args) {
        TemperatureConverterTest test = new TemperatureConverterTest();
        test.celsiusConverter();
        test.fahrenheitConverter();
        test.kelvinConverter();
    }

    public void celsiusConverter() {
        TemperatureConverter temperatureConverter = new CelsiusConverter();
        Double expectedTemperature = 28.00;
        Double realTemperature = temperatureConverter.convert(28.00);
        if (expectedTemperature.equals(realTemperature)) {
            System.out.println("Celsius converter test Passed");
        }
    }

    public void fahrenheitConverter() {
        TemperatureConverter temperatureConverter = new FahrenheitConverter();
        Double expectedTemperature = 50.00;
        Double realTemperature = temperatureConverter.convert(10.00);
        if (expectedTemperature.equals(realTemperature)) {
            System.out.println("Fahrenheit converter test Passed");
        }
    }

    public void kelvinConverter() {
        TemperatureConverter temperatureConverter = new KelvinConverter();
        Double expectedTemperature = 283.15;
        Double realTemperature = temperatureConverter.convert(10.00);
        if (expectedTemperature.equals(realTemperature)) {
            System.out.println("Kelvin converter test Passed");
        }
    }
}
