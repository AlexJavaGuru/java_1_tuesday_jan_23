package student_oksana_tarasova.Lesson_9.level_7;

class ConversionStrategyDemo {
    public static void main(String[] args) {
        ConverterTemperatureStrategy converterTemperatureStrategy = new ConverterTemperatureStrategy();

        double celsiusToFahrenheit = converterTemperatureStrategy
                .conversion(ConversionFromOneTemperatureScaleToAnother.CELSIUS_FAHRENHEIT)
                .convert(15.1);

        System.out.println(celsiusToFahrenheit);

        double celsiusToKelvin = converterTemperatureStrategy
                .conversion(ConversionFromOneTemperatureScaleToAnother.CELSIUS_KELVIN)
                .convert(25.0);

        System.out.println(celsiusToKelvin);

        double kelvinToCelsius = converterTemperatureStrategy
                .conversion(ConversionFromOneTemperatureScaleToAnother.KELVIN_CELSIUS)
                .convert(298.15);

        System.out.println(kelvinToCelsius);

        double kelvinToFahrenheit = converterTemperatureStrategy
                .conversion(ConversionFromOneTemperatureScaleToAnother.KELVIN_FAHRENHEIT)
                .convert(298.6);

        System.out.println(kelvinToFahrenheit);

        double fahrenheitToCelsius = converterTemperatureStrategy
                .conversion(ConversionFromOneTemperatureScaleToAnother.FAHRENHEIT_CELSIUS)
                .convert(77);

        System.out.println(fahrenheitToCelsius);

        double fahrenheitToKelvin = converterTemperatureStrategy
                .conversion(ConversionFromOneTemperatureScaleToAnother.FAHRENHEIT_KELVIN)
                .convert(71.6);

        System.out.println(fahrenheitToKelvin);

    }
}
