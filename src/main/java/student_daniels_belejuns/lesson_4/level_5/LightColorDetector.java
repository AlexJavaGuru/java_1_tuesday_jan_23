package student_daniels_belejuns.lesson_4.level_5;

public class LightColorDetector {
    public String detect(int wavelength) {
        if (wavelength >= 380 && wavelength <= 449) {
            return "Violet";
        } else if (wavelength >= 450 && wavelength <= 479) {
            return "Blue";
        } else if (wavelength >= 480 && wavelength <= 499) {
            return "Cyan";
        } else if (wavelength >= 500 && wavelength <= 559) {
            return "Green";
        } else if (wavelength >= 560 && wavelength <= 589) {
            return "Yellow";
        } else if (wavelength >= 590 && wavelength <= 619) {
            return "Orange";
        } else if (wavelength >= 620 && wavelength <= 760) {
            return "Red";
        } else {
            return "Invisible Light";
        }
    }

}
