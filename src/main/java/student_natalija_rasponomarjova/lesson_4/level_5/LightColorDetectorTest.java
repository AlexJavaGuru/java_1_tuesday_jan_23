package student_natalija_rasponomarjova.lesson_4.level_5;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetector colorDetector = new LightColorDetector();
        String color = colorDetector.detectColor(600);
        System.out.println("Color is : " + color);

        System.out.println(colorDetector.checkWaveLength(600, "Violet"));


    }
}
