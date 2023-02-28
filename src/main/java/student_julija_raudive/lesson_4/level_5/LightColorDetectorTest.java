package student_julija_raudive.lesson_4.level_5;


class LightColorDetectorTest {

    private LightColorDetector lightColorDetector = new LightColorDetector();

    public static void main(String[] args) {

        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();

        lightColorDetectorTest.violetTest();
        lightColorDetectorTest.blueTest();
        lightColorDetectorTest.greenTest();
        lightColorDetectorTest.yellowTest();
        lightColorDetectorTest.orangeTest();
        lightColorDetectorTest.redTest();
        lightColorDetectorTest.invisibleLightTest();

    }

    public void violetTest(){
        int wavelength1 = 380;
        int wavelength2 = 449;

        String color1 = lightColorDetector.detect(wavelength1);
        String color2 = lightColorDetector.detect(wavelength2);
        checkResults((color1.equals("Violet")&& color2.equals("Violet")), "Violet test");
    }

    public void blueTest(){
        int wavelength1 = 450;
        int wavelength2 = 494;

        String color1 = lightColorDetector.detect(wavelength1);
        String color2 = lightColorDetector.detect(wavelength2);
        checkResults((color1.equals("Blue")&& color2.equals("Blue")), "Blue test");
     }

    public void greenTest(){
        int wavelength1 = 495;
        int wavelength2 = 569;

        String color1 = lightColorDetector.detect(wavelength1);
        String color2 = lightColorDetector.detect(wavelength2);
        checkResults((color1.equals("Green")&& color2.equals("Green")), "Green test");

     }

    public void yellowTest(){
        int wavelength1 = 570;
        int wavelength2 = 589;

        String color1 = lightColorDetector.detect(wavelength1);
        String color2 = lightColorDetector.detect(wavelength2);
        checkResults((color1.equals("Yellow")&& color2.equals("Yellow")), "Yellow test");

     }

    public void orangeTest(){
        int wavelength1 = 590;
        int wavelength2 = 619;

        String color1 = lightColorDetector.detect(wavelength1);
        String color2 = lightColorDetector.detect(wavelength2);
        checkResults((color1.equals("Orange")&& color2.equals("Orange")), "Orange test");

     }

    public void redTest(){
        int wavelength1 = 620;
        int wavelength2 = 750;

        String color1 = lightColorDetector.detect(wavelength1);
        String color2 = lightColorDetector.detect(wavelength2);
        checkResults((color1.equals("Red")&& color2.equals("Red")), "Red test");

    }

    public void invisibleLightTest(){
        int wavelength1 = 379;
        int wavelength2 = 751;

        String color1 = lightColorDetector.detect(wavelength1);
        String color2 = lightColorDetector.detect(wavelength2);
        checkResults((color1.equals("Invisible Light")&& color2.equals("Invisible Light")), "Invisible Light test");

     }

    private void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
        }
    }



}
