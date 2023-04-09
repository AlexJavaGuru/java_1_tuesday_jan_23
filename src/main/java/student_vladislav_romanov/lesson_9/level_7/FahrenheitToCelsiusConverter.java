package student_vladislav_romanov.lesson_9.level_7;

class FahrenheitToCelsiusConverter implements TemperatureConverter {
    @Override
    public double convert(double temperature) {
        return (temperature - 32) * 1.8;
    }
}
