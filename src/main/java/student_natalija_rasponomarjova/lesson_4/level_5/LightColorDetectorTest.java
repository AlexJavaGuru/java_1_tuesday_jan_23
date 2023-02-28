package student_natalija_rasponomarjova.lesson_4.level_5;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetector = new LightColorDetectorTest();
        lightColorDetector.testViolet(405);
        lightColorDetector.testBlue(455);
        lightColorDetector.testGreen(560);
        lightColorDetector.testYellow(580);
        lightColorDetector.testOrange(599);
        lightColorDetector.testRed(630);
        lightColorDetector.testInvisible(1000);

    }

    public void testViolet(int waveLength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detectColor(waveLength);
        if (result.equals("Violet")) {
            System.out.println("Violet = test OK");
        } else {
            System.out.println("Violet = test FAILED");
        }
    }

    public void testBlue(int waveLength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detectColor(waveLength);
        if (result.equals("Blue")) {
            System.out.println("Blue = test OK");
        } else {
            System.out.println("Blue = test FAILED");
        }
    }

    public void testGreen(int waveLength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detectColor(waveLength);
        if (result.equals("Green")) {
            System.out.println("Green = test OK");
        } else {
            System.out.println("Green = test FAILED");
        }
    }

    public void testYellow(int waveLength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detectColor(waveLength);
        if (result.equals("Yellow")) {
            System.out.println("Yellow = test OK");
        } else {
            System.out.println("Yellow = test FAILED");
        }
    }

    public void testOrange(int waveLength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detectColor(waveLength);
        if (result.equals("Orange")) {
            System.out.println("Orange = test OK");
        } else {
            System.out.println("Orange = test FAILED");
        }
    }

    public void testRed(int waveLength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detectColor(waveLength);
        if (result.equals("Red")) {
            System.out.println("Red = test OK");
        } else {
            System.out.println("Red = test FAILED");
        }
    }

    public void testInvisible(int waveLength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detectColor(waveLength);
        if (result.equals("Invisible light")) {
            System.out.println("Invisible light = test OK");
        } else {
            System.out.println("Invisible light = test FAILED");
        }
    }

}
