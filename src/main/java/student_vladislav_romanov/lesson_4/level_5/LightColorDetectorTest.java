package student_vladislav_romanov.lesson_4.level_5;

class LightColorDetectorTest {

    public static void main(String[] args) {
        violetRangeMinTest();
        violetRangeMaxTest();
        blueRangeMinTest();
        blueRangeMaxTest();
        cyanRangeMinTest();
        cyanRangeMaxTest();
        greenRangeMinTest();
        greenRangeMaxTest();
        yellowRangeMinTest();
        yellowRangeMaxTest();
        orangeRangeMinTest();
        orangeRangeMaxTest();
        redRangeMinTest();
        redRangeMaxTest();
        invisibleRangeMinTest();
        invisibleRangeMaxTest();
    }

    static void invisibleRangeMinTest() {
        int wave = 379;
        String expectedResult = "Invisible Light";

        LightColorDetector lightColorDetector = new LightColorDetector();

        String actualResult = lightColorDetector.detect(wave);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Invisible range minimum test PASSED");
        } else {
            System.out.println("Invisible range minimum test FAILED");
        }
    }

    static void invisibleRangeMaxTest() {
        int wave = 761;
        String expectedResult = "Invisible Light";

        LightColorDetector lightColorDetector = new LightColorDetector();

        String actualResult = lightColorDetector.detect(wave);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Invisible range maximum test PASSED");
        } else {
            System.out.println("Invisible range maximum test FAILED");
        }
    }

    static void violetRangeMinTest() {
        int wave = 380;
        String expectedResult = "Violet";

        LightColorDetector lightColorDetector = new LightColorDetector();

        String actualResult = lightColorDetector.detect(wave);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Violet range minimum test PASSED");
        } else {
            System.out.println("Violet range minimum test FAILED");
        }
    }

    static void violetRangeMaxTest() {
        int wave = 449;
        String expectedResult = "Violet";

        LightColorDetector lightColorDetector = new LightColorDetector();

        String actualResult = lightColorDetector.detect(wave);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Violet range maximum test PASSED");
        } else {
            System.out.println("Violet range maximum test FAILED");
        }
    }

    static void blueRangeMinTest() {
        int wave = 450;
        String expectedResult = "Blue";

        LightColorDetector lightColorDetector = new LightColorDetector();

        String actualResult = lightColorDetector.detect(wave);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Blue range minimum test PASSED");
        } else {
            System.out.println("Blue range minimum test FAILED");
        }
    }

    static void blueRangeMaxTest() {
        int wave = 479;
        String expectedResult = "Blue";

        LightColorDetector lightColorDetector = new LightColorDetector();

        String actualResult = lightColorDetector.detect(wave);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Blue range maximum test PASSED");
        } else {
            System.out.println("Blue range maximum test FAILED");
        }
    }

    static void cyanRangeMinTest() {
        int wave = 480;
        String expectedResult = "Cyan";

        LightColorDetector lightColorDetector = new LightColorDetector();

        String actualResult = lightColorDetector.detect(wave);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Cyan range minimum test PASSED");
        } else {
            System.out.println("Cyan range minimum test FAILED");
        }
    }

    static void cyanRangeMaxTest() {
        int wave = 499;
        String expectedResult = "Cyan";

        LightColorDetector lightColorDetector = new LightColorDetector();

        String actualResult = lightColorDetector.detect(wave);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Cyan range maximum test PASSED");
        } else {
            System.out.println("Cyan range maximum test FAILED");
        }
    }

    static void greenRangeMinTest() {
        int wave = 500;
        String expectedResult = "Green";

        LightColorDetector lightColorDetector = new LightColorDetector();

        String actualResult = lightColorDetector.detect(wave);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Green range minimum test PASSED");
        } else {
            System.out.println("Green range minimum test FAILED");
        }
    }

    static void greenRangeMaxTest() {
        int wave = 559;
        String expectedResult = "Green";

        LightColorDetector lightColorDetector = new LightColorDetector();

        String actualResult = lightColorDetector.detect(wave);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Green range maximum test PASSED");
        } else {
            System.out.println("Green range maximum test FAILED");
        }
    }

    static void yellowRangeMinTest() {
        int wave = 560;
        String expectedResult = "Yellow";

        LightColorDetector lightColorDetector = new LightColorDetector();

        String actualResult = lightColorDetector.detect(wave);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Yellow range minimum test PASSED");
        } else {
            System.out.println("Yellow range minimum test FAILED");
        }
    }

    static void yellowRangeMaxTest() {
        int wave = 589;
        String expectedResult = "Yellow";

        LightColorDetector lightColorDetector = new LightColorDetector();

        String actualResult = lightColorDetector.detect(wave);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Yellow range maximum test PASSED");
        } else {
            System.out.println("Yellow range maximum test FAILED");
        }
    }

    static void orangeRangeMinTest() {
        int wave = 590;
        String expectedResult = "Orange";

        LightColorDetector lightColorDetector = new LightColorDetector();

        String actualResult = lightColorDetector.detect(wave);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Orange range minimum test PASSED");
        } else {
            System.out.println("Orange range minimum test FAILED");
        }
    }

    static void orangeRangeMaxTest() {
        int wave = 619;
        String expectedResult = "Orange";

        LightColorDetector lightColorDetector = new LightColorDetector();

        String actualResult = lightColorDetector.detect(wave);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Orange range maximum test PASSED");
        } else {
            System.out.println("Orange range maximum test FAILED");
        }
    }

    static void redRangeMinTest() {
        int wave = 620;
        String expectedResult = "Red";

        LightColorDetector lightColorDetector = new LightColorDetector();

        String actualResult = lightColorDetector.detect(wave);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Red range minimum test PASSED");
        } else {
            System.out.println("Red range minimum test FAILED");
        }
    }

    static void redRangeMaxTest() {
        int wave = 760;
        String expectedResult = "Red";

        LightColorDetector lightColorDetector = new LightColorDetector();

        String actualResult = lightColorDetector.detect(wave);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Red range maximum test PASSED");
        } else {
            System.out.println("Red range maximum test FAILED");
        }
    }
}
