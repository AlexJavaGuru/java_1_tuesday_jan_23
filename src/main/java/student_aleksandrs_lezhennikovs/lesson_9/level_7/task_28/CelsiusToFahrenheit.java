package student_aleksandrs_lezhennikovs.lesson_9.level_7.task_28;

class CelsiusToFahrenheit implements TemperatureConverter {
    @Override
    public double convert(double celsiusTemperature) {
        return 1.8 * celsiusTemperature + 32;
    }
}
