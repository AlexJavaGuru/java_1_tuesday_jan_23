package student_aleksandrs_lezhennikovs.lesson_9.level_7.task_28;

class KelvinToCelsius implements TemperatureConverter {
    @Override
    public double convert(double kelvinTemperature) {
        return kelvinTemperature - 273.15;
    }
}
