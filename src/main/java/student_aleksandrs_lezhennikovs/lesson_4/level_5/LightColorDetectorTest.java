package student_aleksandrs_lezhennikovs.lesson_4.level_5;

class LightColorDetectorTest {
    public static void main(String[] args) {
    LightColorDetectorTest object = new LightColorDetectorTest();
        System.out.println("Test for wavelength " +  object.check(101, "Invisible light"));
        System.out.println("Test for wavelength " +  object.check(379, "Invisible light"));
        System.out.println("Test for wavelength " +  object.check(380, "Violet"));
        System.out.println("Test for wavelength " +  object.check(449, "Violet"));
        System.out.println("Test for wavelength " +  object.check(450, "Blue"));
        System.out.println("Test for wavelength " +  object.check(494, "Blue"));
        System.out.println("Test for wavelength " +  object.check(495, "Green"));
        System.out.println("Test for wavelength " +  object.check(569, "Green"));
        System.out.println("Test for wavelength " +  object.check(570, "Yellow"));
        System.out.println("Test for wavelength " +  object.check(589, "Yellow"));
        System.out.println("Test for wavelength " +  object.check(590, "Orange"));
        System.out.println("Test for wavelength " +  object.check(619, "Orange"));
        System.out.println("Test for wavelength " +  object.check(620, "Red"));
        System.out.println("Test for wavelength " +  object.check(750, "Red"));
        System.out.println("Test for wavelength " +  object.check(751, "Invisible light"));
        System.out.println("Test for wavelength " +  object.check(1000, "Invisible light"));

    }

    String check(int wavelength, String expectedResult) {
        LightColorDetector myDetector = new LightColorDetector();
        String realResult = myDetector.detect(wavelength);
        if (realResult.equals(expectedResult)) {
            return wavelength + " expected color " + expectedResult + " is OK";
        } else {
            return wavelength + " expected color " + expectedResult + " is FAIL";
        }
    }
}
