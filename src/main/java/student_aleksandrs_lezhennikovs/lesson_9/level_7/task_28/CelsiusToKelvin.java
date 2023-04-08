package student_aleksandrs_lezhennikovs.lesson_9.level_7.task_28;

class CelsiusToKelvin implements TemperatureConverter {
    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }
}
