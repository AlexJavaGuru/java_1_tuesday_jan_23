package student_andrejs_cekalins.lesson_9.level_7.Task_25;


public class TemperatureConverterTest {
    public static void main(String[] args) {
        TemperatureConverterTest test = new TemperatureConverterTest();
        test.celsiusConverter();
        test.noCelsiusConverter();
        test.fahrenheitConverter();
        test.noFahrenheitConverter();
        test.kelvinConverter();
        test.noKelvinConverter();

    }

    public void celsiusConverter() {
        Context context = new Context(new CelsiusConverter());
        Double expectedTemperature = 30.00;
        Double realTemperature = context.executesTemperatureConverter(30);
        if (expectedTemperature.equals(realTemperature)) {
            System.out.println("Celsius converter test Passed");
        }
    }

    public void noCelsiusConverter() {
        Context context = new Context(new CelsiusConverter());
        Double expectedTemperature = 31.00;
        Double realTemperature = context.executesTemperatureConverter(30);
        if (!expectedTemperature.equals(realTemperature)) {
            System.out.println("Celsius converter test NotPassed");
        }
    }

    public void fahrenheitConverter() {
        Context context = new Context(new FahrenheitConverter());
        Double expectedTemperature = 86.00;
        Double realTemperature = context.executesTemperatureConverter(30);
        if (expectedTemperature.equals(realTemperature)) {
            System.out.println("Fahrenheit converter test Passed");
        }
    }

    public void noFahrenheitConverter() {
        Context context = new Context(new FahrenheitConverter());
        Double expectedTemperature = 85.00;
        Double realTemperature = context.executesTemperatureConverter(30);
        if (!expectedTemperature.equals(realTemperature)) {
            System.out.println("Fahrenheit converter test NotPassed");
        }
    }

    public void kelvinConverter() {
        Context context = new Context(new KelvinConverter());
        Double expectedTemperature = 303.15;
        Double realTemperature = context.executesTemperatureConverter(30);
        if (expectedTemperature.equals(realTemperature)) {
            System.out.println("Kelvin converter test Passed");
        }
    }

    public void noKelvinConverter() {
        Context context = new Context(new KelvinConverter());
        Double expectedTemperature = 303.00;
        Double realTemperature = context.executesTemperatureConverter(30);
        if (!expectedTemperature.equals(realTemperature)) {
            System.out.println("Kelvin converter test NotPassed");
        }
    }
}
