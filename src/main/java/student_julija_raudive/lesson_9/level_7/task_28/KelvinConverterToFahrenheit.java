package student_julija_raudive.lesson_9.level_7.task_28;

public class KelvinConverterToFahrenheit implements TemperatureConverter {
    @Override
    public double convert(double kelvinTemperature) {
        return Math.round(((kelvinTemperature - 273.15) * 9 / 5 + 32) * 100.0) / 100.0;
    }
}
