package student_oksana_tarasova.Lesson_9.level_7;

class FahrenheitToKelvinConverter implements ConverterTemperature {

    @Override
    public double convert(double fahrenheitTemperature) {
        return (fahrenheitTemperature + 459.67) * 5 / 9;

    }
}
