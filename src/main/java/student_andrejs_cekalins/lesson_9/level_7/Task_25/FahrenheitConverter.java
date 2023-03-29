package student_andrejs_cekalins.lesson_9.level_7.Task_25;

class FahrenheitConverter implements TemperatureConverter{
    @Override
    public double convert(double celsiusTemperature) {
        return 1.8 * celsiusTemperature + 32;
    }
}
