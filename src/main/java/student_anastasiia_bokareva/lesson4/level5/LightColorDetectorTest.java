package student_anastasiia_bokareva.lesson4.level5;

public class LightColorDetectorTest {
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
        int wavelenght = 380;
        String expectedResult = "Violet";
        LightColorDetector detected = new LightColorDetector();
        String realResult = detected.detect(wavelenght);
        if (expectedResult == realResult) {
            System.out.println("Violet test = OK");
        } else {
            System.out.println("Violet test = FAIL");
        }
    }
    public void blueTest(){
        int wavelenght = 460;
        String expectedResult = "Blue";
        LightColorDetector detected = new LightColorDetector();
        String realResult = detected.detect(wavelenght);
        if (expectedResult == realResult) {
            System.out.println("Blue test = OK");
        } else {
            System.out.println("Blue test = FAIL");
        }
    }
    public void greenTest(){
        int wavelenght = 555;
        String expectedResult = "Green";
        LightColorDetector detected = new LightColorDetector();
        String realResult = detected.detect(wavelenght);
        if (expectedResult == realResult) {
            System.out.println("Green test = OK");
        } else {
            System.out.println("Green test = FAIL");
        }
    }
    public void  yellowTest(){
        int wavelenght = 576;
        String expectedResult = "Yellow";
        LightColorDetector detected = new LightColorDetector();
        String realResult = detected.detect(wavelenght);
        if (expectedResult == realResult) {
            System.out.println("Yellow test = OK");
        } else {
            System.out.println("Yellow test = FAIL");
        }
    }
    public void orangeTest(){
        int wavelenght = 610;
        String expectedResult = "Orange";
        LightColorDetector detected = new LightColorDetector();
        String realResult = detected.detect(wavelenght);
        if (expectedResult == realResult) {
            System.out.println("Orange test = OK");
        } else {
            System.out.println("Orange test = FAIL");
        }
    }
    public void redTest(){
        int wavelenght = 625;
        String expectedResult = "Red";
        LightColorDetector detected = new LightColorDetector();
        String realResult = detected.detect(wavelenght);
        if (expectedResult == realResult) {
            System.out.println("Red test = OK");
        } else {
            System.out.println("Red test = FAIL");
        }
    }
    public void invisibleLightTest(){
        int wavelenght = 760;
        String expectedResult = "Invisible Light";
        LightColorDetector detected = new LightColorDetector();
        String realResult = detected.detect(wavelenght);
        if (expectedResult == realResult) {
            System.out.println("Invisible Light = OK");
        } else {
            System.out.println("Invisible Light = FAIL");
        }
    }



}
