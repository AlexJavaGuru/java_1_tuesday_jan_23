package student_aleksandrs_lezhennikovs.lesson_9.level_7.task_28;

class FahrenheitToKelvin implements TemperatureConverter {
    @Override
    public double convert(double fahrenTemperature) {
        return (fahrenTemperature - 32) * 5 / 9 + 273.15;
    }
}
