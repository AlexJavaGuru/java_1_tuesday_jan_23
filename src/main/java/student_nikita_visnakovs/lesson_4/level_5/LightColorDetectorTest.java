package student_nikita_visnakovs.lesson_4.level_5;

public class LightColorDetectorTest {

    public static void main(String[] args) {

        LightColorDetectorTest test = new LightColorDetectorTest();

        test.testLightColorViolet();
        test.testLightColorBlue();
        test.testLightColorGreen();
        test.testLightColorYellow();
        test.testLightColorOrange();
        test.testLightColorRed();
        test.testLightColorInvisibleLightFirst();
        test.testLightColorInvisibleLightSecond();

    }

    public void testLightColorViolet() {
        LightColorDetector detector = new LightColorDetector();
        int waveLight = 420;
        String expectedResult = "Violet";
        String actualResult = detector.detectColor(waveLight);
        checkResult(expectedResult, actualResult, "Violet color test");
    }

    public void testLightColorBlue() {
        LightColorDetector detector = new LightColorDetector();
        int waveLight = 455;
        String expectedResult = "Blue";
        String actualResult = detector.detectColor(waveLight);
        checkResult(expectedResult, actualResult, "Blue color test");
    }

    public void testLightColorGreen() {
        LightColorDetector detector = new LightColorDetector();
        int waveLight = 500;
        String expectedResult = "Green";
        String actualResult = detector.detectColor(waveLight);
        checkResult(expectedResult, actualResult, "Green color test");
    }

    public void testLightColorYellow() {
        LightColorDetector detector = new LightColorDetector();
        int waveLight = 580;
        String expectedResult = "Yellow";
        String actualResult = detector.detectColor(waveLight);
        checkResult(expectedResult, actualResult, "Yellow color test");
    }

    public void testLightColorOrange() {
        LightColorDetector detector = new LightColorDetector();
        int waveLight = 595;
        String expectedResult = "Orange";
        String actualResult = detector.detectColor(waveLight);
        checkResult(expectedResult, actualResult, "Orange color test");
    }

    public void testLightColorRed() {
        LightColorDetector detector = new LightColorDetector();
        int waveLight = 625;
        String expectedResult = "Red";
        String actualResult = detector.detectColor(waveLight);
        checkResult(expectedResult, actualResult, "Red color test");
    }

    public void testLightColorInvisibleLightFirst() {
        LightColorDetector detector = new LightColorDetector();
        int waveLight = 379;
        String expectedResult = "Invisible Light";
        String actualResult = detector.detectColor(waveLight);
        checkResult(expectedResult, actualResult, "First invisible light test");
    }

    public void testLightColorInvisibleLightSecond() {
        LightColorDetector detector = new LightColorDetector();
        int waveLight = 751;
        String expectedResult = "Invisible Light";
        String actualResult = detector.detectColor(waveLight);
        checkResult(expectedResult, actualResult, "Second invisible Light test");
    }

    public void checkResult(String expectedResult, String actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected result was " + expectedResult + " but " + "actual result = " + actualResult);
        }
    }
}
