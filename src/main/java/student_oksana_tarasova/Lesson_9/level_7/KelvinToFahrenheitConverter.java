package student_oksana_tarasova.Lesson_9.level_7;

class KelvinToFahrenheitConverter implements ConverterTemperature {
    @Override
    public double convert(double kelvinTemperature) {
        return  1.8 * kelvinTemperature - 459.67;
    }
}
