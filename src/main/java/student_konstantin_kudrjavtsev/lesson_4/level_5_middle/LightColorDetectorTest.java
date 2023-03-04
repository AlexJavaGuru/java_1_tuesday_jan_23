package student_konstantin_kudrjavtsev.lesson_4.level_5_middle;

class LightColorDetectorTest {
    public static void main(String[] args) {
        testLightColorVioletTest();
        testLightColorBlueTest();
        testLightColorGreenTest();
        testLightColorYellowTest();
        testLightColorOrangeTest();
        testLightColorRedTest();
        testInvisibleLightTest1();
        testInvisibleLightTest2();
    }

    private static void testLightColorVioletTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int wavelength = 420;
        String expectedResult = "Violet";
        String actualResult = lightColorDetector.detect(wavelength);
        checkResult(expectedResult, actualResult, "Test Violet Color - ");

    }

    private static void testLightColorBlueTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int wavelength = 470;
        String expectedResult = "Blue";
        String actualResult = lightColorDetector.detect(wavelength);
        checkResult(expectedResult, actualResult, "Test Blue Color - ");
    }
    private static void testLightColorYellowTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int wavelength = 575;
        String expectedResult = "Yellow";
        String actualResult = lightColorDetector.detect(wavelength);
        checkResult(expectedResult, actualResult, "Test Yellow Color - ");
    }
    private static void testLightColorOrangeTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int wavelength = 610;
        String expectedResult = "Orange";
        String actualResult = lightColorDetector.detect(wavelength);
        checkResult(expectedResult, actualResult, "Test Orange Color - ");
    }
    private static void testLightColorRedTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int wavelength = 653;
        String expectedResult = "Red";
        String actualResult = lightColorDetector.detect(wavelength);
        checkResult(expectedResult, actualResult, "Test Red Color - ");
    }
    private static void testLightColorGreenTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int wavelength = 505;
        String expectedResult = "Green";
        String actualResult = lightColorDetector.detect(wavelength);
        checkResult(expectedResult, actualResult, "Test Green Color - ");
    }
    private static void testInvisibleLightTest1() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int wavelength = 379;
        String expectedResult = "Invisible Light";
        String actualResult = lightColorDetector.detect(wavelength);
        checkResult(expectedResult, actualResult, "Test Invisible Light - ");
    }
    private static void testInvisibleLightTest2() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int wavelength = 751;
        String expectedResult = "Invisible Light";
        String actualResult = lightColorDetector.detect(wavelength);
        checkResult(expectedResult, actualResult, "Test Invisible Light - ");
    }
    private static void checkResult(String expectedResult, String actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println("Test: " + testName + " Test has passed");
        } else {
            System.out.println("Test: " + testName + " Test failed");
            System.out.println("Expected: " + expectedResult + ",but actual: " + actualResult);
        }
    }
}