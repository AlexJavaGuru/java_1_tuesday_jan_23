package student_andrejs_cekalins.lesson_9.level_7.Task_28;

class CelsiusToFahrenheitsConverter implements TemperatureConverter {

    @Override
    public double convert(double temperature) {
        return 1.8 * temperature + 32;
    }
}
