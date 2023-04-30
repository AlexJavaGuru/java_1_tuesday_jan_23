package student_julija_raudive.lesson_9.level_7.task_28;

public class ConverterTest {

    public static void main(String[] args) {
        ConverterTest test = new ConverterTest();
        test.celsiusToCelsius();
        test.kelvinToCelsius();
        test.fahrenheitToCelsius();
        test.celsiusToKelvin();
        test.kelvinToKelvin();
        test.fahrenheitToKelvin();
        test.celsiusToFahrenheit();
        test.fahrenheitToFahrenheit();
        test.kelvinToFahrenheit();


    }

    public void celsiusToCelsius(){
        Converter converter = new Converter(new CelsiusConverterToCelsius());
        double result = converter.convertTemperature(68);
        double expectedResult = 68;
        checkResults(result==expectedResult, "Celsius to celsius test");

    }

    public void kelvinToCelsius(){
        Converter converter = new Converter(new KelvinConverterToCelsius());
        double result = converter.convertTemperature(36.6);
        double expectedResult = -236.55;
        checkResults(result==expectedResult, "Kelvin to celsius test");

    }

    public void fahrenheitToCelsius(){
        Converter converter = new Converter(new FahrenheitConverterToCelsius());
        double result = converter.convertTemperature(18);
        double expectedResult = -7.78;
        checkResults(result==expectedResult, "Fahrenheit to celsius test");
    }

    public void celsiusToKelvin(){
        Converter converter = new Converter(new CelsiusConverterToKelvin());
        double result = converter.convertTemperature(56);
        double expectedResult = 329.15;
        checkResults(result==expectedResult, "Celsius to kelvin test");
    }

    public void kelvinToKelvin(){
        Converter converter = new Converter(new KelvinConverterToKelvin());
        double result = converter.convertTemperature(180);
        double expectedResult = 180;
        checkResults(result==expectedResult, "Kelvin to kelvin test");
    }

    public void fahrenheitToKelvin(){
        Converter converter = new Converter(new FahrenheitConverterToKelvin());
        double result = converter.convertTemperature(180);
        double expectedResult = 355.37;
        checkResults(result==expectedResult, "Fahrenheit to kelvin test");
    }

    public void celsiusToFahrenheit(){
        Converter converter = new Converter(new CelsiusConverterToFahrenheit());
        double result = converter.convertTemperature(180);
        double expectedResult = 356;
        checkResults(result==expectedResult, "Celsius to fahrenheit test");
    }

    public void fahrenheitToFahrenheit(){
        Converter converter = new Converter(new FahrenheitConverterToFahrenheit());
        double result = converter.convertTemperature(180);
        double expectedResult = 180;
        checkResults(result==expectedResult, "Fahrenheit to fahrenheit test");
    }

    public void kelvinToFahrenheit(){
        Converter converter = new Converter(new KelvinConverterToFahrenheit());
        double result = converter.convertTemperature(360);
        double expectedResult = 188.33;
        checkResults(result==expectedResult, "Kelvin to fahrenheit test");
    }

    private void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
