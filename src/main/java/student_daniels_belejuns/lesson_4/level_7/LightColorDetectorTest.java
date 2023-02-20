package student_daniels_belejuns.lesson_4.level_7;



class LightColorDetectorTest {
    public static LightColorDetector lightColorDetector = new LightColorDetector();
    public static void main(String[]args){
test(405, "violet");
test(475, "Blue");
test(505, "Green");
test(585, "Yellow");
test(619, "Orange");
test(620, "Red");
test(760,"Invisible");

    }
public static void test(int wavelength, String expected){
        String result = lightColorDetector.detect(wavelength);
        if(result.equals(expected)) System.out.println("LightColorDetector test " + expected + " = passed");
        else System.out.println("LightColorDetector test " + result + " = failed");
}

}

