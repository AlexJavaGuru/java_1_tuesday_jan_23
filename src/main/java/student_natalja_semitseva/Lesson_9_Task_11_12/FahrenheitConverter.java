package student_natalja_semitseva.Lesson_9_Task_11_12;

public class FahrenheitConverter implements TemperatureConverter {
    @Override
    public double convert(double celsiusTemperature) {
        return 1.8 * celsiusTemperature + 32;

    }
}
