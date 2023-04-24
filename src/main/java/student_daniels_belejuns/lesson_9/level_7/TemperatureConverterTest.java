package student_daniels_belejuns.lesson_9.level_7;

import java.util.Map;

class TemperatureConverterTest {
    public static void main(String[] args) {
        TemperatureConverterTest test = new TemperatureConverterTest();
        test.celsiusToFahrenheitConverts();
        test.celsiusToFahrenheitNotConverts();
        test.celsiusToKelvinConverts();
        test.celsiusToKelvinNotConverts();
        test.fahrenheitToCelsiusConverts();
        test.fahrenheitToCelsiusNotConverts();
        test.fahrenheitToKelvinConverts();
        test.fahrenheitToKelvinNotConverts();
        test.kelvinToFahrenheitConverts();
        test.kelvinToFahrenheitNotConverts();
        test.kelvinToCelsiusConverts();
        test.kelvinToCelsiusNotConverts();
    }

    public void celsiusToFahrenheitConverts() {
        Map<TemperatureConverterEnum, TemperatureConverter> converterMap = Map.of(
                TemperatureConverterEnum.CELSIUS_FAHRENHEIT, new CelsiusToFahrenheitsConverter());
        Double expectedTemperature = 572.00;
        Double realTemperature = converterMap.get(TemperatureConverterEnum.CELSIUS_FAHRENHEIT).convert(300.00);
        if (expectedTemperature.equals(realTemperature)) {
            System.out.println("Celsius to fahrenheit convert test Passed");
        }
    }

    public void celsiusToFahrenheitNotConverts() {
        Map<TemperatureConverterEnum, TemperatureConverter> converterMap = Map.of(
                TemperatureConverterEnum.CELSIUS_FAHRENHEIT, new CelsiusToFahrenheitsConverter());
        Double expectedTemperature = 570.00;
        Double realTemperature = converterMap.get(TemperatureConverterEnum.CELSIUS_FAHRENHEIT).convert(300);
        if (!expectedTemperature.equals(realTemperature)) {
            System.out.println("Celsius to fahrenheit not converts test Passed");
        }
    }

    public void celsiusToKelvinConverts() {
        Map<TemperatureConverterEnum, TemperatureConverter> converterMap = Map.of(
                TemperatureConverterEnum.CELSIUS_KELVIN, new CelsiusToKelvinConverter());
        Double expectedTemperature = 283.15;
        Double realTemperature = converterMap.get(TemperatureConverterEnum.CELSIUS_KELVIN).convert(10.00);
        if (expectedTemperature.equals(realTemperature)) {
            System.out.println("Celsius to kelvin convert test Passed");
        }
    }

    public void celsiusToKelvinNotConverts() {
        Map<TemperatureConverterEnum, TemperatureConverter> converterMap = Map.of(
                TemperatureConverterEnum.CELSIUS_KELVIN, new CelsiusToKelvinConverter());
        Double expectedTemperature = 570.00;
        Double realTemperature = converterMap.get(TemperatureConverterEnum.CELSIUS_KELVIN).convert(10);
        if (!expectedTemperature.equals(realTemperature)) {
            System.out.println("Celsius to kelvin not converts test Passed");
        }
    }

    public void fahrenheitToCelsiusConverts() {
        Map<TemperatureConverterEnum, TemperatureConverter> converterMap = Map.of(
                TemperatureConverterEnum.FAHRENHEIT_CELSIUS, new FahrenheitToCelsiusConverter());
        Double expectedTemperature = 122.4;
        Double realTemperature = converterMap.get(TemperatureConverterEnum.FAHRENHEIT_CELSIUS).convert(100.00);
        if (expectedTemperature.equals(realTemperature)) {
            System.out.println("Fahrenheit to celsius convert test Passed");
        }
    }

