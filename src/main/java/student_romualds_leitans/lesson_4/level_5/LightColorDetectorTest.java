package student_romualds_leitans.lesson_4.level_5;


class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();

        violetTest();
        blueTest();
        greenTest();
        yellowTest();
        orangeTest();
        redTest();
        minwavelenghtTest();
        maxmavelenght();
        }

        private static void violetTest() {
            LightColorDetector lightColorDetector = new LightColorDetector();
            int wavelenght = 449;
            String expectedResult = "Violet";
            String actualResult = lightColorDetector.detect(wavelenght);
            if (expectedResult.equals(actualResult)) {
                System.out.println("Violet");
            } else {
                System.out.println("FAIL");
            }
        }

      private static void blueTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int wavelenght = 470;
        String expectedResult = "Blue";
        String actualResult = lightColorDetector.detect(wavelenght);
        if (expectedResult.equals(actualResult)) {
            System.out.println("Blue");
        } else {
            System.out.println("FAIL");
        }
    }

    private static void greenTest(){
        LightColorDetector lightColorDetector = new LightColorDetector();
        int wavelenght = 530;
        String expectedResult = "Green";
        String actualResult = lightColorDetector.detect(wavelenght);
        if (expectedResult.equals(actualResult)) {
            System.out.println("Green");
        } else {
            System.out.println("FAIL");
        }
    }

    private static void yellowTest(){
        LightColorDetector lightColorDetector = new LightColorDetector();
        int wavelenght = 570;
        String expectedResult = "Yellow";
        String actualResult = lightColorDetector.detect(wavelenght);
        if (expectedResult.equals(actualResult)) {
            System.out.println("Yellow");
        } else {
            System.out.println("FAIL");
        }
    }

    private static void orangeTest(){
        LightColorDetector lightColorDetector = new LightColorDetector();
        int wavelenght = 590;
        String expectedResult = "Orange";
        String actualResult = lightColorDetector.detect(wavelenght);
        if (expectedResult.equals(actualResult)) {
            System.out.println("Orange");
        } else {
            System.out.println("FAIL");
        }
    }

    private static void redTest(){
        LightColorDetector lightColorDetector = new LightColorDetector();
        int wavelenght = 750;
        String expectedResult = "Red";
        String actualResult = lightColorDetector.detect(wavelenght);
        if (expectedResult.equals(actualResult)) {
            System.out.println("Red");
        } else {
            System.out.println("FAIL");
        }
    }
    private  static void minwavelenghtTest(){
        LightColorDetector lightColorDetector = new LightColorDetector();
        int wavelenght = 100;
        String expectedResult = "Min Invisible Light";
        String actualResult = lightColorDetector.detect(wavelenght);
        if (expectedResult.equals(actualResult)) {
            System.out.println("Min Invisible Light");
        } else {
            System.out.println("FAIL");
        }
    }
    private static void maxmavelenght(){
        LightColorDetector lightColorDetector = new LightColorDetector();
        int wavelenght = 9990;
        String expectedResult = "Max Invisible Light";
        String actualResult = lightColorDetector.detect(wavelenght);
        if (expectedResult.equals(actualResult)) {
            System.out.println("Max Invisible Light");
        } else {
            System.out.println("FAIL");
        }
    }

}





















