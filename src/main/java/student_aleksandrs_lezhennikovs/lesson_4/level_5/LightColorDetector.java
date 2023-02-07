package student_aleksandrs_lezhennikovs.lesson_4.level_5;

class LightColorDetector {
    String detect(int wavelength) {
        if (wavelength >= 380 && wavelength <= 449) {
            return "Violet";
        } else if (wavelength > 449 && wavelength <= 494) {
            return "Blue";
        } else if (wavelength > 494 && wavelength <= 569) {
            return "Green";
        } else if (wavelength > 569 && wavelength <= 589) {
            return "Yellow";
        } else if (wavelength > 589 && wavelength <= 619) {
            return "Orange";
        } else if (wavelength > 620 && wavelength <= 750) {
            return "Red";
        } else {
            return "Invisible light";
        }
    }
}
