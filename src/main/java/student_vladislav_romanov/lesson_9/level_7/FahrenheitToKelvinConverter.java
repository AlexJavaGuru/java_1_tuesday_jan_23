package student_vladislav_romanov.lesson_9.level_7;

class FahrenheitToKelvinConverter implements TemperatureConverter {
    @Override
    public double convert(double temperature) {
        return (temperature + 459.67) * 1.8;
    }
}
