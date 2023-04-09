package student_aleksandrs_lezhennikovs.lesson_9.level_7.task_28;

class KelvinToFahrenheit implements TemperatureConverter {
    @Override
    public double convert(double kelvinTemperature) {
        return (kelvinTemperature - 273.15) * 1.8 + 32;
    }
}
