package student_oksana_tarasova.Lesson_9.level_4;

 class KelvinConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }
}
