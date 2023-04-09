package student_oksana_tarasova.Lesson_9.level_4;

public class MyConverterTemperature {
    TemperatureConverter kelvin = (celsiusTemperature) -> celsiusTemperature + 273.15;
    TemperatureConverter fahrenheit = (celsiusTemperature) -> 1.8 * celsiusTemperature + 32;

    public double kelvinConversion(double celsiusTemperature) {
        return kelvin.convert(celsiusTemperature);
    }

    public double fahrenheitTemperature(double celsiusTemperature) {
        return fahrenheit.convert(celsiusTemperature);
    }
}
