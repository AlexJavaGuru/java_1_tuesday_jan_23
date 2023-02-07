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
        LightColorDetectorTest lightColorDetector = new LightColorDetectorTest();

        lightColorDetector.testViolet(405);
        lightColorDetector.testBlue(475);
        lightColorDetector.testGreen(505);
        lightColorDetector.testYellow(585);
        lightColorDetector.testOrange(619);
        lightColorDetector.testRed(620);
        lightColorDetector.testInvisible(760);
    }

    String checkColor(int wavelength, String expectedColor) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result == expectedColor) {
            return "LightColorDetector test - " + result + " = OK";
        } else {
            return "LightColorDetector test - " + result + " = FAIL";
        }
    }
    public void testViolet(int wavelength) {
        System.out.println(checkColor(wavelength, "Violet"));
    }
    public void testBlue(int wavelength) {
        System.out.println(checkColor(wavelength, "Blue"));
    }
    public void testGreen(int wavelength) {
        System.out.println(checkColor(wavelength, "Green"));
    }
    public void testYellow(int wavelength) {
        System.out.println(checkColor(wavelength, "Yellow"));
    }
    public void testOrange(int wavelength) {
        System.out.println(checkColor(wavelength, "Orange"));
    }
    public void testRed(int wavelength) {
        System.out.println(checkColor(wavelength, "Red"));
    }
    public void testInvisible(int wavelength) {
        System.out.println(checkColor(wavelength, "Invisible Light"));
    }
}