package student_andrejs_cekalins.lesson_9.level_7.Task_28;


import java.util.Map;

class TemperatureConverterDemo {
    public static void main(String[] args) {
        Map<TemperatureConverterEnum, TemperatureConverter> converterMap = Map.of(
                TemperatureConverterEnum.CELSIUS_FAHRENHEIT, new CelsiusToFahrenheitsConverter(),
                TemperatureConverterEnum.CELSIUS_KELVIN, new CelsiusToKelvinConverter(),
                TemperatureConverterEnum.FAHRENHEIT_CELSIUS, new FahrenheitToCelsiusConverter(),
                TemperatureConverterEnum.FAHRENHEIT_KELVIN, new FahrenheitToKelvinConverter(),
                TemperatureConverterEnum.KELVIN_CELSIUS, new KelvinToCelsiusConverter(),
                TemperatureConverterEnum.KELVIN_FAHRENHEIT, new KelvinToFahrenheitsConverter()
        );
        double result1 = converterMap.get(TemperatureConverterEnum.KELVIN_FAHRENHEIT).convert(300.00);
        double result2 = converterMap.get(TemperatureConverterEnum.KELVIN_CELSIUS).convert(300.00);
        double result3 = converterMap.get(TemperatureConverterEnum.FAHRENHEIT_CELSIUS).convert(100.00);
        double result4 = converterMap.get(TemperatureConverterEnum.FAHRENHEIT_KELVIN).convert(100.00);
        double result5 = converterMap.get(TemperatureConverterEnum.CELSIUS_FAHRENHEIT).convert(10.00);
        double result6 = converterMap.get(TemperatureConverterEnum.CELSIUS_KELVIN).convert(10.00);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
    }
}
