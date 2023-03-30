package student_andrejs_cekalins.lesson_9.level_7.Task_28;

public class KelvinToFahrenheitsConverter implements TemperatureConverter {
    @Override
    public double convert(double temperature) {
        return temperature * 1.8 - 459.67;
    }
}
