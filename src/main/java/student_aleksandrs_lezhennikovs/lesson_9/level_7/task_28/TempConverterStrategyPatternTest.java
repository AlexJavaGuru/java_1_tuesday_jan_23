package student_aleksandrs_lezhennikovs.lesson_9.level_7.task_28;

class TempConverterStrategyPatternTest {
    public static void main(String[] args) {
        checkCelsiusToKelvin();
        checkCelsiusToFahrenheit();
        checkKelvinToFahrenheit();
        checkKelvinToCelsius();
        checkFahrenheitToCelsius();
        checkFahrenheitToKelvin();
    }

    private static void checkCelsiusToKelvin() {
        Context context = new Context(new CelsiusToKelvin());
        double expectResult = 293.15;
        double calculateResult = context.executeTemperatureConverter(20);
        check("Celsius to Kelvin", expectResult, calculateResult);
    }

    private static void checkCelsiusToFahrenheit() {
        Context context = new Context(new CelsiusToFahrenheit());
        double expectResult = 68;
        double calculateResult = context.executeTemperatureConverter(20);
        check("Celsius to Fahrenheit", expectResult, calculateResult);
    }

    private static void checkKelvinToFahrenheit() {
        Context context = new Context(new KelvinToFahrenheit());
        double expectResult = 80.6;
        double calculateResult = context.executeTemperatureConverter(300.15);
        check("Kelvin to Fahrenheit", expectResult, calculateResult);
    }

    private static void checkKelvinToCelsius() {
        Context context = new Context(new KelvinToCelsius());
        double expectResult = 20;
        double calculateResult = context.executeTemperatureConverter(293.15);
        check("Kelvin to Celsius", expectResult, calculateResult);
    }

    private static void checkFahrenheitToCelsius() {
        Context context = new Context(new FahrenheitToCelsius());
        double expectResult = 20;
        double calculateResult = context.executeTemperatureConverter(68);
        check("Fahrenheit to Celsius", expectResult, calculateResult);
    }

    private static void checkFahrenheitToKelvin() {
        Context context = new Context(new FahrenheitToKelvin());
        double expectResult = 266;
        double calculateResult = Math.round(context.executeTemperatureConverter(20));
        check("Fahrenheit to Kelvin", expectResult, calculateResult);
    }
    private static void check(String actionName, double expect, double actual) {
        if (expect == actual) {
            System.out.println(actionName + " test is Passed");
        } else {
            System.out.println(actionName + " test is Failed");
        }
    }
}
