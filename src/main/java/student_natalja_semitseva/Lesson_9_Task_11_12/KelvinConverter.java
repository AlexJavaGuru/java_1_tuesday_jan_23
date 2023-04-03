package student_natalja_semitseva.Lesson_9_Task_11_12;

public class KelvinConverter implements TemperatureConverter {
    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }
}
