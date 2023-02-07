package student_aleksandrs_lezhennikovs.lesson_4.level_5;

class LightColorDetectorTest {
    public static void main(String[] args) {
    LightColorDetectorTest object = new LightColorDetectorTest();
        System.out.println("Test for wavelength " +  object.check(379, "Invisible light"));
        System.out.println("Test for wavelength " +  object.check(751, "Invisible light"));
        System.out.println("Test for wavelength " +  object.check(449, "Violet"));
        System.out.println("Test for wavelength " +  object.check(494, "Blue"));
        System.out.println("Test for wavelength " +  object.check(569, "Green"));
        System.out.println("Test for wavelength " +  object.check(589, "Yellow"));
        System.out.println("Test for wavelength " +  object.check(619, "Orange"));
        System.out.println("Test for wavelength " +  object.check(750, "Red"));
    }

    String check(int wavelength, String expectedResult) {
        LightColorDetector myDetector = new LightColorDetector();
        String realResult = myDetector.detect(wavelength);
        if (realResult.equals(expectedResult)) {
            return wavelength + " is OK";
        } else {
            return wavelength + " is FAIL";
        }
    }
}
