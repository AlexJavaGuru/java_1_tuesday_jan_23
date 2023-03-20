package student_aleksandrs_lezhennikovs.lesson_9.level_4.task_12;

class TemperatureConverterTests {
    public static void main(String[] args) {
        checkKelvinConverter();
        checkFahrenheitConverter();
    }

    private  static void checkKelvinConverter() {
        TemperatureConverter temConverterKelvin = new KelvinConverter();
        double expectedResult = 293.15;
        double calculatedResult = temConverterKelvin.convert(20);
        check("Kelvin converter", expectedResult, calculatedResult);
    }
    private static void checkFahrenheitConverter() {
        TemperatureConverter tempFahrenheitConverter = new FahrenheitConverter();
        double expectedResult = 68;
        double calculatedResult = tempFahrenheitConverter.convert(20);
        check("Fahrenheit converter", expectedResult, calculatedResult);
    }

    private static void check(String actionName, double expect, double actual) {
        if (expect == actual) {
            System.out.println(actionName + " test is Passed");
        } else {
            System.out.println(actionName + " test is Failed");
        }
    }
}
