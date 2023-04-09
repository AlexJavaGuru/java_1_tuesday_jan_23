package teacher.lesson_9_interfaces.homework.level_7_senior;

import java.util.List;
import java.util.Map;

public class Demo {

    public static void main(String[] args) {

        Map<ConverterType, Converter> converterMap = Map.of(
                ConverterType.KELVIN_FAHRENHEIT, new KelvinFahrenheitConverter()
        );

        double result = converterMap.get(ConverterType.KELVIN_FAHRENHEIT).convert(10.0);
    }

    public Map<ConverterType, Double> someName(List<ConverterType> converterTypes, Double temperature) {
        return null;
    }
}
