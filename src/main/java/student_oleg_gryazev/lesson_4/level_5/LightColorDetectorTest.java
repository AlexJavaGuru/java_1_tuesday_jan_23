package student_oleg_gryazev.lesson_4.level_5;

public class LightColorDetectorTest {

    LightColorDetector detector = new LightColorDetector();

    void testVisibleSpectrum() {
        for (int i = 380; i < 751; i++) {
            detector.detect(i);
            System.out.println("Wave " + i + " is within 380 to 751 visible spectrum ");

        }
    }

    void testInvisibleSpectrumBelow() {
        for (int i = 0; i < 380; i++) {
            detector.detect(i);
            if (i > 0) {
                System.out.println("Wave " + i + " is within 0 to 380 invisible spectrum ");
            }
        }
    }

    void testInvisibleSpectrum() {
        for (int j = 750; j < 1001; j++) {
            detector.detect(j);
            if (j > 750) {
                System.out.println("Wave " + j + " is within 751 to 1000 invisible spectrum");
            }
        }
    }

    public static void main(String[] args) {

        LightColorDetectorTest test = new LightColorDetectorTest();
        test.testVisibleSpectrum();
        test.testInvisibleSpectrumBelow();
        test.testInvisibleSpectrum();

    }

}