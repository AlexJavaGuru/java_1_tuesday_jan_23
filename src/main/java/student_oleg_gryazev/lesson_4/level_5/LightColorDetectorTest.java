package student_oleg_gryazev.lesson_4.level_5;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetector detector = new LightColorDetector();
        detector.testVisibleSpectrum();
        detector.testInvisibleSpectrumBelow();
        detector.testInvisibleSpectrum();
    }
}
