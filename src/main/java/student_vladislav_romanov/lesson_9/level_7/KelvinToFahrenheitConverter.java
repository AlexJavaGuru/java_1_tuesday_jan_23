package student_vladislav_romanov.lesson_9.level_7;

class KelvinToFahrenheitConverter implements TemperatureConverter {
    @Override
    public double convert(double temperature) {
        return temperature * 1.8 - 459.67;
    }
}
