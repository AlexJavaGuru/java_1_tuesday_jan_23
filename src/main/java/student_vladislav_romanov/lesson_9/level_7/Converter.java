package student_vladislav_romanov.lesson_9.level_7;

enum Converter implements TemperatureConverter {

    CELSIUS_TO_FAHRENHEIT (new CelsiusToFahrenheitConverter()),
    CELSIUS_TO_KELVIN (new CelsiusToKelvinConverter()),
    FAHRENHEIT_TO_CELSIUS (new FahrenheitToCelsiusConverter()),
    FAHRENHEIT_TO_KELVIN (new FahrenheitToKelvinConverter()),
    KELVIN_TO_CELSIUS (new KelvinToCelsiusConverter()),
    KELVIN_TO_FAHRENHEIT (new KelvinToFahrenheitConverter());

    private final TemperatureConverter converter;

    Converter(TemperatureConverter converter) {
        this.converter = converter;
    }

    @Override
    public double convert(double temperature) {
        return converter.convert(temperature);
    }
}
