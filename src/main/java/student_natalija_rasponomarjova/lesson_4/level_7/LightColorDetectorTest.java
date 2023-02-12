package student_natalija_rasponomarjova.lesson_4.level_7;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetector = new LightColorDetectorTest();

        lightColorDetector.testViolet(405);
        lightColorDetector.testBlue(475);
        lightColorDetector.testGreen(505);
        lightColorDetector.testYellow(585);
        lightColorDetector.testOrange(619);
        lightColorDetector.testRed(620);
        lightColorDetector.testInvisible(760);
    }

    public void testResults(boolean condition, String testColor) {
        if (condition) {
            System.out.println(testColor + " = OK");
        } else {
            System.out.println(testColor + " = FAILED");
        }
    }

    public void testViolet(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);

        testResults(result.equals("Violet"), "LightColorDetector test - Violet");

    }

    public void testBlue(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);

        testResults(result.equals("Blue"), "LightColorDetector test - Blue");

    }

    public void testGreen(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);

        testResults(result.equals("Green"), "LightColorDetector test - Green");

    }

    public void testYellow(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);

        testResults(result.equals("Yellow"), "LightColorDetector test - Yellow");
    }

    public void testOrange(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);

        testResults(result.equals("Orange"), "LightColorDetector test - Orange");
    }

    public void testRed(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);

        testResults(result.equals("Red"), "LightColorDetector test - Red");

    }

    public void testInvisible(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);

        testResults(result.equals("Invisible Light"), "LightColorDetector test - Invisible Light ");

    }
}