    public void fahrenheitToCelsiusNotConverts() {
        Map<TemperatureConverterEnum, TemperatureConverter> converterMap = Map.of(
                TemperatureConverterEnum.FAHRENHEIT_CELSIUS, new FahrenheitToCelsiusConverter());
        Double expectedTemperature = 570.00;
        Double realTemperature = converterMap.get(TemperatureConverterEnum.FAHRENHEIT_CELSIUS).convert(300);
        if (!expectedTemperature.equals(realTemperature)) {
            System.out.println("Fahrenheit to celsius not converts test Passed");
        }
    }

    public void fahrenheitToKelvinConverts() {
        Map<TemperatureConverterEnum, TemperatureConverter> converterMap = Map.of(
                TemperatureConverterEnum.FAHRENHEIT_KELVIN, new FahrenheitToKelvinConverter());
        Double expectedTemperature = 1007.4060000000002;
        Double realTemperature = converterMap.get(TemperatureConverterEnum.FAHRENHEIT_KELVIN).convert(100.00);
        if (expectedTemperature.equals(realTemperature)) {
            System.out.println("Fahrenheit to kelvin convert test Passed");
        }
    }

    public void fahrenheitToKelvinNotConverts() {
        Map<TemperatureConverterEnum, TemperatureConverter> converterMap = Map.of(
                TemperatureConverterEnum.FAHRENHEIT_KELVIN, new FahrenheitToKelvinConverter());
        Double expectedTemperature = 570.00;
        Double realTemperature = converterMap.get(TemperatureConverterEnum.FAHRENHEIT_KELVIN).convert(300);
        if (!expectedTemperature.equals(realTemperature)) {
            System.out.println("Fahrenheit to kelvin not converts test Passed");
        }
    }

    public void kelvinToFahrenheitConverts() {
        Map<TemperatureConverterEnum, TemperatureConverter> converterMap = Map.of(
                TemperatureConverterEnum.KELVIN_FAHRENHEIT, new KelvinToFahrenheitsConverter());
        Double expectedTemperature = 80.32999999999998;
        Double realTemperature = converterMap.get(TemperatureConverterEnum.KELVIN_FAHRENHEIT).convert(300.00);
        if (expectedTemperature.equals(realTemperature)) {
            System.out.println("Kelvin to fahrenheit convert test Passed");
        }
    }

    public void kelvinToFahrenheitNotConverts() {
        Map<TemperatureConverterEnum, TemperatureConverter> converterMap = Map.of(
                TemperatureConverterEnum.KELVIN_FAHRENHEIT, new KelvinToFahrenheitsConverter());
        Double expectedTemperature = 570.00;
        Double realTemperature = converterMap.get(TemperatureConverterEnum.KELVIN_FAHRENHEIT).convert(300);
        if (!expectedTemperature.equals(realTemperature)) {
            System.out.println("Kelvin to fahrenheit not converts test Passed");
        }
    }

    public void kelvinToCelsiusConverts() {
        Map<TemperatureConverterEnum, TemperatureConverter> converterMap = Map.of(
                TemperatureConverterEnum.KELVIN_CELSIUS, new KelvinToCelsiusConverter());
        Double expectedTemperature = 26.850000000000023;
        Double realTemperature = converterMap.get(TemperatureConverterEnum.KELVIN_CELSIUS).convert(300.00);
        if (expectedTemperature.equals(realTemperature)) {
            System.out.println("Kelvin to celsius convert test Passed");
        }
    }

    public void kelvinToCelsiusNotConverts() {
        Map<TemperatureConverterEnum, TemperatureConverter> converterMap = Map.of(
                TemperatureConverterEnum.KELVIN_CELSIUS, new KelvinToCelsiusConverter());
        Double expectedTemperature = 570.00;
        Double realTemperature = converterMap.get(TemperatureConverterEnum.KELVIN_CELSIUS).convert(300);
        if (!expectedTemperature.equals(realTemperature)) {
            System.out.println("Kelvin to celsius not converts test Passed");
        }
    }
}

