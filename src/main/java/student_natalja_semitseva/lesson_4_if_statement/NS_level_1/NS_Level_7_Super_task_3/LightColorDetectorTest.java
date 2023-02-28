package student_natalja_semitseva.lesson_4_if_statement.NS_level_1.NS_Level_7_Super_task_3;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetector = new LightColorDetectorTest();
        lightColorDetector.testViolet(448);
        lightColorDetector.testBlue(494);
        lightColorDetector.testGreen(567);
        lightColorDetector.testYellow(588);
        lightColorDetector.testOrange(618);
        lightColorDetector.testRed(750);
    }

    public void testViolet(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result.equals("Violet")) {
            checkResult(result == "Violet", " testViolet");
        }
    }

    public void testBlue(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result.equals("Blue")) {
            checkResult(result == "Blue", " testViolet");
        }


    }

    public void testGreen(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result.equals("Green")) {
            checkResult(result == "Green", " testViolet");
        }


    }

    public void testYellow(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result.equals("Yellow")) {
            checkResult(result == "Yellow", " testViolet");
        }

    }

    public void testOrange(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result.equals("Orange")) {
            checkResult(result == "Orange", " testViolet");
        }

    }

    public void testRed(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result.equals("Red")) {
            checkResult(result == "Red", " testViolet");
        }
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(" testName " + " = OK");
        }
    }


}