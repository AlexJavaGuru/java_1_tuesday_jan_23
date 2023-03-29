package student_andrejs_cekalins.lesson_9.level_7.Task_25;

public class TemperatureConverterDemo {
    public static void main(String[] args) {
        Context context = new Context(new CelsiusConverter());
        System.out.println("Temperature in celsius is: " +context.executesTemperatureConverter(30.0));
        context = new Context(new FahrenheitConverter());
        System.out.println("Temperature in fahrenheit is: " +context.executesTemperatureConverter(30.0));
        context = new Context(new KelvinConverter());
        System.out.println("Temperature in kelvin is: " +context.executesTemperatureConverter(30.0));
    }
}
