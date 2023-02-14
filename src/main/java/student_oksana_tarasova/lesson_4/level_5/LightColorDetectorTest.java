package student_oksana_tarasova.lesson_4.level_5;

class LightColorDetectorTest {

    public static void main(String[] args) {
        LightColorDetectorTest detectorTest = new LightColorDetectorTest();
        detectorTest.violet();
        detectorTest.blue();
        detectorTest.green();
        detectorTest.yellow();
        detectorTest.orange();
        detectorTest.red();
        detectorTest.invisible();
    }

    LightColorDetector lightColorDetector = new LightColorDetector();

    public void violet() {
        result(lightColorDetector.detect(380).equals("Violet"), "VioletTest");
    }

    public void blue() {
        result(lightColorDetector.detect(450).equals("Blue"), "BlueTest");
    }

    public void green() {
        result(lightColorDetector.detect(495).equals("Green"), "GreenTest");
    }

    public void yellow() {
        result(lightColorDetector.detect(570).equals("Yellow"), "YellowTest");
    }

    public void orange() {
        result(lightColorDetector.detect(590).equals("Orange"), "OrangeTest");
    }

    public void red() {
        result(lightColorDetector.detect(620).equals("Red"), "RedTest");
    }

    public void invisible() {
        result(lightColorDetector.detect(751).equals("Invisible Light"), "InvisibleTest");
    }

    public void result(boolean state, String nameTest) {
        if (state) {
            System.out.println(nameTest + " = OK");
        } else {
            System.out.println(nameTest + " = Fail");
        }
    }
}
