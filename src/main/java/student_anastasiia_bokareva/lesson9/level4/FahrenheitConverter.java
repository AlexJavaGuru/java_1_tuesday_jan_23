package student_anastasiia_bokareva.lesson9.level4;

public class FahrenheitConverter implements TemperatureConverter {
    @Override
    public double convert(double celsiusTemperature) {
        return (1.8 * celsiusTemperature + 32);
    }
}
