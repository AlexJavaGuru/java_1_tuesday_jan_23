package student_oksana_tarasova.Lesson_9.level_7;

class CelsiusToKelvinConverter implements ConverterTemperature {
    @Override
    public double convert(double  celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }

}
