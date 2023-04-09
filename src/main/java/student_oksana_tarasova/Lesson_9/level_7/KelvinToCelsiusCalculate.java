package student_oksana_tarasova.Lesson_9.level_7;

class KelvinToCelsiusCalculate implements ConverterTemperature {
    @Override
    public double convert(double kelvinTemperature) {
        return kelvinTemperature - 273.15;
    }
}
