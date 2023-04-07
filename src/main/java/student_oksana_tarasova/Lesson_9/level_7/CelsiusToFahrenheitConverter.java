package student_oksana_tarasova.Lesson_9.level_7;

class CelsiusToFahrenheitConverter implements ConverterTemperature {
    @Override
    public double convert(double celsiusTemperature) {
        return 1.8 * celsiusTemperature + 32;
    }
}
