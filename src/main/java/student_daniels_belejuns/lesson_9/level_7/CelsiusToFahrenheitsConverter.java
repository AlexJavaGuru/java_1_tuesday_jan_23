package student_daniels_belejuns.lesson_9.level_7;

class CelsiusToFahrenheitsConverter implements TemperatureConverter {

    @Override
    public double convert(double temperature) {
        return 1.8 * temperature + 32;
    }
}
