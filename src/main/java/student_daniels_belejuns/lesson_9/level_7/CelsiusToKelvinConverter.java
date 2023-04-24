package student_daniels_belejuns.lesson_9.level_7;

public class CelsiusToKelvinConverter implements TemperatureConverter {
    @Override
    public double convert(double temperature) {
        return temperature + 273.15;
    }
}
