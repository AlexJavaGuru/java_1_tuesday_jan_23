package student_natalja_semitseva.lesson_4_if_statement.NS_level_1.Ns_Level_5;


class LightColorDetectorTest {
    public static void main(String[] args) {

        LightColorDetector colorDetector = new LightColorDetector();

        testLightVioletTest();
        testLightBlueTest();
        testLightGreenTest();
        testLightYellowTest();
        testLightOrangeTest();
        testLightInvisibleTest();

    }

    public static void LightColorDetectorTest() {

    }

    public static void testLightVioletTest() {
        LightColorDetector colorDetector = new LightColorDetector();


        int wavelength = 438;
        String expectedResult = "Violet";
        String actualResult = colorDetector.detect(wavelength);
        checkResult(expectedResult, actualResult, " Viole color test");

    }

    public static void testLightBlueTest() {
        LightColorDetector colorDetector = new LightColorDetector();


        int wavelength = 450;
        String expectedResult = "Blue";
        String actualResult = colorDetector.detect(wavelength);
        checkResult(expectedResult, actualResult, " Blue color test");
    }


    public static void testLightGreenTest() {
        LightColorDetector colorDetector = new LightColorDetector();


        int wavelength = 495;
        String expectedResult = "Green";
        String actualResult = colorDetector.detect(wavelength);
        checkResult(expectedResult, actualResult, " Green color test");
    }

    public static void testLightYellowTest() {
        LightColorDetector colorDetector = new LightColorDetector();


        int wavelength = 589;
        String expectedResult = "Yellow";
        String actualResult = colorDetector.detect(wavelength);
        checkResult(expectedResult, actualResult, " Yellow color test");
    }

    public static void testLightOrangeTest() {
        LightColorDetector colorDetector = new LightColorDetector();


        int wavelength = 619;
        String expectedResult = "Orange";
        String actualResult = colorDetector.detect(wavelength);
        checkResult(expectedResult, actualResult, " Orange color test");
    }

    public static void testLightRedTest() {
        LightColorDetector colorDetector = new LightColorDetector();


        int wavelength = 750;
        String expectedResult = "Red";
        String actualResult = colorDetector.detect(wavelength);
        checkResult(expectedResult, actualResult, " Red color test");
    }

    public static void testLightInvisibleTest() {
        LightColorDetector colorDetector = new LightColorDetector();


        int wavelength = 5000;
        String expectedResult = "Invisible Light";
        String actualResult = colorDetector.detect(wavelength);
        checkResult(expectedResult, actualResult, " Invisible Light  test");
    }


    public static void checkResult(String expectedResult, String actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + "failed");
            System.out.println("Expected result" + expectedResult + " but " + "actual result = " + actualResult);

        }
    }

}



