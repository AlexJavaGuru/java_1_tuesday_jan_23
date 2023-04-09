package student_oksana_tarasova.Lesson_9.level_4;

public class TemperatureConverterTest {

    public static void main(String[] args) {
        TemperatureConverterTest test = new TemperatureConverterTest();
        test.fahrenheitConverterTest();
        test.kelvinConverterTest();
    }

    public void fahrenheitConverterTest() {
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        double expectedResult = 59.18;
        double realResult = fahrenheitConverter.convert(15.1);
        check(expectedResult == realResult, "fahrenheitConverter test ");
    }

    public void kelvinConverterTest() {
        KelvinConverter kelvinConverter = new KelvinConverter();
        double expectedResult = 288.65;
        double realResult = kelvinConverter.convert(15.5);
        check(expectedResult == realResult, "kelvinConverter test ");
    }

    public void check(boolean state, String nameTest) {
        if (state) {
            System.out.println(nameTest + " = ok");
        } else {
            System.out.println(nameTest + " = fail");
        }
    }
}
