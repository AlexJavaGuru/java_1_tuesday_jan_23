package student_ilya_tihonov.lesson_4.level_5;

import teacher.lesson_4_if_statement.homework.level_7_senior.solutions.super_task_4.LightColorDetector;

public class LightColorDetectorTest {

    public static void main(String[] args){
        LightColorDetectorTest light = new LightColorDetectorTest();
        System.out.println(light.test(14, "Invisible Light"));
        System.out.println(light.test(310, "Invisible Light"));
        System.out.println(light.test(400, "Violet"));
        System.out.println(light.test(477, "Blue"));
        System.out.println(light.test(589, "Yellow"));
        System.out.println(light.test(600, "Orange"));
        System.out.println(light.test(650, "Red"));
        System.out.println(light.test(688, "Red"));
        System.out.println(light.test(722, "Red"));
        System.out.println(light.test(777, "Invisible Light"));
        System.out.println(light.test(1000, "Invisible Light"));
        System.out.println(light.test(1234, "Invisible Light"));

    }
    String test(int wavelength, String expectedResult){
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelength);
        if (realResult.equals(expectedResult)){
            return wavelength + expectedResult + " test - Ok";
        } else {
            return "Test FAIL";
        }
    }

}

