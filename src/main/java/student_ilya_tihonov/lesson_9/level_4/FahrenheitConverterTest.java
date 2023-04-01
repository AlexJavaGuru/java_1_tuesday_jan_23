package student_ilya_tihonov.lesson_9.level_4;

public class FahrenheitConverterTest {

    public static void main(String[] args) {
        FahrenheitConverterTest fahrenheitConverterTest = new FahrenheitConverterTest();
        fahrenheitConverterTest.testConvert();
    }

    public void testConvert() {
        FahrenheitConverter converter = new FahrenheitConverter();
        double result = converter.convert(0);
        if (result != 32) {
            throw new AssertionError("Conversion from Celsius to Fahrenheit failed!");
        }
    }

}
