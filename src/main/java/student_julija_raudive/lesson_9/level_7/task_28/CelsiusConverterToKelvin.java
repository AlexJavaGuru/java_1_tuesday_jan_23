package student_julija_raudive.lesson_9.level_7.task_28;

public class CelsiusConverterToKelvin implements TemperatureConverter {
    @Override
    public double convert(double celsiusTemperature) {
        return Math.round((celsiusTemperature + 273.15) * 100.0) / 100.0;
    }
}
