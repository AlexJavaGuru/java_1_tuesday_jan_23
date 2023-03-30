package student_andrejs_cekalins.lesson_9.level_7.Task_28;

public enum TemperatureConverterEnum implements TemperatureConverter {
    CelsiusToFahrenheitConverter,
    CelsiusToKelvinConverter,
    KelvinToFahrenheitConverter,
    KelvinToCelsiusConverter,
    FahrenheitToCelsiusConverter,
    FahrenheitToKelvinConverter;


    @Override
    public double convert(double temperature) {
        return convert(temperature);
    }
}
