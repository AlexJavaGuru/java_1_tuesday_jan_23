package student_daniels_belejuns.lesson_9.level_7;

public class KelvinToFahrenheitsConverter implements TemperatureConverter {
    @Override
    public double convert(double temperature) {
        return temperature * 1.8 - 459.67;
    }
}

