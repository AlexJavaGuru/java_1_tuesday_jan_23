package student_daniels_belejuns.lesson_9.level_7;

public enum TemperatureConverterEnum implements TemperatureConverter {
    CELSIUS_FAHRENHEIT,
    CELSIUS_KELVIN,
    KELVIN_FAHRENHEIT,
    KELVIN_CELSIUS,
    FAHRENHEIT_CELSIUS,
    FAHRENHEIT_KELVIN;


    @Override
    public double convert(double temperature) {
        return convert(temperature);
    }
}

