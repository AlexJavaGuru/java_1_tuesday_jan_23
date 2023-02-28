package student_andrejs_cekalins.lesson_4.level_7.Task_25;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.isVioletTest(449);
        lightColorDetectorTest.isBlueTest(450);
        lightColorDetectorTest.isGreenTest(569);
        lightColorDetectorTest.isYellowTest(589);
        lightColorDetectorTest.isOrangeTest(619);
        lightColorDetectorTest.isRedTest(620);
        lightColorDetectorTest.isInvisibleLightTest(1);
    }

    public void isVioletTest(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        checkResults(result == "Violet", "isViolet test");
    }

    public void isBlueTest(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        checkResults(result == "Blue", "isBlue test");
    }

    public void isGreenTest(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        checkResults(result == "Green", "isGreen test");
    }

    public void isYellowTest(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        checkResults(result == "Yellow", "isYellow test");
    }

    public void isOrangeTest(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        checkResults(result == "Orange", "isOrange test");
    }

    public void isRedTest(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        checkResults(result == "Red", "isRed test");
    }

    public void isInvisibleLightTest(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        checkResults(result == "Invisible Light", "isInvisibleLight test");
    }

    private void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = Fail");
        }
    }
}
