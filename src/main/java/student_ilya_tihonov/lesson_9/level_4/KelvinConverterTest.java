package student_ilya_tihonov.lesson_9.level_4;

public class KelvinConverterTest {

    public static void main(String[] args) {
        KelvinConverterTest kelvinConverterTest = new KelvinConverterTest();
        kelvinConverterTest.testConvert();
    }

    static void testConvert() {
        KelvinConverter converter = new KelvinConverter();
        double result = converter.convert(0);
        if (result != 273.15) {
            throw new AssertionError("Conversion from Celsius to Kelvin failed!");
        }
    }
}


