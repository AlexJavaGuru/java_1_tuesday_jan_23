package student_aleksandrs_lezhennikovs.lesson_4.level_5;

class LigthtColorDetectorDemo {
    public static void main(String[] args) {
        LightColorDetector light = new LightColorDetector();
        String result = light.detect(750);
        System.out.println("LightColorDetector: " + result);
    }
}
