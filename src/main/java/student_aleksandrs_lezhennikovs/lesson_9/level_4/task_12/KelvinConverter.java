package student_aleksandrs_lezhennikovs.lesson_9.level_4.task_12;

class KelvinConverter implements TemperatureConverter {
    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }
}
