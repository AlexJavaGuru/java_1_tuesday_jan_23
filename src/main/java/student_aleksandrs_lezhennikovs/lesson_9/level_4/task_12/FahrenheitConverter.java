package student_aleksandrs_lezhennikovs.lesson_9.level_4.task_12;

class FahrenheitConverter implements TemperatureConverter {
    @Override
    public double convert(double celsiusTemperature) {
        return 1.8 * celsiusTemperature + 32;
    }
}
