package student_oksana_tarasova.Lesson_9.level_7;

class ConverterTemperatureStrategy {

    public ConverterTemperatureStrategy() {
    }

    public ConverterTemperature conversion(ConversionFromOneTemperatureScaleToAnother scale) {
        return switch (scale) {
            case KELVIN_KELVIN -> new KelvinToKelvinConverter();
            case KELVIN_CELSIUS -> new KelvinToCelsiusCalculate();
            case KELVIN_FAHRENHEIT -> new KelvinToFahrenheitConverter();
            case CELSIUS_CELSIUS -> new CelsiusToCelsiusConverter();
            case CELSIUS_KELVIN -> new CelsiusToKelvinConverter();
            case CELSIUS_FAHRENHEIT -> new CelsiusToFahrenheitConverter();
            case FAHRENHEIT_FAHRENHEIT -> new FahrenheitToFahrenheitConverter();
            case FAHRENHEIT_CELSIUS -> new FahrenheitToCelsiusConverter();
            case FAHRENHEIT_KELVIN -> new FahrenheitToKelvinConverter();
        };
    }
}
