package student_oksana_tarasova.Lesson_9.level_7;

class FahrenheitToCelsiusConverter implements ConverterTemperature {

    @Override
    public double convert(double fahrenheitTemperature) {
        return (fahrenheitTemperature - 32) / 1.8;
    }
}
