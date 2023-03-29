package student_andrejs_cekalins.lesson_9.level_7.Task_25;

class Context {
    private TemperatureConverter temperatureConverter;
    public Context(TemperatureConverter temperatureConverter) {
        this.temperatureConverter = temperatureConverter;
    }
    public double executesTemperatureConverter (double celsiusTemperature) {
        return temperatureConverter.convert(celsiusTemperature);
    }
}
