package student_ilya_tihonov.lesson_9.level_4;

public class KelvinConverter implements TemperatureConverter{


    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }
}
