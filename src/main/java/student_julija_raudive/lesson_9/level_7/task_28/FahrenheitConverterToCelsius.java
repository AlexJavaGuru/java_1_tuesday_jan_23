package student_julija_raudive.lesson_9.level_7.task_28;

class FahrenheitConverterToCelsius implements TemperatureConverter {

    @Override
    public double convert(double fahrenheitTemperature) {
        return Math.round(((fahrenheitTemperature - 32) * 5 / 9) * 100.0) / 100.0;
    }
}
