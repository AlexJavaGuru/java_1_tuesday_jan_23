package student_oleg_gryazev.lesson_4.level_5;

public class LightColorDetector {

    int wavelength;

    public String detect(int wavelength) {
        if (wavelength >= 380 && wavelength <= 449) {
            System.out.println("Violet");
            return "Violet";
        } else if (wavelength >= 450 && wavelength <= 494) {
            System.out.println("Blue");
            return "Blue";
        } else if (wavelength >= 495 && wavelength <= 569) {
            System.out.println("Green");
            return "Green";
        } else if (wavelength >= 570 && wavelength <= 589) {
            System.out.println("Yellow");
            return "Yellow";
        } else if (wavelength >= 590 && wavelength <= 619) {
            System.out.println("Orange");
            return "Orange";
        }
        if (wavelength >= 620 && wavelength <= 750) {
            System.out.println("Red");
            return "Red";
        } else
            return "Invisible";
    }

    void testVisibleSpectrum() {
        for (int i = 380; i < 751; i++) {
            detect(i);
            i++;
        }
    }

    void testInvisibleSpectrumBelow() {
        for (int i = 0; i < 380; i++) {
            detect(i);
            if (i > 0) {
                System.out.println("Spectrum from 0 to 380 wavelenght is invisible");
            }
        }
    }

    void testInvisibleSpectrum() {
        for (int j = 750; j < 1000; j++) {
            detect(j);
            if (j > 750) {
                System.out.println("Spectrum from 751 to 1000 wavelenght is invisible");
            }
        }
    }
}

