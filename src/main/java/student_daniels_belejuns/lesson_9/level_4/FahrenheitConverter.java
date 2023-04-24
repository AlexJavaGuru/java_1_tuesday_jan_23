package student_daniels_belejuns.lesson_9.level_4;

class FahrenheitConverter implements TemperatureConverter {
    public double convert(double celsiusTemperature) {
        return 1.8 * celsiusTemperature + 32;
    }
}
