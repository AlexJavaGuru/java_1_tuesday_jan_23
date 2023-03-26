package student_vladislav_romanov.lesson_9.level_7;

class CelsiusToFahrenheitConverter implements TemperatureConverter {

    @Override
    public double convert(double temperature) {
        return 1.8 * temperature + 32;
    }

}