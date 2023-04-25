package student_daniels_belejuns.lesson_9.level_7;

public class FahrenheitToKelvinConverter implements TemperatureConverter {
    @Override
    public double convert(double temperature) {
        return (temperature + 459.67) * 1.8;
    }
}

