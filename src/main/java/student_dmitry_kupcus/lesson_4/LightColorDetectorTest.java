package student_dmitry_kupcus.lesson_4;

class LightColorDetectorTest {
    private LightColorDetector lightColorDetector = new LightColorDetector();

    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetector = new LightColorDetectorTest();
        lightColorDetector.testViolet(380);
        lightColorDetector.testBlue(450);
        lightColorDetector.testGreen(495);
        lightColorDetector.testYellow(570);
        lightColorDetector.testOrange(590);
        lightColorDetector.testRed(620);
        lightColorDetector.testInvisible(751);

    }
    public void testViolet(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        checkResults(result.equals("Violet"), "LightColorTest test - Violet color");
    }
    public void testBlue(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        checkResults(result.equals("Blue"), "LightColorTest test - Blue color");
    }
    public void testGreen(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        checkResults(result.equals("Blue"), "LightColorTest test - Green color");
    }
    public void testYellow(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        checkResults(result.equals("Blue"), "LightColorTest test - Yellow color");
    }
    public void testOrange(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        checkResults(result.equals("Blue"), "LightColorTest test - Orange color");
    }
    public void testRed(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        checkResults(result.equals("Blue"), "LightColorTest test - Red color");
    }
    public void testInvisible(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        checkResults(result.equals("Blue"), "LightColorTest test - Invisible");
    }

    public void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = OK");
        }
    }
}
