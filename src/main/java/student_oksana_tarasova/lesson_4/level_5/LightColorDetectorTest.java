package student_oksana_tarasova.lesson_4.level_5;

class LightColorDetectorTest {

    public static void main(String[] args) {
        LightColorDetectorTest detectorTest = new LightColorDetectorTest();
        detectorTest.violet();
        detectorTest.violet2();
        detectorTest.blue();
        detectorTest.blue2();
        detectorTest.green();
        detectorTest.green2();
        detectorTest.yellow();
        detectorTest.yellow2();
        detectorTest.orange();
        detectorTest.orange2();
        detectorTest.red();
        detectorTest.red2();
        detectorTest.invisible();
    }

    public void violet() {
        int wavelength = 380;
        String expectedResult = "Violet";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (expectedResult == realResult) {
            System.out.println("Violet = OK");
        }  else {
            System.out.println("Violet = FAIL");
        }
    }

    public void violet2() {
        int wavelength = 449;
        String expectedResult = "Violet";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (expectedResult == realResult) {
            System.out.println("Violet = OK");
        }  else {
            System.out.println("Violet = FAIL");
        }
    }

    public void blue() {
        int wavelength = 450;
        String expectedResult = "Blue";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (expectedResult == realResult) {
            System.out.println("Blue = OK");
        }  else {
            System.out.println("Blue = FAIL");
        }
    }

    public void blue2() {
        int wavelength = 494;
        String expectedResult = "Blue";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (expectedResult == realResult) {
            System.out.println("Blue = OK");
        }  else {
            System.out.println("Blue = FAIL");
        }
    }

    public void green() {
        int wavelength = 495;
        String expectedResult = "Green";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (expectedResult == realResult) {
            System.out.println("Green = OK");
        }  else {
            System.out.println("Green = FAIL");
        }
    }

    public void green2() {
        int wavelength = 569;
        String expectedResult = "Green";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (expectedResult == realResult) {
            System.out.println("Green = OK");
        }  else {
            System.out.println("Green = FAIL");
        }
    }

    public void yellow() {
        int wavelength = 570;
        String expectedResult = "Yellow";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (expectedResult == realResult) {
            System.out.println("Yellow = OK");
        }  else {
            System.out.println("Yellow = FAIL");
        }
    }

    public void yellow2() {
        int wavelength = 589;
        String expectedResult = "Yellow";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (expectedResult == realResult) {
            System.out.println("Yellow = OK");
        }  else {
            System.out.println("Yellow = FAIL");
        }
    }

    public void orange() {
        int wavelength = 590;
        String expectedResult = "Orange";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (expectedResult == realResult) {
            System.out.println("Orange = OK");
        }  else {
            System.out.println("Orange = FAIL");
        }
    }

    public void orange2() {
        int wavelength = 619;
        String expectedResult = "Orange";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (expectedResult == realResult) {
            System.out.println("Orange = OK");
        }  else {
            System.out.println("Orange = FAIL");
        }
    }

    public void red() {
        int wavelength = 620;
        String expectedResult = "Red";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (expectedResult == realResult) {
            System.out.println("Red = OK");
        }  else {
            System.out.println("Red = FAIL");
        }
    }

    public void red2() {
        int wavelength = 750;
        String expectedResult = "Red";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (expectedResult == realResult) {
            System.out.println("Red = OK");
        }  else {
            System.out.println("Red = FAIL");
        }
    }

    public void invisible() {
        int wavelength = 751;
        String expectedResult = "Invisible Light";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (expectedResult == realResult) {
            System.out.println("Invisible = OK");
        }  else {
            System.out.println("Invisible = FAIL");
        }
    }
}
