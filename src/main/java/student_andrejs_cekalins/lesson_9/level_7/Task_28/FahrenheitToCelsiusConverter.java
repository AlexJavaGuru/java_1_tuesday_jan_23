package student_andrejs_cekalins.lesson_9.level_7.Task_28;

class FahrenheitToCelsiusConverter implements TemperatureConverter {
    @Override
    public double convert(double temperature) {
        return (temperature - 32) * 1.8;
    }
}
