package student_aleksandrs_lezhennikovs.lesson_4.level_7.task_25;

/*
        Инстанция класса LightColorDetector не имеет состояния,
        она stateless. Найдите в интернете, что такое stateless класс
        в программировании. Найдите способ использовать одну
        инстанцию класса LightColorDetector для всех тестов.
*/

class LightColorDetector {

    public String detect(int wavelength) {

        if (wavelength >= 380 && wavelength <= 449) {
            return "Violet";
        } else if (wavelength >= 450 && wavelength <= 494) {
            return "Blue";
        } else if (wavelength >= 495 && wavelength <= 569) {
            return "Green";
        } else if (wavelength >= 570 && wavelength <= 589) {
            return "Yellow";
        } else if (wavelength >= 590 && wavelength <= 619) {
            return "Orange";
        } else if (wavelength >= 620 && wavelength <= 750) {
            return "Red";
        } else {
            return "Invisible Light";
        }
    }
}


class LightColorDetectorTest {
    public static void main(String[] args) {

        testViolet(405);
        testBlue(475);
        testGreen(505);
        testYellow(585);
        testOrange(619);
        testRed(620);
        testInvisible(760);
    }

    private static String checkColor(int wavelength, String expectedColor) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result == expectedColor) {
            return "LightColorDetector test - " + result + " = OK";
        } else {
            return "LightColorDetector test - " + result + " = FAIL";
        }
    }
    private static void testViolet(int wavelength) {
        System.out.println(checkColor(wavelength, "Violet"));
    }
    private static void testBlue(int wavelength) {
        System.out.println(checkColor(wavelength, "Blue"));
    }
    private static void testGreen(int wavelength) {
        System.out.println(checkColor(wavelength, "Green"));
    }
    private static void testYellow(int wavelength) {
        System.out.println(checkColor(wavelength, "Yellow"));
    }
    private static void testOrange(int wavelength) {
        System.out.println(checkColor(wavelength, "Orange"));
    }
    private static void testRed(int wavelength) {
        System.out.println(checkColor(wavelength, "Red"));
    }
    private static void testInvisible(int wavelength) {
        System.out.println(checkColor(wavelength, "Invisible Light"));
    }
}