package student_julija_raudive.lesson_9.level_7.task_28;

class Converter {

    private TemperatureConverter temperatureConverter;

    public Converter(TemperatureConverter temperatureConverter) {
        this.temperatureConverter = temperatureConverter;
    }

    public double convertTemperature(double temperature) {
        return temperatureConverter.convert(temperature);

    }
}
